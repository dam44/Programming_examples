/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;
import databaseManagement.*;


public class CreateMonster {
    Monster newMonster;
    Worth worth = new Worth();
    String name = new String();
    PersistManager persistIt = new PersistManager();
    public CreateMonster(MyUser user, String monsterName) {
        persistIt.init();
        Monster monster = MonsterFactory.makeIt(monsterName, 100, 100, 100, 100, user.getUsername());
        persistIt.create(monster);
        persistIt.shutdown();
        worth.UpdateMonsterWorth(monster);
    }
}

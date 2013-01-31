/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import databaseManagement.*;

/**
 *
 * @author dam44
 */
public class Trade {
    
    private PersistManager persistIt = new PersistManager();
    
    public Trade(Monster monster1, Monster monster2) {
        persistIt.init();
        String temp = monster1.getOwner();
        monster1.setOwner(monster2.getOwner());
        monster2.setOwner(temp);
        persistIt.update(monster1);
        persistIt.update(monster2);
        persistIt.shutdown();
    }
}

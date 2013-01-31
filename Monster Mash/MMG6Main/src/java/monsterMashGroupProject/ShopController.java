/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import databaseManagement.Monster;
import databaseManagement.MyUser;
import databaseManagement.PersistManager;
import java.util.List;

/**
 *
 * @author jamesslater
 */
public class ShopController {

    PersistManager pesMan = new PersistManager();
    Monster monster;
    MyUser user;

    public Monster getShopMonsters(int x) {

        pesMan.init();

        List<Monster> mon = pesMan.searchMonsters("");

        return mon.get(x);
    }

    public int getNumOfItems() {
        pesMan.init();

        List<Monster> mon = pesMan.searchMonsters("");

        //pesMan.shutdown();

        return mon.size();
    }

    public String buyMonster(String monsterID, String usr) {

        Shop shp = new Shop();

        pesMan.init();

        List<Monster> mon = pesMan.searchMonsters("");

        for (int i = 0; i < mon.size(); i++) {
            if (mon.get(i).getId() == Integer.parseInt(monsterID)) {
                monster = mon.get(i);
            }
        }


        List<MyUser> users = pesMan.searchUsers();
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getUsername().equals(usr))) {
                user = users.get(i);
            }
        }
        
        shp.BuyMonster(monster, user);

        //pesMan.shutdown();
        return "shop_buy.jsp";
    }
    
    public String sellMonster(String monsterID){
        
        Shop shp = new Shop();

        pesMan.init();
        
        List<Monster> mon = pesMan.searchMonsters("");

        for (int i = 0; i < mon.size(); i++) {
            if (mon.get(i).getId() == Integer.parseInt(monsterID)) {
                monster = mon.get(i);
            }
        }
        shp.SellMonster(monster);
        
        pesMan.shutdown();
        
        return "shop_sell.jsp";
    }
}

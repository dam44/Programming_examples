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
public class UserController {
    
  MyUser theUsr;
  int choice1;
  int choice2;
  String childName;
  Monster childMon = null;
  
  PersistManager pesMan = new PersistManager();

    public int getChoice1() {
        return choice1;
    }

    public void setChoice1(int choice1) {
        this.choice1 = choice1;
    }

    public int getChoice2() {
        return choice2;
    }

    public void setChoice2(int choice2) {
        this.choice2 = choice2;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Monster getChildMon() {
        
        
        return childMon;
    }

    public void setChildMon(Monster childMon) {
        this.childMon = childMon;
    }
  
    public MyUser getTheUsr() {
        return theUsr;
    }

    public String setTheUsr(Login log) {
        this.theUsr = log.user;
        return "";
    }
  
    public Monster getMonster(int num){
        
        pesMan.init();
        
        List<Monster> mon = pesMan.searchMonsters(theUsr.getUsername());
        
        
        
        return mon.get(num);
        
    }
    public String bread(){
        
        Breed breed = new Breed();
        
        pesMan.init();
        
        List<Monster> mon = pesMan.searchMonsters(theUsr.getUsername());
      
      childMon = breed.breedMonsters(mon.get(choice1), mon.get(choice2), childName, theUsr.getUsername(), true);
      
        
        return "farm.jsp";
    }
    
    public int getNumOfMonsters(){
        
        pesMan.init();
        
        List<Monster> mon = pesMan.searchMonsters(theUsr.getUsername());
        
        return mon.size();
    }
    
    public String sellMonster(int x){
        
        
        return "";
    }
    
    public int getMoney() {
        return theUsr.getVirtualMoney();
    }
    
    public int getNumOfFriends(){
        return theUsr.getFriends().size();
    }
}

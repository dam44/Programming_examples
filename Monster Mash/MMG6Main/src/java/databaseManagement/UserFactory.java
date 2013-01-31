/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseManagement;

/**
 *
 * @author Dan
 */
public class UserFactory {
     
    
    public static MyUser makeIt(String name, String password, int virtualMoney) {
        MyUser newUser = new MyUser();
        newUser.setUsername(name);
        newUser.setUserPassword(password);
        newUser.setVirtualMoney(virtualMoney);
        return newUser;
    }
   
}

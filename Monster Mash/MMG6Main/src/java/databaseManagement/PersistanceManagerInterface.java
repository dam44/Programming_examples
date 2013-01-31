/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseManagement;

import java.util.List;

/**
 * PersistanceManager Interface.
 * @author Dan
 */
public interface PersistanceManagerInterface {

    public void init();

    public void create(Monster monster);

    public void create(MyUser user);

    public boolean update(MyUser user);

    public boolean update(Monster monster);

    public boolean remove(MyUser user);

    public boolean remove(Monster monster);

    public List<Monster> search(String username);

    public List<MyUser> search();

    public void shutdown();
    
    public void addToShop(Monster monster);
    
    public void removeFromShop(Monster monster);
    
    public List<Monster> getAllShop();
}

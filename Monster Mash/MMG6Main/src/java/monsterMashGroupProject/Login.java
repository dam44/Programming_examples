/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import Scheduling.LogginChecker;
import Scheduling.MonsterLifeCycle;
import databaseManagement.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author dam44
 */
public class Login {

    PersistManager persistIt = new PersistManager();
    private static final String REGEX = "([0-9a-zA-Z_-!?@]+)";
    private String username;
    private String password;
    public MyUser user;

    public MyUser getUser() {
        return user;
    }

    public void setUser(MyUser user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String LoginUser() {
        persistIt.init();
        List<MyUser> users = persistIt.searchUsers();
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getUsername().equals(username)) && (users.get(i).getUserPassword().equals(password))) {
                user = users.get(i);
                user.setIsLoggedIn(true);
                user.setIsActive(true);
                persistIt.update(user);
                new LogginChecker(600, user);
                new MonsterLifeCycle(60, user);
                return "welcome.jsp";
            }
        }
        persistIt.shutdown();
        return "index.jsp";
    }

    public String LogOff() {
        persistIt.init();
        List<MyUser> users = persistIt.searchUsers();
        for (int i = 0; i < users.size(); i++) {
            if ((users.get(i).getUsername().equals(username)) && (users.get(i).getUserPassword().equals(password))) {
                user = users.get(i);
                user.setIsLoggedIn(false);
                user.setIsActive(false);
                persistIt.update(user);
                return "welcome.jsp";
            }
        }
        persistIt.shutdown();
        return "index.jsp";
    }

    public String Register(String usrname, String usrpassword, String email) {
        persistIt.init();
        //if ((matches(REGEX, name.toString()) == true) && (matches(REGEX, password.toString()) == true)) {
        MyUser myUser = UserFactory.makeIt(usrname, usrpassword, 100);

        persistIt.create(myUser);
        Monster gary = MonsterFactory.makeIt("Gary", 10, 10, 10, 10, usrname);
        persistIt.create(gary);
        //}
        persistIt.shutdown();
        return "index.jsp";
    }

    public boolean matches(String regex, String input) {
        return Pattern.matches(regex, input);
    }
}

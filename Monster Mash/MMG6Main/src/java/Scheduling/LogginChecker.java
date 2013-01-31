/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scheduling;

/**
 *
 * @author dam44
 */
import java.util.Timer;
import java.util.TimerTask;
import databaseManagement.*;
import java.util.List;
import monsterMashGroupProject.Login;

public class LogginChecker {

    private Timer timer;

    public LogginChecker(int seconds, MyUser user) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new Task(user), seconds * 1000, seconds * 1000);
    }

    class Task extends TimerTask {

        MyUser user;

        public Task(MyUser user) {
            this.user = user;
        }

        @Override
        public void run() {
            PersistManager persistIt = new PersistManager();
            persistIt.init();
            List<MyUser> users = persistIt.searchUsers();
            for (int i = 0; i < users.size(); i++) {
                if ((users.get(i).getUsername().equals(user.getUsername())) && (users.get(i).getUserPassword().equals(user.getUsername()))) {
                    user = users.get(i);
                    if (user.isIsActive() == false) {
                        user.setIsLoggedIn(false);
                        persistIt.update(user);
                        timer.cancel();
                        Login login = new Login();
                        login.LogOff();
                    } else {
                        user.setIsActive(false);
                    }
                }
            }
            persistIt.shutdown();
        }
    }
}

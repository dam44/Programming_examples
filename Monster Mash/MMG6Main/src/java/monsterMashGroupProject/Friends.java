/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

import databaseManagement.*;

/**
 *
 * @author Dan
 */
public class Friends {

    private PersistManager persistIt = new PersistManager();

    /**
     * Sends a request to another user, request appears in recipients request
     * list.
     *
     * @param requester
     * @param recipient
     */
    public void sendRequest(MyUser requester, MyUser recipient) {
        persistIt.init();
        recipient.getRequests().set(recipient.getRequests().size(), requester);
        requester.setIsActive(true);
        persistIt.update(recipient);
        persistIt.shutdown();
    }

    /**
     * Allows a user to accept a request, request is removed from request list
     * and added to friends list.
     *
     * @param requester
     * @param recipient
     */
    public void acceptRequest(MyUser requester, MyUser recipient) {
        persistIt.init();
        for (int i = 0; i < recipient.getRequests().size(); i++) {
            if (recipient.getRequests().get(i).getUsername().equals(requester.getUsername())) {
                recipient.getRequests().remove(i);
            }
        }
        recipient.getFriends().set(recipient.getFriends().size(), requester);
        requester.getFriends().set(requester.getFriends().size(), recipient);
        recipient.setIsActive(true);
        persistIt.update(recipient);
        persistIt.update(requester);
        persistIt.shutdown();
    }

    /**
     * Allows the user to reject a request, request is removed from request
     * list, requester is not alerted.
     *
     * @param requester
     * @param recipient
     */
    public void rejectRequest(MyUser requester, MyUser recipient) {
        persistIt.init();
        for (int i = 0; i < recipient.getRequests().size(); i++) {
            if (recipient.getRequests().get(i).getUsername().equals(requester.getUsername())) {
                recipient.getRequests().remove(i);
            }
        }
        recipient.setIsActive(true);
        persistIt.update(recipient);
        persistIt.update(requester);
        persistIt.shutdown();
    }

    /**
     * Allows the user to remove a friend. The friend is removed from the users friends list,
     * the user is also removed from the friends friends list.
     *
     * @param user
     * @param friend
     */
    public void removeFriend(MyUser user, MyUser friend) {
        persistIt.init();
        for (int i = 0; i < user.getFriends().size(); i++) {
            if (user.getFriends().get(i).getUsername().equals(friend.getUsername())) {
                user.getFriends().remove(i);
            }
        }
        for (int i = 0; i < friend.getFriends().size(); i++) {
            if (friend.getFriends().get(i).getUsername().equals(user.getUsername())) {
                friend.getFriends().remove(i);
            }
        }
        user.setIsActive(true);
        persistIt.update(user);
        persistIt.shutdown();
    }
}

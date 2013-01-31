/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monsterMashGroupProject;

/**
 *
 * @author jamesslater
 */
public class RegisterInfo {
    
    private String regUsername;
    
    private String regPassword;
    
    private String regEmail;

    public String getRegUsername() {
        return regUsername;
    }

    public void setRegUsername(String regUsername) {
        this.regUsername = regUsername;
    }

    public String getRegPassword() {
        return regPassword;
    }

    public void setRegPassword(String regPassword) {
        this.regPassword = regPassword;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }
    
    public String addUser(){
        Login log = new Login();
        
        log.Register(regUsername, regPassword, regEmail);
        
        return "index.jsp";
    }
    
}

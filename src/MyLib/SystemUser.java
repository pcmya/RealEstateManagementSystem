/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Christian Aranza
 */
public abstract class SystemUser {
    private String password;
    
    public SystemUser(String password) {
        this.password = password;
    }
    
    public abstract boolean login();

    public String getPassword() {
        return password;
    }
    
}


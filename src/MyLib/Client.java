/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Christian Aranza
 */
public class Client extends SystemUser {
    private String email;
    private String username;
    private String celNum;

    public Client(String name, String email, String username, String password, String celNum) {
        super(name, password);
        this.email = email;
        this.username = username;
        this.celNum = celNum;
    }
    
    public boolean login(String username, String password) {
        return this.username.equals(username) &&
                this.getPassword().equals(password);
    }
}

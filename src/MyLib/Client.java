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
    private String name;
    private String email;
    private String username;
    private String celNum;

    public Client(String name, String email, String username, String password, String celNum) {
        super(password);
        this.name = name;
        this.email = email;
        this.username = username;
        this.celNum = celNum;
    }
    
    public boolean login(String username, String password) {
        return this.username.equals(username) &&
                this.getPassword().equals(password);
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String username() {
        return username;
    }
    
    public String getCelNum() {
        return celNum;
    }
    
}

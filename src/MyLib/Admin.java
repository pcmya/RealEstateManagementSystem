/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author Christian Aranza
 */
public class Admin extends SystemUser {
    private int adminID;
    
    public Admin(int adminID, String name, String password) {
        super(name, password);
        this.adminID = adminID;
    }
    
    public boolean login(int adminID, String password) {
        return this.adminID == adminID &&
                this.getPassword().equals(password);
    }
    
    public int getAdmin() {
        return adminID;
    }
    
    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }
}

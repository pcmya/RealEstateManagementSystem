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
    
    public Admin(int adminID, String password) {
        super(password);
        this.adminID = adminID;
    }
    
    @Override
    public boolean login() {
        return 101312 == adminID && "admin@312".equals(getPassword());
    }
}

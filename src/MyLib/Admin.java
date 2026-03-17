/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

import java.util.ArrayList;

/**
 *
 * @author Christian Aranza
 */
public class Admin extends SystemUser {
    private int adminID;
    private EstateProperties properties;
    
    public Admin(int adminID, String name, String password) {
        super(name, password);
        this.adminID = adminID;
        this.properties = EstateProperties.getInstance();
    }
    
    public boolean login(int adminID, String password) {
        return this.adminID == adminID &&
                this.getPassword().equals(password);
    }
    
    public int getAdminID() {
        return adminID;
    }
   
    public boolean addProperty(int blockLoc, int lotLoc, String modelName) {
        return properties.addProperty(blockLoc, lotLoc, modelName);
    }
    
    public boolean removeProperty(int blockLoc, int lotLoc) {
        return properties.removeProperty(blockLoc, lotLoc);
    }
    
    public ArrayList<Property> getAllProperties() {
        return properties.getProperties();
    }
}

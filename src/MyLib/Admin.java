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
    }
    
    public boolean login(int adminID, String password) {
        return this.adminID == adminID &&
                this.getPassword().equals(password);
    }
    
    public int getAdminID() {
        return adminID;
    }
   
    // ADMIN: Add new property
    public boolean addProperty(int blockLoc, int lotLoc, int price, double size, 
                              String modelName, int agentID) {
        PropertyModel model = new PropertyModel(modelName);
        Property newProperty = new Property(blockLoc, lotLoc, price, size, model, agentID);
        return properties.addProperty(newProperty);
    }
    
    // ADMIN: Remove property by block and lot
    public boolean removeProperty(int blockLoc, int lotLoc) {
        return properties.removeProperty(blockLoc, lotLoc);
    }
    
    // ADMIN: Get all properties (for display)
    public ArrayList<Property> getAllProperties() {
        return properties.getProperties();
    }
}

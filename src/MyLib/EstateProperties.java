/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pcmya
 */
public class EstateProperties {
    private static EstateProperties instance;
    private ArrayList<Property> properties = new ArrayList<>();

    public EstateProperties() {
        addProperty();
    }
    
    private void addProperty() {
        Random r = new Random();
        int count = 0;
        
        for(int blockLoc = 1; blockLoc <= 5; blockLoc++) {
            for(int lotLoc = 1; lotLoc <= 20; lotLoc++) {
                double size = 50;
                double price = 0;
                String modelName;
                
                String [] arr = {"Anica", "Alice", "Thea", "Adelle"};
                int select = r.nextInt(arr.length);
                modelName = arr[select];
                
                if (modelName.equals("Adelle")) {
                    size = 60;
                    price = 5436700;
                }
                
                if (modelName.equals("Anica")) {
                    price = 2441800;
                }
                
                if (modelName.equals("Alice")) {
                    price = 2783000;
                }
                
                if (modelName.equals("Thea")) {
                    price = 3915400;
                }
                
                int agentID = (count < 20) ? 101010 : 0;
                count++;
                
                properties.add(new Property(blockLoc, lotLoc, Math.round(price), size, new PropertyModel(modelName), agentID));
            }
        }
    }
    
    public ArrayList<Property> getProperties() {
        return properties;
    }
    
    public ArrayList<Property> searchProperties(Integer blockLoc, Integer lotLoc, Double price, Double size, String model) {
        ArrayList<Property> result = new ArrayList<>();
        for (Property p : properties) {
            if ((blockLoc == null || p.getBlockLoc() == blockLoc)
                && (lotLoc == null || p.getLotLoc() == lotLoc)
                && (size == null || p.getSize() == size)
                && (price == null || p.getPrice() <= price)
                && (model == null || p.getModel().getModelName().equals(model))) {
                result.add(p);
            }
        } 
        return result;
    }
    
    public Property getPropertyByLotNumber(int lotNumber) {
    for (Property p : properties) {
        if (p.getLotLoc() == lotNumber) {
            return p;
        }
    }
        return null;
    }
    
    public static EstateProperties getInstance() {
        if (instance == null) {
            instance = new EstateProperties();
        }
        return instance;
    }
    
    // ADMIN: Add new property
    public boolean addProperty(Property newProperty) {
        // Check if property already exists at same block/lot
        for (Property p : properties) {
            if (p.getBlockLoc() == newProperty.getBlockLoc() && 
                p.getLotLoc() == newProperty.getLotLoc()) {
                return false; // Property already exists
            }
        }
        return properties.add(newProperty);
    }
    
    // ADMIN: Remove property by block and lot
    public boolean removeProperty(int blockLoc, int lotLoc) {
        for (Property p : properties) {
            if (p.getBlockLoc() == blockLoc && p.getLotLoc() == lotLoc) {
                return properties.remove(p);
            }
        }
        return false; // Property not found
    }
    
}

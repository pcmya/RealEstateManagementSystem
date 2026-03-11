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
    public ArrayList<Property> properties = new ArrayList<>();

    public EstateProperties() {
        addProperty();
    }
    
    private void addProperty() {
        Random r = new Random();
        for(int blockLoc = 1; blockLoc <= 5; blockLoc++) {
            for(int lotLoc = 1; lotLoc <= 10; lotLoc++) {
                double size;
                double price;
                String modelName;
                
                String [] arr = {"Anica", "Alice", "Thea", "Adelle"};
                int select = r.nextInt(arr.length);
                modelName = arr[select];
                
                if (modelName.equals("Adelle")) {
                    size = 60;
                    price = 5436700;
                }
                else {
                    size = 50;
                    price = 2320910 + r.nextDouble(15944490);
                }
                
                properties.add(new Property(blockLoc, lotLoc, price, size, new PropertyModel(modelName)));
            }
        }
    }
    
    public ArrayList<Property> getProperties() {
        return properties;
    }
    
    public ArrayList<Property> searchProperties(Integer blockLoc, Double price, Double size, String model) {
        ArrayList<Property> result = new ArrayList<>();
        for (Property p : properties) {
            if ((blockLoc == null || p.getBlockLoc() == blockLoc)
                && (size == null || p.getSize() >= size)
                && (price == null || p.getPrice() >= price)
                && (model == null || p.getModel().getModelName() == model)) {
                result.add(p);
            }
        } 
        return result;
    }
}

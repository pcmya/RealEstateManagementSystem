/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public class Property {
    private int blockLoc;
    private int lotLoc;
    private double price;
    private double size;
    private PropertyModel model;
    private String status = "Available";

    public Property(int blockLoc, int lotLoc, double price, double size, PropertyModel model) {
        this.blockLoc = blockLoc;
        this.lotLoc = lotLoc;
        this.price = price;
        this.size = size;
        this.model = model;
    }
    
    public Property(int blockLoc, int lotLoc) {
        this.blockLoc = blockLoc;
        this.lotLoc = lotLoc;
    }

    public int getBlockLoc() {
        return blockLoc;
    }

    public int getLotLoc() {
        return lotLoc;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }

    public PropertyModel getModel() {
        return model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}

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
    private String status;

    public Property(int blockLoc, int lotLoc, double price, double size, PropertyModel model) {
        this.blockLoc = blockLoc;
        this.lotLoc = lotLoc;
        this.price = price;
        this.size = size;
        this.model = model;
    }
}

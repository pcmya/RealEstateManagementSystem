/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public abstract class Transaction {
    private double payment;
    private Client client;
    private Property property;

    public Transaction(Client client, Property property) {
        this.client = client;
        this.property = property;
    }
    
    public abstract void computePayment();
    public abstract void printReceipt();
    
}
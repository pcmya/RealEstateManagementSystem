/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public class PagIBIG extends Transaction {
    
    private String pbName;
    private int pbID;
    private double interest = 0.075;
    private double loanAmount;
    private int monthly;
    
    public PagIBIG (String Client, String Property, String pbName, int pbID){
        super (Client, Property);
        this.pbName = pbName;
        this.pbID = pbID;
    }
    
    @Override
    public void computePayment(){
        this.monthly = 360;
        double r = interest / 12;
        this.payment = (loanAmount * r * Math.pow(1 + r, monthly)) / (Math.pow(1 + r, monthly) - 1);
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
    
}

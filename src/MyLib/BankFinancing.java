/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public class BankFinancing extends Transaction {
    
    private String bankName;
    private int bankNum;
    private double interest = 0.0775;
    private double loanAmount;
    private int monthly;
    
    public BankFinancing (String Client, String Property, String bankName, int bankNum){
        super (Client, Property);
        this.bankName = bankName;
        this.bankNum = bankNum;
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

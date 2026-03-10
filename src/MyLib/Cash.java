/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public class Cash extends Transaction {
    
    public Cash (String Client, String Property){
        super (Client, Property);
    }
    
    @Override
    public void computePayment(){
        double tcp; //totalcontractprice
        double reservation = 15000.00;
        this.payment = (tcp - reservation) / 24;
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public class Reserve extends Transaction{ 
    private Property property;
    
    public Reserve(Client client, Property property) {
        super(client, property);
    }
    
    public Property getProperty(){
        return this.property;
    }
    @Override
    public void computePayment(){
        
    }
    @Override
    public void printReceipt(){
        System.out.println("");
        
    }
}

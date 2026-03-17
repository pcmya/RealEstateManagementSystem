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
    private double balance = 0.0;
    
    public Reserve(Client client, Property property) {
        super(client, property);
    }

    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            super.setTotalContractPrice(5436700.00);
            super.setReservationFee(20000.00);
        }
        if (modelName.equals("Alice")) {
            super.setTotalContractPrice(2783000.00);
            super.setReservationFee(15000.00);
        }
        if (modelName.equals("Thea")) {
            super.setTotalContractPrice(3915400.00);
            super.setReservationFee(1500.00);  
        }
        if (modelName.equals("Anica")) {
            super.setTotalContractPrice(2441800.00);
            super.setReservationFee(10000.00);
        }
        balance = super.getTotalContractPrice() - super.getReservationFee();
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

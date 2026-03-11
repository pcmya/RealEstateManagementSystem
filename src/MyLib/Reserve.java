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
    private double totalContractPrice = 0.0;
    private double reservationFee = 0.0;
    private double balance = 0.0;
    
    public Reserve(Client client, Property property) {
        super(client, property);
    }

    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            totalContractPrice = 5436700.00;
            reservationFee = 20000.00;
        }
        if (modelName.equals("Alice")) {
            totalContractPrice = 2783000.00;
            reservationFee = 15000.00;
        }
        if (modelName.equals("Thea")) {
            totalContractPrice = 3915400.00;
            reservationFee = 15000.00;   
        }
        if (modelName.equals("Anica")) {
            totalContractPrice = 2441800.00;
            reservationFee = 10000;
        }
        balance = totalContractPrice - reservationFee;
    }

    public double getTotalContractPrice() {
        return totalContractPrice;
    }

    public double getReservationFee() {
        return reservationFee;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    

}

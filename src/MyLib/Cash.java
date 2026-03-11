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
    double totalContractPrice;
    double reservationFee;
    double discountRate;
    double discountAmount;
    double netTotalContractPrice;
    double fullContractPrice;
    
    public Cash (Client client, Property property){
        super(client, property);
    }
    
    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            totalContractPrice = 5436700.00;
            reservationFee = 20000.00;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;

        }
        if (modelName.equals("Alice")) {
            totalContractPrice = 2783000.00;
            reservationFee = 15000.00;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;
        }
        if (modelName.equals("Thea")) {
            totalContractPrice = 3915400.00;
            reservationFee = 15000.00;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;     
        }
        if (modelName.equals("Anica")) {
            totalContractPrice = 2441800.00;
            reservationFee = 10000;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;
        }
    }

    public double getTotalContractPrice() {
        return totalContractPrice;
    }

    public double getReservationFee() {
        return reservationFee;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public double getNetTotalContractPrice() {
        return netTotalContractPrice;
    }

    public double getFullContractPrice() {
        return fullContractPrice;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

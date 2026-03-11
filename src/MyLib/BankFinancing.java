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
    
    private double totalContractPrice = 0.0;
    private double reservationFee = 0.0;
    private double dpPercent = 0.0;
    private double requiredDP = 0.0;
    private double netDP = 0.0;
    private double dPTerm = 0.0;
    private double loanableAmount = 0.0;
    
    public BankFinancing (Client client, Property property){
        super(client, property);
    }
    
    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            totalContractPrice = 4040600.00;
            reservationFee = 20000.00;
            dpPercent = 0.15; // 15%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 18; // 18 months DP  
        }
        
        if (modelName.equals("Alice")) {
            totalContractPrice = 2783000.00;
            reservationFee = 15000.00;
            dpPercent = 0.10; // 10%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 12;
        }
        if (modelName.equals("Thea")) {
            totalContractPrice = 3905500.00;
            reservationFee = 15000.00;
            dpPercent = 0.125; // 12.5%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 21; //21 months 
        }
        if (modelName.equals("Anica")) {
            totalContractPrice = 3153400.00;
            reservationFee = 10000.00;
            dpPercent = 0.15; // 15%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 18; // months
        }
        requiredDP = totalContractPrice * dpPercent;
        loanableAmount = totalContractPrice - requiredDP;
            
    }

    public double getTotalContractPrice() {
        return totalContractPrice;
    }

    public double getReservationFee() {
        return reservationFee;
    }

    public double getDpPercent() {
        return dpPercent;
    }

    public double getRequiredDP() {
        return requiredDP;
    }

    public double getNetDP() {
        return netDP;
    }

    public double getdPTerm() {
        return dPTerm;
    }

    public double getLoanableAmount() {
        return loanableAmount;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

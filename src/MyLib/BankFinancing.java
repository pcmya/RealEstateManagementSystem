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
    private double dpPercent;
    private double dPTerm;
    
    public BankFinancing (Client client, Property property){
        super(client, property);
    }
    
    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            super.setTotalContractPrice(4040600.00);
            super.setReservationFee(20000.00);
            dpPercent = 0.15;
            super.setMonths(18);
        }
        
        if (modelName.equals("Alice")) {
            super.setTotalContractPrice(2783000.00);
            super.setReservationFee(15000.00);
            dpPercent = 0.10;
            super.setMonths(12);
        }
        if (modelName.equals("Thea")) {
            super.setTotalContractPrice(3905500.00);
            super.setReservationFee(15000.00);
            dpPercent = 0.125;
            super.setMonths(21);
        }
        if (modelName.equals("Anica")) {
            super.setTotalContractPrice(3153400.00);
            super.setReservationFee(10000.00);
            dpPercent = 0.15;
            super.setMonths(18);
        }
        super.setRequiredDP(super.getTotalContractPrice() * dpPercent);
        super.setNetDP(super.getRequiredDP() - super.getReservationFee());
        dPTerm = super.getNetDP() / super.getMonths();
        super.setLoanableAmount(super.getTotalContractPrice() - super.getRequiredDP());
            
    }

    public double getdPTerm() { 
        return dPTerm;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}

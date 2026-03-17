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
    private double monthlyEquity;
    
    public PagIBIG (Client client, Property property){
        super (client, property);
    }
    
    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            super.setTotalContractPrice(4040600.00);
            super.setRequiredDP(950000.00); 
        }
        if (modelName.equals("Alice")) {
            super.setTotalContractPrice(2833600.00);
            super.setRequiredDP(822070.00);
        }
        if (modelName.equals("Thea")) {
            super.setTotalContractPrice(3905500.00);        
            super.setRequiredDP(600000.00);

        } else if (modelName.equals("Anica")) {
            super.setTotalContractPrice(3153400.00);
            super.setRequiredDP(450000.00);
        }
        super.setMonths(24);
        super.setReservationFee(15000.00);
        super.setNetDP(super.getRequiredDP() - super.getReservationFee());
        monthlyEquity = super.getNetDP() / super.getMonths();
        super.setLoanableAmount(super.getTotalContractPrice() - super.getRequiredDP());
    }

    public double getMonthlyEquity() {
        return monthlyEquity;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

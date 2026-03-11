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

    private double tcp = 0.00;
    private double requiredDP = 0.0;
    private double reservationFee = 15000.00;
    private int dpTerm = 24;
    private double netDP;
    private double monthlyEquity;
    private double loanableAmount;
    
    public PagIBIG (Client client, Property property){
        super (client, property);
    }
    
    public void computePayment(String modelName){
        if (modelName.equals("Adelle")) {
            tcp = 4040600.00;        
            requiredDP = 950000.00; 
        }
        if (modelName.equals("Alice")) {
            tcp = 2833600.00;
            requiredDP = 822070.00;
        }
        if (modelName.equals("Thea")) {
            tcp = 3905500.00;        
            requiredDP = 600000.00;  

        } else if (modelName.equals("Anica")) {
            tcp = 3153400.00;       
            requiredDP = 450000.00;
        }
        
        netDP = requiredDP - reservationFee;
        monthlyEquity = netDP / dpTerm;
        loanableAmount = tcp - requiredDP;
    }

    public double getTcp() {
        return tcp;
    }

    public double getRequiredDP() {
        return requiredDP;
    }

    public double getReservationFee() {
        return reservationFee;
    }

    public int getDpTerm() {
        return dpTerm;
    }

    public double getNetDP() {
        return netDP;
    }

    public double getMonthlyEquity() {
        return monthlyEquity;
    }

    public double getLoanableAmount() {
        return loanableAmount;
    }

    @Override
    public void computePayment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

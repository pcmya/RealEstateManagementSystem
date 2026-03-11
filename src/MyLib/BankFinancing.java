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
    
    public BankFinancing (Client Client, Property Property, String bankName, int bankNum){
        super (Client, Property);
        this.bankName = bankName;
        this.bankNum = bankNum;
    }
    
    @Override
    public void computePayment(){
        String modelName;

        double totalContractPrice = 0.0;
        double reservationFee = 0.0;
        double dpPercent = 0.0;
        double requiredDP = 0.0;
        double netDP = 0.0;
        double dPTerm = 0.0;
        double loanableAmount = 0.0;
        
        String[] arr = {"Anica", "Alice", "Thea", "Adelle"};
        modelName = arr[select];

        if (modelName.equals("Adelle")) {

            totalContractPrice = 4040600.00;
            reservationFee = 20000.00;
            dpPercent = 0.15; // 15%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 18; // 18 months DP
            
        } else if (modelName.equals("Alice")) {
            
            totalContractPrice = 2783000.00;
            reservationFee = 15000.00;
            dpPercent = 0.10; // 10%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 12;

        } else if (modelName.equals("Thea")) {

            totalContractPrice = 3905500.00;
            reservationFee = 15000.00;
            dpPercent = 0.125; // 12.5%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 21; //21 months
            
        } else if (modelName.equals("Anica")) {

            totalContractPrice = 3153400.00;
            reservationFee = 10000.00;
            dpPercent = 0.15; // 15%

            netDP = requiredDP - reservationFee;
            dPTerm = netDP / 18; // months
            
            
        }
        
            //Shared Computation
            requiredDP = totalContractPrice * dpPercent;
            loanableAmount = totalContractPrice - requiredDP;
            
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
    
}

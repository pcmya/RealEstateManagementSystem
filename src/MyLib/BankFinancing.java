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

        double totalContractPrice;
        double reservationFee;
        double dpPercent;
        double requiredDP;
        double netDP;
        double monthlyEquity;
        double loanableAmount;
        
        String[] arr = {"Anica", "Alice", "Thea", "Adelle"};
        int select = nextInt(arr.length);
        modelName = arr[select];

        if (modelName.equals("Adelle")) {

        } else if (modelName.equals("Alice")) {
            
            // 1. Base Values
            totalContractPrice = 2783000.00;
            reservationFee = 15000.00;

            // 2. Downpayment Calculations (10% DP for 12 months)
            dpPercent = 0.10;
            requiredDP = totalContractPrice * dpPercent;
            netDP = requiredDP - reservationFee;
            monthlyEquity = netDP / 12; // Monthly payment for 12 months

            // 3. Loanable Amount (90% remaining)
            loanableAmount = totalContractPrice - requiredDP;

            // Update your JFrame Labels
            lblTotalAmount.setText(String.format("%.2f php", totalContractPrice));
            lblReservationFee.setText(String.format("%.2f php", reservationFee));
            lblMonthlyEquity.setText(String.format("%.2f php", monthlyEquity));

        } else if (modelName.equals("Thea")) {

        } else if (modelName.equals("Anica")) {

        }
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
    
}

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

        String[] arr = {"Anica", "Alice", "Thea", "Adelle"};
        int select = nextInt(arr.length);
        modelName = arr[select];

        if (modelName.equals("Adelle")) {

        } else if (modelName.equals("Alice")) {
            // 1. Base Values
            double totalContractPrice = 2783000.00; // From your JFrame
            double reservationFee = 15000.00;

            // 2. Downpayment Calculations (10% DP for 12 months)
            double dpPercent = 0.10;
            double requiredDP = totalContractPrice * dpPercent;
            double netDP = requiredDP - reservationFee;
            double monthlyEquity = netDP / 12; // Monthly payment for 12 months

            // 3. Loanable Amount (The 90% remaining)
            double loanableAmount = totalContractPrice - requiredDP;

            // Update your JFrame Labels (Check your actual variable names)
            lblTotalAmount.setText(String.format("%.2f php", totalContractPrice));
            lblReservationFee.setText(String.format("%.2f php", reservationFee));
            lblMonthlyEquity.setText(String.format("%.2f php", monthlyEquity));

            // Note: You can also display the Loanable Amount in a label if you have one
            System.out.println("Loanable Amount: " + loanableAmount);
        } else if (modelName.equals("Thea")) {

        } else if (modelName.equals("Anica")) {

        }
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
    
}

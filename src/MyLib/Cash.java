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
    
    public Cash (Client Client, Property Property){
        super (Client, Property);
    }
    
    @Override
    public void computePayment(){
        
        String modelName;
        
        double totalContractPrice;
        double reservationFee;
        double discountRate;
        double discountAmount;
        double netTotalContractPrice;
        double fullContractPrice;
        
        String[] arr = {"Anica", "Alice", "Thea", "Adelle"};

        if (modelName.equals("Adelle")) {
            totalContractPrice = 5161750.00;
            reservationFee = 20000.00;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;

            // Display results to UI (Update these labels to match your JFrame variable names)
            totalAmountLabel.setText(String.format("%.2f php", fullContractPrice));
            reservationFeeLabel.setText(String.format("%.2f php", reservationFee));

        } else if (modelName.equals("Alice")) {
            totalContractPrice = 2164860.00;
            reservationFee = 15000.00;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;

            // Display results to UI (Update these labels to match your JFrame variable names)
            totalAmountLabel.setText(String.format("%.2f php", fullContractPrice));
            reservationFeeLabel.setText(String.format("%.2f php", reservationFee));

        } else if (modelName.equals("Thea")) {
            totalContractPrice = 3708600.00;
            reservationFee = 15000.00;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;

            // Display results to UI (Update these labels to match your JFrame variable names)
            totalAmountLabel.setText(String.format("%.2f php", fullContractPrice));
            reservationFeeLabel.setText(String.format("%.2f php", reservationFee));
            
        } else if (modelName.equals("Anica")) {
            totalContractPrice = 2995730.00;
            reservationFee = 10000;
            discountRate = 0.10;
            discountAmount = totalContractPrice * discountRate;
            netTotalContractPrice = totalContractPrice - discountAmount;
            fullContractPrice = netTotalContractPrice - reservationFee;

            // Display results to UI (Update these labels to match your JFrame variable names)
            totalAmountLabel.setText(String.format("%.2f php", fullContractPrice));
            reservationFeeLabel.setText(String.format("%.2f php", reservationFee));
        }
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
}

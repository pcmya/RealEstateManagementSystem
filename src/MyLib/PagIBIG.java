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
    
    private String pbName;
    private int pbID;
    private double interest = 0.075;
    private double loanAmount;
    private int monthly;
    
    public PagIBIG (Client Client, Property Property, String pbName, int pbID){
        super (Client, Property);
        this.pbName = pbName;
        this.pbID = pbID;
    }
    
    @Override
    public void computePayment(){

        String modelName;
        String[] arr = {"Anica", "Alice", "Thea", "Adelle"};
        modelName = arr[select];

        double tcp = 0.00;
        double requiredDP = 0.0;
        double reservationFee = 15000.00;
        int dpTerm = 24;

        if (modelName.equals("Adelle")) {
            tcp = 4040600.00;        // Example price for Adelle
            requiredDP = 950000.00;  // Example DP

        } else if (modelName.equals("Alice")) {
            // Exact values from your last attachment
            tcp = 2833600.00;
            requiredDP = 822070.00;

        } else if (modelName.equals("Thea")) {
            tcp = 3905500.00;        // Example price for Thea
            requiredDP = 600000.00;  // Example DP

        } else if (modelName.equals("Anica")) {
            tcp = 3153400.00;        // Example price for Anica
            requiredDP = 450000.00;  // Example DP
        }

        //Shared Computation
        double netDP = requiredDP - reservationFee;
        double monthlyEquity = netDP / dpTerm;
        double loanableAmount = tcp - requiredDP;

        //Update the GUI Labels
        lblTotalAmount.setText(String.format("%.2f php", tcp));
        lblReservationFee.setText(String.format("%.2f php", reservationFee));
        lblMonthlyEquity.setText(String.format("%.2f php", monthlyEquity));

    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
    
}

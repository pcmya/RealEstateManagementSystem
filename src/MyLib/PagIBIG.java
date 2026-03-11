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
            int select = nextInt(arr.length);
            modelName = arr[select];

            if (modelName.equals("Adelle")) {
                
            } else if(modelName.equals ("Alice")) {
                
            } else if(modelName.equals("Thea")){
                
            } else if (modelName.equals("Anica")){
                
            }
    }
    
    @Override
    public void printReceipt(){
        System.out.println("");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLib;

/**
 *
 * @author pcmya
 */
public abstract class Transaction {
    private Client client;
    private Property property;
    
    private double totalContractPrice;
    private double reservationFee;
    
    private double netDP;
    private double requiredDP;
    private int months;
    
    private double loanableAmount;

    public Transaction(Client client, Property property) {
        this.client = client;
        this.property = property;
    }

    public abstract void computePayment();

    public void setTotalContractPrice(double totalContractPrice) {
        this.totalContractPrice = totalContractPrice;
    }

    public void setReservationFee(double reservationFee) {
        this.reservationFee = reservationFee;
    }

    public void setNetDP(double netDP) {
        this.netDP = netDP;
    }

    public void setLoanableAmount(double loanableAmount) {
        this.loanableAmount = loanableAmount;
    }
    
    public void setRequiredDP(double requiredDP) {
        this.requiredDP = requiredDP;
    }
    
    public void setMonths(int months) {
        this.months = months;
    }

    public double getTotalContractPrice() {
        return totalContractPrice;
    }

    public double getReservationFee() {
        return reservationFee;
    }

    public double getNetDP() {
        return netDP;
    }

    public double getLoanableAmount() {
        return loanableAmount;
    }

    public Property getProperty() {
        return property;
    }
    
    public double getRequiredDP() {
        return requiredDP;
    }
    
    public int getMonths() {
        return months;
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Objects;

/**
 *
 * @author ahmed
 */
public class Payments extends Membership{
    private static int billNumber = 0;
    protected double cashAmount;
    protected double creditCardAmount;
    protected String creditCardNumber;
    protected double balance;

    public Payments() {
        super();
        billNumber++;
    }

    public Payments(double cashAmount, double balance, String membershipCardNum, double price, String status, String firstName, String lastName, String address, String phoneNumber) {
        super(membershipCardNum, price, status, firstName, lastName, address, phoneNumber);
        billNumber++;
        this.cashAmount = cashAmount;
        this.balance = balance;
    }

    public Payments(double creditCardAmount, String creditCardNumber, double balance, String membershipCardNum, double price, String status, String firstName, String lastName, String address, String phoneNumber) {
        super(membershipCardNum, price, status, firstName, lastName, address, phoneNumber);
        billNumber++;
        this.creditCardAmount = creditCardAmount;
        this.creditCardNumber = creditCardNumber;
        this.balance = balance;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public double getCreditCardAmount() {
        return creditCardAmount;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void setBillNumber(int billNumber) {
        Payments.billNumber = billNumber;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void setCreditCardAmount(double creditCardAmount) {
        this.creditCardAmount = creditCardAmount;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.cashAmount) ^ (Double.doubleToLongBits(this.cashAmount) >>> 32));
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.creditCardAmount) ^ (Double.doubleToLongBits(this.creditCardAmount) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.creditCardNumber);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.balance) ^ (Double.doubleToLongBits(this.balance) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Payments other = (Payments) obj;
        if (Double.doubleToLongBits(this.cashAmount) != Double.doubleToLongBits(other.cashAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.creditCardAmount) != Double.doubleToLongBits(other.creditCardAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        return Objects.equals(this.creditCardNumber, other.creditCardNumber);
    }

    @Override
    public String toString() {
        return "Payments: " + getBillNumber();
    }

    @Override
    public void setPrice(double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setStatus(String status) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}

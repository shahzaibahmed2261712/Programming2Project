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
public class Payments extends Member{
    private static int billNumber = 0;
    protected String creditCardNumber;
    protected double balance;

    public Payments() {
        super();
        billNumber++;
    }

    public Payments(String creditCardNumber, double balance, String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
        this.creditCardNumber = creditCardNumber;
        this.balance = balance;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public String getCreditCardNumber() {
        return creditCardNumber.substring(15, creditCardNumber.length());
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static void setBillNumber(int billNumber) {
        Payments.billNumber = billNumber;
    }
    
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.creditCardNumber);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.balance) ^ (Double.doubleToLongBits(this.balance) >>> 32));
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
        if (Double.doubleToLongBits(this.balance) != Double.doubleToLongBits(other.balance)) {
            return false;
        }
        return Objects.equals(this.creditCardNumber, other.creditCardNumber);
    }

    

    public String toString1() {
        return "Cash Payment: " + "Bill Number: " + getBillNumber() + " | Member: " + super.getLastName() + ", " + getFirstName()
                + " | " + "Billing Address: " + getAddress() + " | Price paid: " + getBalance() + "--";
    }

    public String toString2() {
        return "Credit Card Payment: " + "Bill Number: " + getBillNumber() + " | Member: " + getLastName() + ", " + getFirstName()
                + " | Card ending with: " + getCreditCardNumber() + " | " + "Billing Address: " + getAddress() + " | Price paid: $" + getBalance() + "--";
    }
}

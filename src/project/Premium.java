/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ahmed
 */
public class Premium extends Membership{
    private final boolean anyLocationAccess;
    private final boolean twentyfivePercentDiscountOnFood;
    private final boolean accessToSpa;
    protected double price;

    public Premium() {
        anyLocationAccess = true;
        twentyfivePercentDiscountOnFood = true;
        accessToSpa = true;
        price = 0.0;
    }

    public Premium(boolean anyLocationAccess, boolean twentyfivePercentDiscountOnFood, boolean accessToSpa, double price, int membershipCardNum, String status, String firstName, String lastName, String address, String phoneNumber) {
        super(membershipCardNum, status, firstName, lastName, address, phoneNumber);
        this.anyLocationAccess = anyLocationAccess;
        this.twentyfivePercentDiscountOnFood = twentyfivePercentDiscountOnFood;
        this.accessToSpa = accessToSpa;
        this.price = price;
    }

    public boolean isAnyLocationAccess() {
        return anyLocationAccess;
    }

    public boolean isTwentyfivePercentDiscountOnFood() {
        return twentyfivePercentDiscountOnFood;
    }

    public boolean isAccessToSpa() {
        return accessToSpa;
    }
    
    @Override
    public int getMembershipCardNum() {
        return membershipCardNum;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setMembershipCardNum() {
        this.membershipCardNum = (int) (Math.random() * (749999999 - 640000000 + 1) + 640000000);
    }

    public void setAnyLocationAccess(boolean anyLocationAccess) {
        if (anyLocationAccess == true){
            System.out.println("Unlimited Access to Any Gym Locations.");
        }
        else{
            System.out.println("No Access to Every Gym, only local one!");
        }
    }

    public void setTwentyfivePercentDiscountOnFood(boolean twentyfivePercentDiscountOnFood) {
        if (twentyfivePercentDiscountOnFood == true){
            System.out.println("25% Off Food.");
        }
        else{
            System.out.println("Pay Regular Price for Food.");
        }
    }

    public void setAccessToSpa(boolean accessToSpa) {
        if (accessToSpa == true){
            System.out.println("Access to the Luxurious Spa.");
        }
        else{
            System.out.println("No Access to the Spa");
        }
    }

    @Override
    public void setPrice() {
        this.price = 37.98;
    }

    @Override
    public void setStatus() {
        this.status = "Premium Membership";
    }

    @Override
    public String toString() {
        super.toString();
        return "Membership: " + "Membership Card Number: " + getMembershipCardNum() + " | " + getLastName() + ", " + getFirstName() 
                + " | Status: " + getStatus() + " | Price per Month: $" + getPrice() + "--";
    }
    
}

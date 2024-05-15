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
    private boolean anyLocationAccess;
    private boolean twentyfivePercentDiscountOnFood;
    private boolean accessToSpa;

    public Premium() {
        anyLocationAccess = true;
        twentyfivePercentDiscountOnFood = true;
        accessToSpa = true;
    }

    public Premium(boolean anyLocationAccess, boolean twentyfivePercentDiscountOnFood, boolean accessToSpa, String membershipCardNum, double price, String status, String firstName, String lastName, String address, String phoneNumber) {
        super(membershipCardNum, price, status, firstName, lastName, address, phoneNumber);
        this.anyLocationAccess = anyLocationAccess;
        this.twentyfivePercentDiscountOnFood = twentyfivePercentDiscountOnFood;
        this.accessToSpa = accessToSpa;
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
    public void setPrice(double price) {
        price = 37.98;
    }

    @Override
    public void setStatus(String status) {
        status = "Premium Membership";
    }

    @Override
    public String toString() {
        return "Member: " + getMembershipCardNum() + " " + getLastName() + ", " + getFirstName() + " " + getStatus();
    }
    





}

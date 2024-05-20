/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ahmed
 */
public class Regular extends Membership{
    private boolean unlimitedAccess;
    private boolean aFreeGymShirt;
    private boolean accessToLockers;
    protected double price;

    public Regular() {
        super();
        unlimitedAccess = true;
        aFreeGymShirt = true;
        accessToLockers = true;
        price = 0.0;
    }

    public Regular(boolean unlimitedAccess, boolean aFreeGymShirt, boolean accessToLockers, double price, int membershipCardNum,String status, String firstName, String lastName, String address, String phoneNumber) {
        super(membershipCardNum, status, firstName, lastName, address, phoneNumber);
        this.unlimitedAccess = unlimitedAccess;
        this.aFreeGymShirt = aFreeGymShirt;
        this.accessToLockers = accessToLockers;
        this.price = price;
    }

    

    public boolean isUnlimitedAccess() {
        return unlimitedAccess;
    }

    public boolean isaFreeGymShirt() {
        return aFreeGymShirt;
    }

    public boolean isAccessToLockers() {
        return accessToLockers;
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
        this.membershipCardNum = (int) (Math.random() * (549999999 - 440000000 + 1) + 440000000);
    }

    public void setUnlimitedAccess(boolean unlimitedAccess) {
        if (unlimitedAccess == true){
            System.out.println("Unlimited Access to the Gym.");
        }
        else{
            System.out.println("No Access to the Gym!");
        }
    }

    public void setaFreeGymShirt(boolean aFreeGymShirt) {
        if (aFreeGymShirt == true){
            System.out.println("1 Free Gym Shirt.");
        }
        else{
            System.out.println("No Free Gym Shirt!");
        }
    }

    public void setAccessToLockers(boolean accessToLockers) {
        if (accessToLockers == true){
            System.out.println("Access To Lockers.");
        }
        else{
            System.out.println("No Access To Lockers!");
        }
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

    @Override
    public void setPrice() {
        this.price = 18.99;
    }

    @Override
    public void setStatus() {
        this.status = "Regular Membership";
    }

    @Override
    public String toString() {
        return "Membership: " + "Membership Card Number: " + getMembershipCardNum() + " | " + getLastName() + ", " + getFirstName() 
                + " | Status: " + getStatus() + " | Price per Month: " + getPrice();
    }
    

    

    



}
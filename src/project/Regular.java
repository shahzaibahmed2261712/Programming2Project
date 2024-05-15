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

    public Regular() {
        super();
        unlimitedAccess = true;
        aFreeGymShirt = true;
        accessToLockers = true;
    }

    public Regular(boolean unlimitedAccess, boolean aFreeGymShirt, boolean accessToLockers) {
        //super(membershipCardNum, price, status, firstName, lastName, address, phoneNumber);
        this.unlimitedAccess = unlimitedAccess;
        this.aFreeGymShirt = aFreeGymShirt;
        this.accessToLockers = accessToLockers;
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
    public String getMembershipCardNum() {
        return membershipCardNum;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getStatus() {
        return status;
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
    public void setMembershipCardNum(String membershipCardNum) {
        this.membershipCardNum = membershipCardNum;
    }

    @Override
    public void setPrice(double price) {
        price = 18.99;
    }

    @Override
    public void setStatus(String status) {
        status = "Regular Membership";
    }

    @Override
    public String toString() {
        return "Membership: " + getMembershipCardNum() + " " + getLastName() + ", " + getFirstName() + " " + getStatus();
    }
    

    

    



}
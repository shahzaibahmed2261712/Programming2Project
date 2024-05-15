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
public abstract class Membership extends Member{
    protected String membershipCardNum;
    protected double price;
    protected String status;

    
    public Membership() {
        super();
        membershipCardNum = null;
        price = 0.0;
        status = null;
    }

    public Membership(String membershipCardNum, double price, String status, String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
        this.membershipCardNum = membershipCardNum;
        this.price = price;
        this.status = status;
    }

    public String getMembershipCardNum() {
        return membershipCardNum;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    public void setMembershipCardNum(String membershipCardNum) {
        this.membershipCardNum = membershipCardNum;
    }

    public abstract void setPrice(double price);

    public abstract void setStatus(String status);

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.membershipCardNum);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 13 * hash + Objects.hashCode(this.status);
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
        final Membership other = (Membership) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.membershipCardNum, other.membershipCardNum)) {
            return false;
        }
        return Objects.equals(this.status, other.status);
    }

    @Override
    public String toString() {
        return "Membership: " + membershipCardNum + " " + super.getLastName() + ", " + super.getFirstName()+ " " + status + " " + price;
    }
    
}

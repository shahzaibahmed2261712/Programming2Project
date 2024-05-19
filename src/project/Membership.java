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
    protected int membershipCardNum;
    protected String status;

    
    public Membership() {
        super();
        membershipCardNum = 0;
        status = null;
    }

    public Membership(int membershipCardNum, String status, String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, address, phoneNumber);
        this.membershipCardNum = membershipCardNum;
        this.status = status;
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

    public int getMembershipCardNum() {
        return membershipCardNum;
    }

    public String getStatus() {
        return status;
    }

    public abstract void setMembershipCardNum();
        
    

    public abstract void setPrice();

    public abstract void setStatus();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.membershipCardNum);
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
        if (!Objects.equals(this.membershipCardNum, other.membershipCardNum)) {
            return false;
        }
        return Objects.equals(this.status, other.status);
    }

    @Override
    public String toString() {
        super.toString();
        return "Memb: " + membershipCardNum + " " + super.getLastName() + ", " + super.getFirstName()+ " " + status;
    }
    
}

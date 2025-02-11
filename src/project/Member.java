/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class Member implements Serializable{
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String phoneNumber;

    public Member() {
        firstName = null;
        lastName = null;
        address = null;
        phoneNumber = null;
    }

    public Member(String firstName, String lastName, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

        while (this.phoneNumber.length() < 12 || this.phoneNumber.length() > 12 || this.phoneNumber.charAt(3) != '-' || this.phoneNumber.charAt(7) != '-') {
            System.out.println("\nNot Valid Format, Missing '-' and ONLY Enter Numbers. Follow the format: (XXX-XXX-XXXX).");
            Scanner input = new Scanner(System.in);
            System.out.print("New Member phone number: ");
            this.phoneNumber = input.nextLine();
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.firstName);
        hash = 41 * hash + Objects.hashCode(this.lastName);
        hash = 41 * hash + Objects.hashCode(this.address);
        hash = 41 * hash + Objects.hashCode(this.phoneNumber);
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
        final Member other = (Member) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        return Objects.equals(this.phoneNumber, other.phoneNumber);
    }

    @Override
    public String toString() {
        return "Member: " + getLastName() + ", " + getFirstName() + " | Address: " + getAddress() + " | Phone Number: " + getPhoneNumber() + "--";
    }
}

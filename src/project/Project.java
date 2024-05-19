/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ahmed
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //employeeLogin();
        Member m1 = addMember();
        System.out.println(m1.toString());
        chooseMembership(m1);
    }
    
    public static Employee employeeLogin(){
        Employee ep = new Employee();
        Scanner input = new Scanner(System.in);
        System.out.print("Employee Login\nUsername: ");
        ep.username = input.nextLine();
        System.out.print("Password: ");
        ep.password = input.nextLine();
        
        System.out.println();
        
        return ep;
    }
    
    public static Member addMember() {
        Member m = new Member();
        
        Scanner input = new Scanner(System.in);
        System.out.print("New Member's first name: ");
        m.setFirstName(input.nextLine());
        System.out.print("New Member's last name: ");
        m.setLastName(input.nextLine());
        System.out.print("New Member's address: ");
        m.setAddress(input.nextLine());
        System.out.print("New Member phone number: ");
        m.setPhoneNumber(input.nextLine());
        
        return m;
    }
    
    public static Member chooseMembership(Member newMember){
        Regular r = new Regular();
        Premium p = new Premium();
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich Membership does the member want?\nRegular or Premium\nPress r for regular or p for premium: ");
        char inputMembership = input.next().charAt(0);
        System.out.println();
        
        if(inputMembership == 'r' || inputMembership == 'R'){
            r.setMembershipCardNum();
            System.out.println(r.getMembershipCardNum());
            r.setUnlimitedAccess(true);
            r.setAccessToLockers(true);
            r.setaFreeGymShirt(true);
            r.setLastName(newMember.lastName);
            r.setFirstName(newMember.firstName);
            r.setStatus();
            r.setPrice();
            System.out.println(r);
            
        }
        else if (inputMembership == 'p' || inputMembership == 'P'){
            p.setMembershipCardNum();
            p.setAnyLocationAccess(true);
            p.setAnyLocationAccess(true);
            p.setTwentyfivePercentDiscountOnFood(true);
            p.setLastName(newMember.lastName);
            p.setFirstName(newMember.getFirstName());
            p.setStatus();
            p.setPrice();
            System.out.println(p);
            
        }
        return newMember;
    }
    
    public static void payment(Member newMember){
        Scanner input = new Scanner(System.in);
        
    }
}

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
//        Member m1 = addMember();
//        System.out.println(m1.toString());
//        chooseMembership(m1);
//        System.out.println();
//        
//        Regular r = regularMembership(m1);
//        Premium p = premiumMembership(m1);
//        Payments pay = payment(m1);
//        Member[] clientInfo = client(m1,r,p,pay);
        
        //retrieveClient(m1);
        runProgram();
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
        
        chooseMembership(m);
        
        return m;
    }
    
    public static void chooseMembership(Member newMember){
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich Membership does the member want?\nRegular or Premium\nPress r for regular or p for premium: ");
        char inputMembership = input.next().charAt(0);
        System.out.println();
        
        if(inputMembership == 'r' || inputMembership == 'R'){
            regularMembership(newMember);
            
        }
        else if (inputMembership == 'p' || inputMembership == 'P'){
            premiumMembership(newMember);
        }
    }
    
    public static Regular regularMembership(Member newMember) {
        Regular r = new Regular();
        r.setMembershipCardNum();
        System.out.println(r.getMembershipCardNum());
        r.setUnlimitedAccess(true);
        r.setAccessToLockers(true);
        r.setaFreeGymShirt(true);
        r.setLastName(newMember.getLastName());
        r.setFirstName(newMember.getFirstName());
        r.setStatus();
        r.setPrice();
        System.out.println(r);
        
        payment(newMember);

        return r;
    }
    
    public static Premium premiumMembership(Member newMember) {
        Premium p = new Premium();

        p.setMembershipCardNum();
        p.setAnyLocationAccess(true);
        p.setAccessToSpa(true);
        p.setTwentyfivePercentDiscountOnFood(true);
        p.setLastName(newMember.getLastName());
        p.setFirstName(newMember.getFirstName());
        p.setStatus();
        p.setPrice();
        System.out.println(p);
        
        payment(newMember);
        
        return p;
    }
    
    public static Payments payment(Member newMember){
        Scanner input = new Scanner(System.in);
        Payments pay = new Payments();
        
        System.out.println("\nWhich payment method to pay? Cash or Credit Card?\nPress c for Cash and e for Credit Card.");
        char inputPayMethod = input.next().charAt(0);
        System.out.println();
        
        if(inputPayMethod == 'c'){
            System.out.println("Enter the amount to be paid: ");
            pay.setBalance(input.nextDouble());
            pay.getBalance();
            pay.getBillNumber();
            pay.setLastName(newMember.getLastName());
            pay.setFirstName(newMember.getFirstName());
            pay.setAddress(newMember.getAddress());
            
            System.out.println(pay.toString1());
        }
        else if(inputPayMethod == 'e'){
            System.out.println("Enter Credit Card Number in format (XXXX-XXXX-XXXX-XXXX): ");
            pay.setCreditCardNumber(input.next());
            System.out.println("Enter the amount to be paid: ");
            pay.setBalance(input.nextDouble());
            pay.getBalance();
            pay.getBillNumber();
            pay.getCreditCardNumber();
            pay.setLastName(newMember.getLastName());
            pay.setFirstName(newMember.getFirstName());
            pay.setAddress(newMember.getAddress());
            
            System.out.println(pay.toString2());
        }
        return pay;
    }
    
    public static void runProgram(){
        employeeLogin();
        addMember();
    }
    
    public static String[] retrieveClient(Member m){
        String[] clientInfo = {"\nClient's Last Name: " + m.getLastName(),"Client's First Name: " + m.getFirstName(),"Address: " + m.getAddress(), "Phone Number: " + m.getPhoneNumber()};
        readArray(clientInfo);
        
        return clientInfo;
    }
    
    public static void readArray(String[] m){
        for(String member : m){
            System.out.println(member);
        }
    }
    
    public static ArrayList<Member> addMembersToList(Member m){
        ArrayList<Member> members = new ArrayList<>();
        
        members.add(m);
        
        return members;
    }
}

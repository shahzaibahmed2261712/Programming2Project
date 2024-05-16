/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

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
        addMember();
        
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
//    
//    public static Membership chooseMembership(Member newMember){
//        Scanner input = new Scanner(System.in);
//        
//    }
    
    
}

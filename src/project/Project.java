/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        Member m1 = runProgram();
    }

    public static Member runProgram() {
        ArrayList<Member> members = new ArrayList<>();
        
        employeeLogin();
        Member m = addMember();
        addMembersToList(m, members);
        
        //Member chooses membership then member gets stored in an array with their info.
        String[] clientInfo = client(m);
        readArray(clientInfo);
        
        //Serialzation
        serializeMember(clientInfo,"C:\\Users\\ahmed\\OneDrive\\Documents\\NetBeansProjects\\Project\\random.ser");
        String[] member = deserializeMember("C:\\Users\\ahmed\\OneDrive\\Documents\\NetBeansProjects\\Project\\random.ser");
        readArray(member);
        
        return m;
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
        
        //chooseMembership(m);
        
        return m;
    }
    
    public static String[] client(Member m){
        String[] clientInfo = new String[0];
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhich Membership does the member want?\nRegular or Premium\nPress r for regular or p for premium: ");
        char inputMembership = input.next().charAt(0);
        System.out.println();
        
        if(inputMembership == 'r' || inputMembership == 'R'){
            Regular r = regularMembership(m);
            Payments pay = payment(m);
            
            if(pay.creditCardNumber == null)
                clientInfo = new String[]{m.toString(), r.toString(), pay.toString1()};
            else if(pay.creditCardNumber != null){
                clientInfo = new String[]{m.toString(), r.toString(), pay.toString2()};
            }
        }
        else if (inputMembership == 'p' || inputMembership == 'P'){
            Premium p = premiumMembership(m);
            Payments pay = payment(m);
            
            if(pay.creditCardNumber == null)
                clientInfo = new String[]{m.toString(), p.toString(), pay.toString1()};
            else if(pay.creditCardNumber != null){
                clientInfo = new String[]{m.toString(), p.toString(), pay.toString2()};
            }
        }
        return clientInfo;
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
        
        //payment(newMember);

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
        
        //payment(newMember);
        
        return p;
    }
    
    public static Payments payment(Member newMember) {
        Scanner input = new Scanner(System.in);
        Payments pay = new Payments();

        System.out.println("\nWhich payment method to pay? Cash or Credit Card?\nPress c for Cash and e for Credit Card.");
        char inputPayMethod = input.next().charAt(0);
        System.out.println();

        if (inputPayMethod == 'c') {
            try {
                System.out.println("Enter the amount to be paid: ");
                double balance = input.nextDouble();
                if (balance < 0) {
                    throw new NegativeNumberException();
                }
                pay.setBalance(balance);
                pay.getBalance();
                pay.getBillNumber();
                pay.setLastName(newMember.getLastName());
                pay.setFirstName(newMember.getFirstName());
                pay.setAddress(newMember.getAddress());

                System.out.println(pay.toString1());
            } catch (NegativeNumberException nme) {
                System.out.println("Cannot be a negative balance.");
            }
        } else if (inputPayMethod == 'e') {

            try {
                System.out.println("Enter Credit Card Number in format (XXXX-XXXX-XXXX-XXXX): ");
                String cardNum = input.next();
                
                while (cardNum.length() < 19 || cardNum.length() > 19 || cardNum.charAt(4) != '-' || cardNum.charAt(9) != '-' || cardNum.charAt(14) != '-') {
//                    if (cardNum.length() < 19 || cardNum.length() > 19 || cardNum.charAt(4) != '-' || cardNum.charAt(9) != '-' || cardNum.charAt(14) != '-') {
                      
//                    }
                    System.out.println("\nNot Valid Credit Card Number. Follow Format: (XXXX-XXXX-XXXX-XXXX).");
                    System.out.println("Enter Credit Card Number in format (XXXX-XXXX-XXXX-XXXX): ");
                    cardNum = input.next();
                }
                pay.setCreditCardNumber(cardNum);

                System.out.println("Enter the amount to be paid: ");
                double balance = input.nextDouble();
                if (balance < 0) {
                    throw new NegativeNumberException();
                }
                pay.setBalance(balance);
                pay.getBalance();
                pay.getBillNumber();
                pay.getCreditCardNumber();
                pay.setLastName(newMember.getLastName());
                pay.setFirstName(newMember.getFirstName());
                pay.setAddress(newMember.getAddress());

                System.out.println(pay.toString2());
            } catch (NegativeNumberException nme) {
                System.out.println("Cannot be a negative balance.");
            }
        }
        return pay;
    }
    
    public static void readArray(String[] m){
        System.out.println();
        for(String member : m){
            System.out.println(member);
        }
    }
    
    public static ArrayList<Member> addMembersToList(Member m, ArrayList<Member> members){
        members.add(m);
        
        return members;
    }
    
    public static ArrayList<Member> removeMembersFromList(Member m, ArrayList<Member> members){
        members.remove(m);
        
        return members;
    }
    
    public static Member changePhoneNum(Member m, String newPhoneNum){
        m.setPhoneNumber(newPhoneNum);
        
        return m;
    }
    
    public static Member changeAddress(Member m, String newAddress){
        m.setAddress(newAddress);
        
        return m;
    }
    
    public static void serializeMember(String[] clientInfo, String path){
        try(FileOutputStream fos = new FileOutputStream(path)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientInfo);
        }
        catch(Exception e){
            System.out.println(e.getClass() + ": Cannot serialize member to file.");
        }
    }
    
    public static String[] deserializeMember(String path){
        Object obj= null;
        try(FileInputStream fis = new FileInputStream(path)){
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        }catch(Exception e){
            System.out.println(e.getClass() + ": Cannot deserialize member from file.");
        }
        return (String[]) obj;
    }
    
}

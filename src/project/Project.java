/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
        //Member m2 = runProgram();
    }

    /**
     * It runs the program to register a new member. Then serializes the member and
     * stores member in a file.
     * @return 
     */
    public static Member runProgram() {
        
        employeeLogin();
        Member m = addMember();
        addMembersToList(m);
        
        //Member chooses membership then member gets stored in an array with their info.
        String[] clientInfo = client(m);
        
        
        //Serialzation
        serializeMember(clientInfo);
        String[] member = deserializeMember("..\\Project\\random.ser");
        System.out.println("\nDeserialized Member:");
        readArray(member);
        
        
        //Write to file & Read from file.
        writeMemberToFile(clientInfo,"..\\Project\\members.txt");
        System.out.println("\nReading from file:");
        readArray(readMemberFromFile("..\\Project\\members.txt"));
        
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        return m;
    }

    /**
     * Employee Login
     * @return 
     */
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
    
    /**
     * Adds new member to the gym registration system.
     * @return 
     */
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
    
    /**
     * Takes in the member and asks user to input which membership the client wants.
     * Based on which membership the user has chosen, it invokes the appropriate membership class.
     * Then the payment class is called to set the bill for the client.
     * The method returns an array of string that includes the toString of member, membership and payment.
     * @param m
     * @return 
     */
    public static String[] client(Member m) {
        String[] clientInfo = new String[0];
        Scanner input = new Scanner(System.in);

        System.out.println("\nWhich Membership does the member want?\nRegular or Premium\nPress r for regular or p for premium: ");
        char inputMembership = input.next().charAt(0);
        System.out.println();

        while (inputMembership != 'r' && inputMembership != 'R' && inputMembership != 'p' && inputMembership != 'P') {
            System.out.println("Press r for regular or p for premium membership!");
            inputMembership = input.next().charAt(0);
            System.out.println();
        }

        if (inputMembership == 'r' || inputMembership == 'R') {
            Regular r = regularMembership(m);
            Payments pay = payment(m);

            if (pay.creditCardNumber == null) {
                clientInfo = new String[]{m.toString(), r.toString(), pay.toString1()};
            } else if (pay.creditCardNumber != null) {
                clientInfo = new String[]{m.toString(), r.toString(), pay.toString2()};
            }
        } else if (inputMembership == 'p' || inputMembership == 'P') {
            Premium p = premiumMembership(m);
            Payments pay = payment(m);

            if (pay.creditCardNumber == null) {
                clientInfo = new String[]{m.toString(), p.toString(), pay.toString1()};
            } else if (pay.creditCardNumber != null) {
                clientInfo = new String[]{m.toString(), p.toString(), pay.toString2()};
            }
        }
        return clientInfo;
    }

    public static Regular regularMembership(Member newMember) {
        Regular r = new Regular();
        
        
        System.out.println("Your Regular Membership Includes:");
        r.setMembershipCardNum();
        r.setUnlimitedAccess(true);
        r.setAccessToLockers(true);
        r.setaFreeGymShirt(true);
        r.setLastName(newMember.getLastName());
        r.setFirstName(newMember.getFirstName());
        r.setStatus();
        r.setPrice();
        System.out.println(r);

        return r;
    }
    
    public static Premium premiumMembership(Member newMember) {
        Premium p = new Premium();

        System.out.println("Your Premium Membership Includes:");
        p.setMembershipCardNum();
        p.setAnyLocationAccess(true);
        p.setAccessToSpa(true);
        p.setTwentyfivePercentDiscountOnFood(true);
        p.setLastName(newMember.getLastName());
        p.setFirstName(newMember.getFirstName());
        p.setStatus();
        p.setPrice();
        System.out.println(p);
        
        return p;
    }
    
    /**
     * This method asks the user to input which payment method they want to pay with.
     * Then it returns the payment class with billing info with 4 last digit of credit card if payed with credit card.
     * @param newMember
     * @return 
     */
    public static Payments payment(Member newMember) {
        Scanner input = new Scanner(System.in);
        Payments pay = new Payments();

        System.out.println("\nWhich payment method to pay? Cash or Credit Card?\nPress c for Cash and e for Credit Card.");
        char inputPayMethod = input.next().charAt(0);
        System.out.println();
        
        while(inputPayMethod != 'c' && inputPayMethod != 'C' && inputPayMethod != 'e' && inputPayMethod != 'E') {
            System.out.println("Press c to pay with cash or e to pay with a credit card!");
            inputPayMethod = input.next().charAt(0);
            System.out.println();
        }

        if (inputPayMethod == 'c' || inputPayMethod == 'C') {
            
            try {
                System.out.println("Enter the amount to be paid: ");
                Double balance = input.nextDouble();
                
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
            } catch (InputMismatchException ime) {
                System.out.println("Only input numbers.");
            }
            
        } else if (inputPayMethod == 'e' || inputPayMethod == 'E') {
            
            try {
                System.out.println("Enter Credit Card Number in format (XXXX-XXXX-XXXX-XXXX): ");
                String cardNum = input.next();
                
                while (cardNum.length() < 19 || cardNum.length() > 19 || cardNum.charAt(4) != '-' || cardNum.charAt(9) != '-' || cardNum.charAt(14) != '-') {
                    System.out.println("\nNot Valid Credit Card Number. Follow Format: (XXXX-XXXX-XXXX-XXXX).");
                    System.out.println("Enter Credit Card Number in format (XXXX-XXXX-XXXX-XXXX): ");
                    cardNum = input.next();
                }
                pay.setCreditCardNumber(cardNum);

                System.out.println("\nEnter the amount to be paid: ");
                double balance = input.nextDouble();
                
                if (balance < 0  ) {
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
            } catch (InputMismatchException ime){
                System.out.println("Only input numbers.");
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
    
    public static ArrayList<Member> addMembersToList(Member m){
        ArrayList member = new ArrayList<>();
        member.add(m);
        
        return member;
    }
    
    public static ArrayList<Member> removeMembersFromList(Member m){
        ArrayList member = new ArrayList<>();
        member.remove(m);
        
        return member;
    }
    
    public static Member changePhoneNum(Member m, String newPhoneNum){
        m.setPhoneNumber(newPhoneNum);
        
        return m;
    }
    
    public static Member changeAddress(Member m, String newAddress){
        m.setAddress(newAddress);
        
        return m;
    }
    
    /**
     * This method serializes the new member.
     * @param clientInfo 
     */
    public static void serializeMember(String[] clientInfo){
        String path = "..\\Project\\random.ser";
        try(FileOutputStream fos = new FileOutputStream(path)){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(clientInfo);
        }
        catch(Exception e){
            System.out.println(e.getClass() + ": Cannot serialize member to file.");
        }
    }
    
    /**
     * This method deserializes the member.
     * @param path
     * @return 
     */
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
    
    /**
     * A member is written to a file to store their info with personal info, membership info and payment info.
     * @param clientInfo
     * @param path 
     */
    public static void writeMemberToFile(String[] clientInfo,String path){
        File file = new File(path);
        
        try(FileWriter fw = new FileWriter(file, true)){
            for(String member : clientInfo){
                fw.write(member + "\n");
            }
        }catch(IOException ioe){
            System.out.println(ioe.getClass() + ": " + ioe.getMessage());
        }
    }
    
    /**
     * Here, the registered members are retrieved from a file.
     * @param path
     * @return 
     */
    
    public static String[] readMemberFromFile(String path) {
        File file = new File(path);
        String members = "";
        String[] split = new String[0];

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                members += input.next() + " ";
                split = members.split("-- ");
            }
        } catch (IOException ioe) {
            System.out.println("File " + path + " does not exist.");
        }
        return split;
    }
}

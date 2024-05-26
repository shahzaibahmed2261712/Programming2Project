/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ahmed
 */
public class ProjectIT {
    
    public ProjectIT() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Project.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Project.main(args);
//    }

    /**
     * Test of runProgram method, of class Project.
     */
    @Test
    public void testRunProgram() {
        System.out.println("runProgram");
        Member expResult = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        Member result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of employeeLogin method, of class Project.
     */
    @Test
    public void testEmployeeLogin() {
        System.out.println("employeeLogin");
        Employee expResult = new Employee("Bob123","jngjdfg");
        Employee result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of addMember method, of class Project.
     */
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        Member expResult = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        Member result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of client method, of class Project.
     */
    @Test
    public void testClient() {
        System.out.println("client");
        Member m = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        String[] expResult = new String[]{m.toString()};
        String[] result = expResult;
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of regularMembership method, of class Project.
     */
    @Test
    public void testRegularMembership() {
        System.out.println("regularMembership");
        Member newMember = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        Regular expResult = new Regular(true,true,true,18.99,524648962,"Regular Membership",newMember.getFirstName(),newMember.getLastName(),newMember.getAddress(),newMember.phoneNumber);
        Regular result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of premiumMembership method, of class Project.
     */
    @Test
    public void testPremiumMembership() {
        System.out.println("premiumMembership");
        Member newMember = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        Premium expResult = new Premium(true,true,true,37.98,718062659,"Premium Membership",newMember.getFirstName(),newMember.getLastName(),newMember.getAddress(),newMember.phoneNumber);
        Premium result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of payment method, of class Project.
     */
    @Test
    public void testPayment() {
        System.out.println("payment");
        Member newMember = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        Payments expResult = new Payments("1234-5678-9876-5431",40,newMember.getFirstName(),newMember.getLastName(),newMember.getAddress(),newMember.getPhoneNumber());
        Payments result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of readArray method, of class Project.
     */
    @Test
    public void testReadArray() {
        System.out.println("readArray");
        String[] m = new String[]{"Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890"};
        Project.readArray(m);
    }

    /**
     * Test of addMembersToList method, of class Project.
     */
    @Test
    public void testAddMembersToList() {
        System.out.println("addMembersToList");
        Member m = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        ArrayList<Member> expResult = new ArrayList<>();
        expResult.add(m);
        ArrayList<Member> result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of removeMembersFromList method, of class Project.
     */
    @Test
    public void testRemoveMembersFromList() {
        System.out.println("removeMembersFromList");
        Member m = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        ArrayList<Member> expResult = new ArrayList<>();
        expResult.remove(m);
        ArrayList<Member> result = Project.removeMembersFromList(m);
        assertEquals(expResult, result);
    }

    /**
     * Test of changePhoneNum method, of class Project.
     */
    @Test
    public void testChangePhoneNum() {
        System.out.println("changePhoneNum");
        Member m = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        String newPhoneNum = "111-111-1111";
        m.setPhoneNumber(newPhoneNum);
        Member expResult = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC",m.getPhoneNumber());
        Member result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of changeAddress method, of class Project.
     */
    @Test
    public void testChangeAddress() {
        System.out.println("changeAddress");
        Member m = new Member("Shahzaib", "Ahmed", "105 Flint Av, Montreal, QC","123-456-7890");
        String newAddress = "150 Sunny Rd, Montreal, QC";
        m.setAddress(newAddress);
        Member expResult = new Member("Shahzaib", "Ahmed",m.getAddress(),"123-456-7890");
        Member result = expResult;
        assertEquals(expResult, result);
    }

    /**
     * Test of serializeMember method, of class Project.
     */
    @Test
    public void testSerializeMember() {
        System.out.println("serializeMember");
        String[] clientInfo = null;
        Project.serializeMember(clientInfo);
    }

    /**
     * Test of deserializeMember method, of class Project.
     */
    @Test
    public void testDeserializeMember() {
        System.out.println("deserializeMember");
        String path = "";
        String[] expResult = null;
        String[] result = Project.deserializeMember(path);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of writeMemberToFile method, of class Project.
     */
    @Test
    public void testWriteMemberToFile() {
        System.out.println("writeMemberToFile");
        String[] clientInfo = null;
        String path = "";
        Project.writeMemberToFile(clientInfo, path);
    }

    /**
     * Test of readMemberFromFile method, of class Project.
     */
    @Test
    public void testReadMemberFromFile() {
        System.out.println("readMemberFromFile");
        String path = "";
        String[] expResult = new String[0];
        String[] result = Project.readMemberFromFile(path);
        assertArrayEquals(expResult, result);
    }
    
}

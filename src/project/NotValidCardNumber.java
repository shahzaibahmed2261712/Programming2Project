/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ahmed
 */
public class NotValidCardNumber extends RuntimeException{

    public NotValidCardNumber() {
        super("The card number entered is not valid.");
    }

    public NotValidCardNumber(String message) {
        super(message);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ahmed
 */
public class NotValidCardNumberException extends RuntimeException{

    public NotValidCardNumberException() {
        super("The card number entered is not valid.");
    }

    public NotValidCardNumberException(String message) {
        super(message);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;

public class JavaApplication11 {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name in this order (LastName,FirstName): ");
        String fullName = scanner.nextLine();

        String[] nameOrders = fullName.split(",");

        if (nameOrders.length == 2) {
        String lastName = nameOrders[0].trim();
        String firstName = nameOrders[1].trim();
        System.out.println("Hi " + firstName + " " + lastName + "! Welcome to my Java class.");
        } else {
        System.out.println("Invalid input format. Please enter LastName,FirstName.");
        }
    }
}
        
    
    


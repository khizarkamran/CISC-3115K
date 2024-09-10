/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
import java.util.Scanner;
/**
 *
 * @author khizark
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) { 
            System.out.println("Valid password");
            
        } else { 
            System.out.println("Invalid password");
        }
        
        scanner.close();

    }
    
    public static boolean isValidPassword(String password) { 
        if (password.length() < 8 ) { 
            return false;
        }
        int digitCount = 0;
        for (int i = 0; i < password.length(); i ++) { 
            char ch = password.charAt(i);
      if (!Character.isLetterOrDigit(ch)) {
                return false; // Only letters and numbers are allowed
            }

            if (Character.isDigit(ch)) {
                digitCount++; // Increase count for each number found
            }
        }

        // The password is only good if it has 2 or more numbers
        if (digitCount < 2) {
            return false;
        }

        return true; 
    }
}
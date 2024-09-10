/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;
import java.util.Scanner;
/**
 *
 * @author khizark
 */
public class JavaApplication17 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0; 
        int count = 0;
        
        System.out.println("Enter numbers with spaces (end with 0):");

        int number; 

        do {
            number = scanner.nextInt(); 

            if (number == 0) {
                if (count == 0) { 
                    max = 0;
                    count = 1;
                }
                break; 
            }

            if (count == 0) { // If it's the first valid number
                max = number; 
                count = 1; 
            } else if (number > max) {
                max = number; 
                count = 1; // Reset count for the new max
            } else if (number == max) {
                count++; // Increment count if the same max is encountered again
            }
        } while (true); 

        // Output the results
        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is: " + count);
        
        scanner.close(); // Close the scanner 
    }
}
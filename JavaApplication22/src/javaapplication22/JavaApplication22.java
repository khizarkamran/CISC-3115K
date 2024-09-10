/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;
import java.util.Scanner;
/**
 *
 * @author khizark
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String input = scanner.nextLine();
        
        input = input.toLowerCase();
        
        int vowelCount = 0;
        int consonantCount = 0;
        

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); 

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; 
            } else if ((ch >= 'a' && ch <= 'z')) { 
                consonantCount++; // Increase consonant count
            }
        }

        
        System.out.println("The number of vowels is " + vowelCount);
        System.out.println("The number of consonants is " + consonantCount);

        scanner.close(); 
    }
}
        
    
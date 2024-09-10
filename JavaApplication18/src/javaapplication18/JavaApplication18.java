/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author khizark
 */
public class JavaApplication18 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numList1 = new int[10];  

        System.out.println("Enter 10 numbers (each between 0 and 9):");
       
        for (int i = 0; i < numList1.length; i++) {
        numList1[i] = scanner.nextInt();
            
        while (numList1[i] < 0 || numList1[i] > 9) {
        System.out.println("Invalid input. Please enter a number between 0 and 9:");
        numList1[i] = scanner.nextInt();
        }
      }

        printArray(numList1);

        int[] counts = countNumbers(numList1);
        for (int i = 0; i < counts.length; i++) {
        System.out.println("Number of " + i + "s: " + counts[i]);
        }

        scanner.close();
    }

    public static void printArray(int[] array) {
        System.out.print("Entered numbers are: ");
        for (int number : array) {
        System.out.print(number + " ");
        }
        System.out.println(); 
    }

    public static int[] countNumbers(int[] numList) {
        int[] countList = new int[10]; 
        for (int number : numList) {
        countList[number]++; 
        }
        return countList;
    }
}
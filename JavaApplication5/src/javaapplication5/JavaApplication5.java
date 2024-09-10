/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
  import java.util.Scanner;
             
             
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please input Celsius: ");
        int celsius = scanner.nextInt();
        
        double fahrenheit = (9.0/5.0 * celsius) + 32;
        System.out.println("The calculated Fahrenheit of you input is: " + fahrenheit);
    }
    
}

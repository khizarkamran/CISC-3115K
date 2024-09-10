/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author khizark
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Please enter 3 angles for a triangle");
    int angle1 = scanner.nextInt();
    int angle2 = scanner.nextInt();
    int angle3 = scanner.nextInt();

    if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
    if (angle1 + angle2 + angle3 == 180) {
        System.out.println("This is a valid triangle");
    }else 
        System.out.println("This is not a valid triangle");
          
    } else
        System.out.println("Input is invalid - please try again");
    

        
        

    
    }
    
}
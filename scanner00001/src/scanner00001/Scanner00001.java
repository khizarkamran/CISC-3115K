/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner00001;

import java.util.Scanner;
    import java.util.scanner 

public class Scanner00001 {
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double fixedWidth = 4.5;
        double fixedHeight = 7.9;
        
        double fixedArea = fixedWidth * fixedHeight;
        double fixedPerimeter = 2 * ( fixedWidth + fixedHeight);
        
        
        System.out.println("The Area of a rectangle with a width "
                + "of 4.5 and a height of 7.9 is: " + fixedArea);
        System.out.println("The Perimeter of a rectangle with a width of "
                + "4.5 and a height of 7.9 is: " + fixedPerimeter);


        System.out.print("Please enter the with: ");
        double userWidth = scanner.nextDouble();
        
        System.out.print( "Please enter the height: " );
        double userHeight = scanner.nextDouble();
       
        double userArea = userWidth * userHeight;
        double userPerimeter = 2 * (userWidth + userHeight);


        System.out.println("The Area of a rectangle with a width of " + userWidth + 
                " and a height of " + userHeight + " is: " + userArea);
        System.out.println("The Perimeter of a rectangle with a width of "
                + userWidth + " and a height of " + userHeight + " is: " + userPerimeter);
       
        scanner.close();
     
    }
    
}

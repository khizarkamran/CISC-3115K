/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.Scanner;

/**
 *
 * @author khizark
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number between 0 - 6:");
            
    int weekday = scanner.nextInt(); 
    switch (weekday) {
        case 1:
        case 3:
            System.out.println("Our Java class meets on Monday and Wednesday");
            System.out.println("We meet from 8:40 – 10:4");
            break;
        case 2:
        case 4:
        case 5:
            System.out.println("We do not have Java today, but we have other classes");
            break;
        case 0:
        case 6:
            System.out.println("We have no classes today");
            System.out.println("It is the weekend");
            break;
        default:
             
            System.out.print("error");
            
    }
            
            
            
             //////  MUlti IF else ///
            
            
            if ( weekday == 1 || weekday == 3 ){
                System.out.println("Our Java class meets on Monday and Wednesday");
                System.out.println("We meet from 8:40 – 10:4");
 
            }
            else if (weekday == 2 || weekday == 4 || weekday == 5){
                System.out.println("We do not have Java today, but we have other classes");
            } 
            else if (weekday == 0 || weekday == 3){
                System.out.println(" We have no class today");
                System.out.println("It is the weekend");
                
            }
            else
                System.out.print("error");
               
            
                  
    
            }
    
        

}
  
1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication23;

/**
 *
 * @author khizark
 */
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 1; i<= 7 ; i++){
           
        for (int j = i; j<=7; j++){
        
        System.out.println(i + "  " + j);
        count++;
   
        }   
           
      }
        System.out.println("The total number of all combinations is " + count);
    
    
    }
    
}

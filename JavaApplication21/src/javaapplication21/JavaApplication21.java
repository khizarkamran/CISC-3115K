/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication21;

/**
 *
 * @author khizark
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double milesToKilometers = 1.609;
        
        int startMile = 1;
        // Maximum mile
        int maxMile = 10;
        
        System.out.println("Miles      Kilometers");
        
        for (int mile = startMile; mile <= maxMile; mile++) {
            double kilometers = mile * milesToKilometers;
            // Print the mile and the corresponding kilometers
            System.out.println(mile + "          " + String.format("%.3f", kilometers));
        }
    }
}
    
  
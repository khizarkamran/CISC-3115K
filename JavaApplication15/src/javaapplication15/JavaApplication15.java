/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

/**
 *
 * @author khizark
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count;
System.out.println("counts for each pass");
for ( int i = 1; i <= 10; i++){
	count = 0; 
for (int j =1; j <= 5; j++)
	count++;
System.out.println(count + " for pass " +i);
}
System.out.println("finised processing");
    }
    
}

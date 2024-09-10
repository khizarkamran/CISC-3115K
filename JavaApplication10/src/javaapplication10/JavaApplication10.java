/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
/**
 *
 * @author khizark
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Name1 = "Jimmy";
        String Name2 = "John";
        String Name3 = "George";
        String last1 = "Bob";
        String last2 = "Adams";
        String last3 = "Sal";
              
        double gpa1 = 4.0;
        double gpa2 = 3.2;	
        double gpa3 = 2.5;
        
        System.out.printf("%-13s%-13s%-5s\n","FirstName","LastName ","Gpa");
        System.out.printf("%-13s%-13s%5.2f\n", Name1,last1, gpa1);
        System.out.printf("%-13s%-13s%5.2f\n", Name2,last2, gpa2);
        System.out.printf("%-13s%-13s%5.2f\n", Name3,last3, gpa3);

        
    }
    
}

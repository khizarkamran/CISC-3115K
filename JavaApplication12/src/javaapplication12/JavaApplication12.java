/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;
import java.util.Scanner;

/**
 *
 * @author khizark
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter your First Name: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("Enter your Last Name: ");
        String lastName = scanner.nextLine().trim();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("The name of your city: ");
        String city = scanner.nextLine().trim();
        System.out.println("Enter a profession: ");
        String profession = scanner.nextLine().trim();
        System.out.println("The name of a college");
        String college = scanner.nextLine().trim();
        System.out.println("A type of animal: ");
        String animal = scanner.nextLine().trim();
        System.out.println("A pet's name: ");
        String petName  = scanner.nextLine().trim();
        
        if (firstName.length() < 2 || lastName.length() < 2 || age <= 0 ||
            city.length() < 2 || college.length() < 2 || profession.length() < 2 ||
            animal.length() < 2 || petName.length() < 2) {
            System.out.println("Error: Input must be more than one character long, except for the age which must be greater than 0.");
            return; 
        }
        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        
        String initials = String.valueOf(firstInitial) + String.valueOf(lastInitial);

       
        System.out.println("\nStory:");
        System.out.println("There once was a person named " + firstName + " " + lastName + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + firstName + " went to college at " + college + ".");
        System.out.println(firstName + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + firstName + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after!\n");
        
         System.out.println("Combined Initials: " + initials);

        scanner.close();      
        
    }
    
}

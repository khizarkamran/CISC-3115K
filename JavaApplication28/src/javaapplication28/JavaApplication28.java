/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author khizark
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean continuePlay = true;
        
        
        while (continuePlay) { 
        int testType = 0;
            
            while ( testType != 1 && testType != 2 ) { 
                System.out.println("Enter the number 1 for addition and 2 for multiplication: ");
                testType = input.nextInt();
            }
        int number1 = random.nextInt(11);
        int number2 = random.nextInt(11);
        int correctAnswer;
        
        
        if ( testType == 1) { 
            correctAnswer = number1 + number2;
            System.out.println("What is " + number1 + " + " + number2 + "?");
        } else { 
            correctAnswer = number1 * number2;
            System.out.print("What is " + number1 + " * " + number2 + "?");
        }
        
        int userAnswer;
        int attempts = 0;
        boolean correct = false;
        
        while ( attempts < 3 && !correct) { 
            userAnswer = input.nextInt();
            
        if (userAnswer == correctAnswer) { 
           System.out.println("Nice work");
           correct = true;
    } else { 
           attempts++;
        if (attempts < 3) { 
            System.out.println("Not correct, Try again");
        }
    }
}
        
        if (!correct) { 
            System.out.println(" Not correct. The correct answer is" + correctAnswer);
        }
        
            System.out.println("Do you want to play again? Type 1 for yes or 2 for no");
            int response = input.nextInt();
            
        if (response != 1) { 
            continuePlay = false;
        }
    }
        
       input.close();
    }
}
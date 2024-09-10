/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.and.multi.pkgif;
import java.util.Scanner; 
/**
 *
 * @author khizark
 */
public class SwitchAndMultiIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        system.out.println("Input a number between 0 - 6:");
            
    int weekday = scanner.nextInt(); 
    switch (weekday) {
        case 1:
        case 3:
            system.out.println("Our Java class meets on Monday and Wednesday");
            system.out.println("We meet from 8:40 – 10:4");
        break;
        case 2:
        case 4:
        case 5:
            system.out.println("We do not have Java today, but we have other classes");
        break;
        case 0:
        case 6:
            system.out.println("We have no classes today");
            system.out.prtintln("It is the weekend");
        break;
            
        
        
    }
        
        
        
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Phonebook {

    // Constants
    static final int MAX_ENTRIES = 10;

    // Arrays to store phonebook data
    static String[] firstNames = new String[MAX_ENTRIES];
    static String[] lastNames = new String[MAX_ENTRIES];
    static String[] phoneNumbers = new String[MAX_ENTRIES];
    
    // Current number of entries in the phonebook
    static int entryCount = 0;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);

        // Load data from input file
        System.out.print("Name of input file: ");
        String inputFileName = keyboard.next();
        loadPhonebook(inputFileName);

        // Menu loop
        char choice;
        do {
            printMenu();
            choice = keyboard.next().charAt(0);

            switch (choice) {
                case 'l': // Lookup
                    lookupEntry(keyboard);
                    break;
                case 'r': // Reverse lookup
                    reverseLookup(keyboard);
                    break;
                case 'c': // Change phone number
                    changeNumber(keyboard);
                    break;
                case 'a': // Add entry
                    addEntry(keyboard);
                    break;
                case 'q': // Quit
                    System.out.print("Name of output file: ");
                    String outputFileName = keyboard.next();
                    savePhonebook(outputFileName);
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 'q');
    }

    // Method to print menu options
    private static void printMenu() {
        System.out.println("\nChoices:");
        System.out.println("l: lookup");
        System.out.println("r: reverse lookup");
        System.out.println("c: change number");
        System.out.println("a: add entry");
        System.out.println("q: quit");
    }

    // Load data from the input file into the phonebook arrays
    private static void loadPhonebook(String fileName) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File(fileName));
        while (fileScanner.hasNext() && entryCount < MAX_ENTRIES) {
            firstNames[entryCount] = fileScanner.next();
            lastNames[entryCount] = fileScanner.next();
            phoneNumbers[entryCount] = fileScanner.next();
            entryCount++;
        }
        fileScanner.close();
    }

    // Lookup an entry by first and last name
    private static void lookupEntry(Scanner keyboard) {
        System.out.print("First name: ");
        String firstName = keyboard.next();
        System.out.print("Last name: ");
        String lastName = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (firstNames[i].equals(firstName) && lastNames[i].equals(lastName)) {
                System.out.println(firstName + " " + lastName + "'s phone number is " + phoneNumbers[i]);
                return;
            }
        }
        System.out.println("Name not found");
    }

    // Reverse lookup by phone number
    private static void reverseLookup(Scanner keyboard) {
        System.out.print("Phone number: ");
        String phoneNumber = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (phoneNumbers[i].equals(phoneNumber)) {
                System.out.println(phoneNumber + " is " + firstNames[i] + " " + lastNames[i] + "'s phone number");
                return;
            }
        }
        System.out.println("Phone number not found");
    }

    // Change the phone number of an existing entry
    private static void changeNumber(Scanner keyboard) {
        System.out.print("First name: ");
        String firstName = keyboard.next();
        System.out.print("Last name: ");
        String lastName = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (firstNames[i].equals(firstName) && lastNames[i].equals(lastName)) {
                System.out.print("New phone number: ");
                phoneNumbers[i] = keyboard.next();
                System.out.println("Phone number updated");
                return;
            }
        }
        System.out.println("Name not found");
    }

    // Add a new entry
    private static void addEntry(Scanner keyboard) {
        if (entryCount >= MAX_ENTRIES) {
            System.out.println("Database is full");
            return;
        }

        System.out.print("First name: ");
        String firstName = keyboard.next();
        System.out.print("Last name: ");
        String lastName = keyboard.next();

        // Check if the entry already exists
        for (int i = 0; i < entryCount; i++) {
            if (firstNames[i].equals(firstName) && lastNames[i].equals(lastName)) {
                System.out.println("That name already exists");
                return;
            }
        }

        System.out.print("Phone number: ");
        String phoneNumber = keyboard.next();

        // Add the new entry
        firstNames[entryCount] = firstName;
        lastNames[entryCount] = lastName;
        phoneNumbers[entryCount] = phoneNumber;
        entryCount++;
        System.out.println("Entry added");
    }

    // Save the phonebook data to the output file
    private static void savePhonebook(String fileName) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(fileName));

        for (int i = 0; i < entryCount; i++) {
            writer.println(firstNames[i] + " " + lastNames[i] + " " + phoneNumbers[i]);
        }
        writer.close();
    }
}

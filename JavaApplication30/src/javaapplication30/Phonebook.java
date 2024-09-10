/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Phonebook {
    static final int MAX_ENTRIES = 10;

    private static String[] firstNames = new String[MAX_ENTRIES];
    private static String[] lastNames = new String[MAX_ENTRIES];
    private static String[] phoneNumbers = new String[MAX_ENTRIES];
    
    static int entryCount = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Name of the input file: ");
        String inputFileName = keyboard.next();
        loadPhonebook(inputFileName);

        char choice;
        do {
            printMenu();
            choice = keyboard.next().charAt(0);
            switch (choice) {
                case 'l':
                    lookupEntry(keyboard);
                    break;
                case 'r':
                    reverseLookup(keyboard);
                    break;
                case 'c':
                    changePhoneNumber(keyboard);
                    break;
                case 'a':
                    addEntry(keyboard);
                    break;
                case 'q':
                    System.out.print("Name of output file: ");
                    String outputFileName = keyboard.next();
                    savePhonebook(outputFileName);
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 'q');

        keyboard.close();
    }

    public static void loadPhonebook(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNext() && entryCount < MAX_ENTRIES) {
                firstNames[entryCount] = fileScanner.next();
                lastNames[entryCount] = fileScanner.next();
                phoneNumbers[entryCount] = fileScanner.next();
                entryCount++;
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    private static void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("l - lookup");
        System.out.println("r - reverse lookup");
        System.out.println("c - change number");
        System.out.println("a - add entry");
        System.out.println("q - quit");
    }

    private static void lookupEntry(Scanner keyboard) {
        System.out.println("Enter first name: ");
        String firstName = keyboard.next();
        System.out.println("Enter last name: ");
        String lastName = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (firstNames[i].equals(firstName) && lastNames[i].equals(lastName)) {
                System.out.println("Phone number: " + phoneNumbers[i]);
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    private static void changePhoneNumber(Scanner keyboard) {
        System.out.println("Enter first name: ");
        String firstName = keyboard.next();
        System.out.println("Enter last name: ");
        String lastName = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (firstNames[i].equals(firstName) && lastNames[i].equals(lastName)) {
                System.out.println("Enter new phone number (nnn-nnn-nnnn): ");
                phoneNumbers[i] = keyboard.next();
                System.out.println("Phone number updated.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    private static void reverseLookup(Scanner keyboard) {
        System.out.println("Enter phone number (nnn-nnn-nnnn): ");
        String phoneNumber = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (phoneNumbers[i].equals(phoneNumber)) {
                System.out.println("Name: " + firstNames[i] + " " + lastNames[i]);
                return;
            }
        }
        System.out.println("Phone number not found.");
    }

    private static void addEntry(Scanner keyboard) {
        if (entryCount >= MAX_ENTRIES) {
            System.out.println("Phonebook is full. Cannot add new entry.");
            return;
        }
        System.out.println("Enter first name: ");
        String firstName = keyboard.next();
        System.out.println("Enter last name: ");
        String lastName = keyboard.next();

        for (int i = 0; i < entryCount; i++) {
            if (firstNames[i].equals(firstName) && lastNames[i].equals(lastName)) {
                System.out.println("An entry with this name already exists.");
                return;
            }
        }
        System.out.println("Enter phone number (nnn-nnn-nnnn): ");
        String phoneNumber = keyboard.next();

        firstNames[entryCount] = firstName;
        lastNames[entryCount] = lastName;
        phoneNumbers[entryCount] = phoneNumber;
        entryCount++;

        System.out.println("New entry added.");
    }

    private static void savePhonebook(String outputFileName) {
        try {
            PrintWriter writer = new PrintWriter(new File(outputFileName));
            for (int i = 0; i < entryCount; i++) {
                writer.println(firstNames[i] + " " + lastNames[i] + " " + phoneNumbers[i]);
            }
            writer.close();
            System.out.println("Phonebook data saved to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error saving file.");
        }
    }
}
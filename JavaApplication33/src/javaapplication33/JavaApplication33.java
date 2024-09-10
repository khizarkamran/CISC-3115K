/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

import java.util.*;
import java.io.*;

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Read input file
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.loadFromFile("entries_input.txt");
        
        boolean running = true;
        while (running) {
            // Show choices
            System.out.println("\nChoices:");
            System.out.println("l: lookup, r: reverse lookup, c: change number, a: add entry, q: quit");
            String choice = input.nextLine().toLowerCase();
            
            switch (choice) {
                case "l": // Lookup by name
                    System.out.print("First name: ");
                    String firstName = input.nextLine();
                    System.out.print("Last name: ");
                    String lastName = input.nextLine();
                    phoneBook.lookup(firstName, lastName);
                    break;
                case "r": // Reverse lookup by phone number
                    System.out.print("Phone number: ");
                    String phoneNumber = input.nextLine();
                    phoneBook.reverseLookup(phoneNumber);
                    break;
                case "c": // Change phone number
                    System.out.print("First name: ");
                    firstName = input.nextLine();
                    System.out.print("Last name: ");
                    lastName = input.nextLine();
                    System.out.print("New phone number: ");
                    phoneNumber = input.nextLine();
                    phoneBook.changeNumber(firstName, lastName, phoneNumber);
                    break;
                case "a": // Add entry
                    System.out.print("First name: ");
                    firstName = input.nextLine();
                    System.out.print("Last name: ");
                    lastName = input.nextLine();
                    System.out.print("Phone number: ");
                    phoneNumber = input.nextLine();
                    phoneBook.addEntry(firstName, lastName, phoneNumber);
                    break;
                case "q": // Quit and write to output file
                    System.out.print("Name of output file: ");
                    String outputFileName = input.nextLine();
                    phoneBook.writeToFile(outputFileName);
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    // Method to load data from a file
    public void loadFromFile(String fileName) {
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String[] entry = fileScanner.nextLine().split("-");
                if (entry.length == 3) {
                    String fullName = entry[0].trim() + " " + entry[1].trim();
                    String phoneNumber = entry[2].trim();
                    phoneBook.put(fullName, phoneNumber);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }

    // Method to write data to a file
    public void writeToFile(String fileName) {
        try (PrintWriter outputFile = new PrintWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                outputFile.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Data written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Lookup by name
    public void lookup(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        if (phoneBook.containsKey(fullName)) {
            System.out.println(fullName + "'s phone number is " + phoneBook.get(fullName));
        } else {
            System.out.println("Name not found");
        }
    }

    // Reverse lookup by phone number
    public void reverseLookup(String phoneNumber) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                System.out.println(phoneNumber + " is " + entry.getKey() + "'s phone number");
                return;
            }
        }
        System.out.println("Phone number not found");
    }

    // Change phone number
    public void changeNumber(String firstName, String lastName, String newPhoneNumber) {
        String fullName = firstName + " " + lastName;
        if (phoneBook.containsKey(fullName)) {
            phoneBook.put(fullName, newPhoneNumber);
System.out.println("Phone number updated");
        } else {
            System.out.println("Name not found");
        }
    }

    // Add a new entry
    public void addEntry(String firstName, String lastName, String phoneNumber) {
        String fullName = firstName + " " + lastName;
        if (phoneBook.containsKey(fullName)) {
            System.out.println("That name already exists");
        } else {
            phoneBook.put(fullName, phoneNumber);
            System.out.println("Entry added");
        }
    }
}
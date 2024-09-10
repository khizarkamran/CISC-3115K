/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author khizark
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX_Students = 20;
        int[] test1 = new int[MAX_Students];
        int[] test2 = new int[MAX_Students];
        int[] test3 = new int[MAX_Students];
        int studentCount = 0;
        
    File inputFile = new File("yourNameTestScores.txt");
        if (inputFile.exists() && inputFile.isFile()) {
            try {
                Scanner scanner = new Scanner(inputFile);
                while (scanner.hasNextInt() && studentCount < MAX_STUDENTS) {
                    test1[studentCount] = scanner.nextInt();
                    test2[studentCount] = scanner.nextInt();
                    test3[studentCount] = scanner.nextInt();
                    studentCount++;
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error reading input file.");
                return;
            }
        } else {
            System.out.println("Input file does not exist or is not a file.");
            return;
        }

        // Compute averages
        int[] averages = computeAverage(test1, test2, test3, studentCount);
        int[] copyAverages = new int[studentCount];

        // Copy and sort averages
        copyArray(averages, copyAverages, studentCount);
        sortArray(copyAverages, studentCount);

        // Write to the output file
        try {
            PrintWriter writer = new PrintWriter("yourNameTestScoresOut.txt");
            writer.println("Number of students is: " + studentCount);
            writer.println("Student Test1 Test2 Test3 Average");

            for (int i = 0; i < studentCount; i++) {
                writer.printf("%d %d %d %d %d%n", i + 1, test1[i], test2[i], test3[i], averages[i]);
            }

            writer.println("Highest Average is: " + copyAverages[studentCount - 1]);
            writer.println("Lowest Average is: " + copyAverages[0]);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error creating output file.");
        }

        System.out.println("Program has ended.");
    }

    // Method to copy the averages array
    public static void copyArray(int[] source, int[] destination, int length) {
        for (int i = 0; i < length; i++) {
            destination[i] = source[i];
        }
    }

    // Method to sort the array using selection sort
    public static void sortArray(int[] array, int length) {
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Method to compute the averages
    public static int[] computeAverage(int[] test1, int[] test2, int[] test3, int length) {
        int[] averages = new int[length];
        for (int i = 0; i < length; i++) {
            averages[i] = (test1[i] + test2[i] + test3[i]) / 3;
        }
        return averages;
    }
}
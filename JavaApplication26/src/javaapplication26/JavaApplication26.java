/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author khizark
 */
public class YourNameTestScores {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        final int MAX_STUDENTS = 20;
        int[] test1 = new int[MAX_STUDENTS];
        int[] test2 = new int[MAX_STUDENTS];
        int[] test3 = new int[MAX_STUDENTS];
        double[] averages = new double[MAX_STUDENTS];
        int studentCount = 0;

        File inputFile = new File("yourNameTestScores.txt");
        if (!inputFile.exists()) {
            System.err.println("Error: File 'yourNameTestScores.txt' not found.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null && studentCount < MAX_STUDENTS) {
                String[] scores = line.split(" ");
                test1[studentCount] = Integer.parseInt(scores[0]);
                test2[studentCount] = Integer.parseInt(scores[1]);
                test3[studentCount] = Integer.parseInt(scores[2]);
                averages[studentCount] = (test1[studentCount] + test2[studentCount] + test3[studentCount]) / 3.0;
                studentCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        if (studentCount == 0) {
            System.err.println("No students' data found in the file.");
            return;
        }

        double[] copyAverages = Arrays.copyOf(averages, studentCount);
        Arrays.sort(copyAverages);

        try (PrintWriter writer = new PrintWriter(new FileWriter("yourNameTestScoresOut.txt"))) {
            writer.println("Number of students is: " + studentCount);
            writer.println("Student Test1 Test2 Test3 Average");
            for (int i = 0; i < studentCount; i++) {
                writer.printf("%d %d %d %d %.2f%n", i + 1, test1[i], test2[i], test3[i], averages[i]);
            }
            writer.printf("Highest Average is: %.2f%n", copyAverages[studentCount - 1]);
            writer.printf("Lowest Average is: %.2f%n", copyAverages[0]);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            return;
        }

        System.out.println("The program has ended.");
    }
 }   
}
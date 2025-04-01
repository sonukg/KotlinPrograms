package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class WriteReadCSVFile {
    public static void writeCsv(String filePath) {
        try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            writer.println("Name,Age,Occupation");
            writer.println("SKG,30,Engineer");
            writer.println("Ram,25,Doctor");
            System.out.println("CSV file created successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }


    public static void readCsv(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                System.out.println(Arrays.toString(values));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error reading CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "data.csv";
        writeCsv(filePath);
        System.out.println("\nReading CSV:");
        readCsv(filePath);
    }
}


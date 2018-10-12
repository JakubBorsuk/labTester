/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtester;

import java.io.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 342720539
 */
public class LabTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%5s", "Enter the max capacity of the lab (1-10):", "");
        int maxCapacity = input.nextInt();
        input.nextLine();

        Lab lab = new Lab(maxCapacity);

        try (BufferedReader br = new BufferedReader(new FileReader("computer.txt"))) {
            for (int i = 0; i < maxCapacity; i++) {
                String serialNum = br.readLine();
                String manufacturer = br.readLine();
                int makeYear = Integer.parseInt(br.readLine());
                int purchaseYear = Integer.parseInt(br.readLine());
                double prcSpd = Double.parseDouble(br.readLine());
                double ramSize = Double.parseDouble(br.readLine());
                int expYear = Integer.parseInt(br.readLine());
                lab.installComputer(serialNum, manufacturer, makeYear, purchaseYear, prcSpd, ramSize, expYear);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Computers in the Lab\n");

        for (int i = 0; i < lab.getComputersInstalled(); i++) {
            System.out.println("Computer: " + (i + 1));
            System.out.println(lab.getComputers().get(i).toString() + "\n");
        }

        while (true) {
            System.out.println("Choices:");
            System.out.println("1. Output average age of computers in lab.");
            System.out.println("2. Output specs of the newest computer.");
            System.out.println("3. Output specs of the fastest computer, indicate if it has the largest RAM.");
            System.out.println("4. Output computers with a manufacturer of your choice.");
            System.out.println("5. Output serial number of computers expiring next year.");
            System.out.println("Enter -1 to quit the program.");
            System.out.printf("%s%5s", "Enter your choice (1-5):", "");
            int choice = input.nextInt();
            input.nextLine();
            System.out.println("");

            if (choice == 1) {
                System.out.println("The average age of all the computers in the Lab is: " + lab.averageAge() + " years.");
            } else if (choice == 2) {
                System.out.println("The specs of the newest computer are:");
                System.out.println(lab.newestComp().toString());
            } else if (choice == 3) {
                System.out.println("Specs of the fastest computer:");
                System.out.println(lab.fastestComp().toString());
                if (lab.fastestComp() == lab.largestRAM()) {
                    System.out.println("The fastest computer has the largest RAM.");
                }
            } else if (choice == 4) {
                System.out.println("Enter the name of a manufacturer:");
                String manufacturer = input.nextLine();

                for (int i = 0; i < lab.getComputersInstalled(); i++) {
                    if (manufacturer.equals(lab.getComputers().get(i).getManufacturer())) {
                        System.out.println("Computer " + (i + 1) + " is made by " + manufacturer);
                    }
                }
            } else if (choice == 5) {
                System.out.println("These are the serial numbers of computers expiring next year.");
                List<Computer> expire = lab.compExp();
                for (Computer a : expire) {
                    System.out.println(a.getSerialNum());
                }
            } else if (choice == -1) {
                System.out.println("Thank you and goodbye!");
                break;
            }
            System.out.println("");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtester;

import java.io.*;
import java.io.IOException;
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

        while(true){
            System.out.println("Computers in the Lab\n");
            
            for(int i = 0; i<lab.getComputersInstalled(); i++){
                System.out.println("Computer: "+(i+1));
                System.out.println(lab.getComputers().get(i).toString()+"\n");
            }
            
            System.out.println("Choices:");
            System.out.println("1. Output average age of computers in lab.");
            System.out.println("2. Output specs of the newest computer.");
            System.out.println("3. Output specs of the fastest computer, indicate if it has the largest RAM.");
            System.out.println("4. Output computers with a manufacturer of your choice.");
            System.out.println("5. Output serial number of computers expiring next year.");
            System.out.printf("%s%5s","Enter your choice (1-5):","");
            int choice = input.nextInt();
            input.nextLine();
            System.out.println("");
            
            if(choice == 1){
                
            }
            break;
        }
    }
}

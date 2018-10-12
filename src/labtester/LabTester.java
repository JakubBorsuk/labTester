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

    }
}

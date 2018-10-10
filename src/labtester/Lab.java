/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtester;

import java.util.ArrayList;

/**
 *
 * @author 342720539
 */
public class Lab {
    private int maxCapacity;
    private ArrayList <Computer> computers;
    private int computersInstalled = 0;
    
    public Lab(int capacity){
        maxCapacity = capacity;
        computers = new ArrayList(maxCapacity);
    }
    
    public void installComputer(String sNum, String manu, int mkYr, int prYr, double prcSpd, double ramSz, int expYr){
        
    }
    
}

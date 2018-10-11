/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtester;

import java.util.*;


/**
 *
 * @author 342720539
 */
public class Lab {
    private int maxCapacity;
    private List <Computer> computers;
    private int computersInstalled = 0;
    
    public Lab(int capacity){
        maxCapacity = capacity;
        computers = new ArrayList<>(capacity);
    }
    
    public void installComputer(String sNum, String manu, int mkYr, int prYr, double prcSpd, double ramSz, int expYr){
        Computer comp = new Computer(sNum,manu,mkYr,prYr,prcSpd,ramSz,expYr);
        getComputers()[getComputersInstalled()] = comp;
        setComputersInstalled(getComputersInstalled() + 1);
    }
    
    public double averageAge(){
        double aveAge = 0;
        for (Computer computer : getComputers()) {
            aveAge += computer.age();
        }
        aveAge /= getComputers().size();
        return aveAge;
    }
    
    public Computer newestComp(){
        int i = 0;
        for(int a = 0; a<getComputers().size(); a++){
            if(getComputers().get(a).age() < getComputers().get(i).age()){
                i = a;
            }
        }
        return getComputers().get(i);
    }
    
    public Computer fastestComp(){
        int i = 0;
        for(int a = 0; a<getComputers().size(); a++){
            if(getComputers().get(a).getProcessorSpeed() > getComputers().get(i).getProcessorSpeed()){
                i = a;
            }
        }
        return getComputers().get(i);
    }

    /**
     * @return the maxCapacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * @param maxCapacity the maxCapacity to set
     */
    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * @return the computersInstalled
     */
    public int getComputersInstalled() {
        return computersInstalled;
    }

    /**
     * @param computersInstalled the computersInstalled to set
     */
    public void setComputersInstalled(int computersInstalled) {
        this.computersInstalled = computersInstalled;
    }

    /**
     * @return the computers
     */
    public List <Computer> getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    public void setComputers(List <Computer> computers) {
        this.computers = computers;
    }
    
}

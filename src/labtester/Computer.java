/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtester;

/**
 *
 * @author 342720539
 */
public class Computer {

    private String serialNum;
    private String manufacturer;
    private int makeYear;
    private int purchaseYear;
    private double processorSpeed;
    private double ramSize;
    private int expYear;

    public Computer(String sNum, String manu, int mkYr, int prYr, double prcSpd, double ramSz, int expYr) {
        serialNum = sNum;
        manufacturer = manu;
        makeYear = mkYr;
        purchaseYear = prYr;
        processorSpeed = prcSpd;
        ramSize = ramSz;
        expYear = expYr;
    }

    public Computer compareSpeed(Computer c) {
        if (this.processorSpeed >= c.processorSpeed) {
            return this;
        }
        return c;
    }

    public Computer compareRAM(Computer c) {
        if (this.ramSize >= c.ramSize) {
            return this;
        }
        return c;
    }
    
    public Computer compareAge(Computer c){
        if((2018 - this.makeYear) >= (2018 - c.makeYear)){
            return this;
        }
        return c;
    }

    @Override
    public String toString() {
        return "Serial Number:\t" + serialNum
                + "\nManufacturer:\t" + manufacturer
                + "\nMake Year:\t" + makeYear
                + "\nPurchase Year:\t" + purchaseYear
                + "\nProcessor Speed:\t" + processorSpeed
                + "\nRAM Size:\t" + ramSize
                + "\nWarranty Expiry Year:\t" + expYear;
    }

    /**
     * @return the serialNum
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * @param serialNum the serialNum to set
     */
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the makeYear
     */
    public int getMakeYear() {
        return makeYear;
    }

    /**
     * @param makeYear the makeYear to set
     */
    public void setMakeYear(int makeYear) {
        this.makeYear = makeYear;
    }

    /**
     * @return the purchaseYear
     */
    public int getPurchaseYear() {
        return purchaseYear;
    }

    /**
     * @param purchaseYear the purchaseYear to set
     */
    public void setPurchaseYear(int purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

    /**
     * @return the processorSpeed
     */
    public double getProcessorSpeed() {
        return processorSpeed;
    }

    /**
     * @param processorSpeed the processorSpeed to set
     */
    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    /**
     * @return the ramSize
     */
    public double getRamSize() {
        return ramSize;
    }

    /**
     * @param ramSize the ramSize to set
     */
    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    /**
     * @return the expYear
     */
    public int getExpYear() {
        return expYear;
    }

    /**
     * @param expYear the expYear to set
     */
    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

}

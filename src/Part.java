/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Pedro Mendoza IV
 * Created: 12/7/2016
 */


/**
 * Part interface that is implemented
 * @author mendozaivpa
 * @version 1.0
 */
interface Part {

    /**
     * Gives the price of the part
     * @return cost of part
     */
    public double getCost();

    /**
     * Gives the name of the part
     * @return name of part
     */
    public String getName();

    /**
     * Gives the weight of the object
     * @return weight of the part
     */
    public double getWeight();

    /**
     * Prints the entire bill of part(s)
     */
    public void printBillOfMaterials();

}

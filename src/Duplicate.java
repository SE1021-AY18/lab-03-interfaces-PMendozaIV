/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Pedro Mendoza IV
 * Created: 12/7/2016
 */
import java.text.DecimalFormat;

public class Duplicate implements Part{

    private DecimalFormat costFormat = new DecimalFormat("##.##");
    private DecimalFormat weightFormat = new DecimalFormat("##.###");
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    Part identicalPart;
    int numDuplicates;

    /**
     * Constructor of Duplicate Part
     * @param identicalPart Part that is the same
     * @param numDuplicates Number of the identical parts
     */
    public Duplicate(Part identicalPart, int numDuplicates){

        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;

    }

    /**
     * Gives the price of the part
     * @return cost of part
     */
    @Override
    public double getCost() {

        double cost;

        if(numDuplicates >= USD_THRESHOLD1 && numDuplicates < USD_THRESHOLD2){

            cost = Double.parseDouble(costFormat.format(REDUCTION_FACTOR1 * numDuplicates * identicalPart.getCost()));
            return cost;

        }else if(numDuplicates >= USD_THRESHOLD2){

            cost = Double.parseDouble(costFormat.format(REDUCTION_FACTOR2 * numDuplicates * identicalPart.getCost()));
            return cost;

        }

        cost = Double.parseDouble(costFormat.format(numDuplicates * identicalPart.getCost()));
        return cost;

    }

    /**
     * Gives the weight of the object
     * @return weight of the part
     */
    @Override
    public double getWeight() {
        double weight = Double.parseDouble(weightFormat.format(numDuplicates * identicalPart.getWeight()));
        return weight;
    }

    /**
     * Gives the name of the part
     * @return name of part
     */
    @Override
    public String getName() {

        return numDuplicates + " " + identicalPart.getName() + "s";

    }

    /**
     * Prints the entire bill of part(s)
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println(

                "==========================\n"  + getName() + "\n" +
                "==========================\n" +
                "Duplicate part: " + identicalPart.getName() + "\n" +
                "Copies: " + numDuplicates + "\n" +
                "Individual Cost: $" + costFormat.format(identicalPart.getCost()) + "\n" +
                "Individual Weight: " + weightFormat.format(identicalPart.getWeight()) + "\n\n" +
                "Total Cost: $" + getCost() + "\n" +
                "Total weight: " + getWeight() + " lbs\n"

        );

        identicalPart.printBillOfMaterials();

    }


}

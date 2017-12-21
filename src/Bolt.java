/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Pedro Mendoza IV
 * Created: 12/14/2016
 */
import java.text.DecimalFormat;

public class Bolt implements Part {

    private DecimalFormat costFormat = new DecimalFormat("##0.00");
    private DecimalFormat weightFormat = new DecimalFormat("###.###");
    public static final double USD_MULTIPLIER = 1.00;
    public static final double LBS_MULTIPLIER = 0.05;
    private double diameterInches;
    private double lengthInches;

    /**
     * Constructor of Bolt
     * @param diameterInches diameter of Bolt in inches
     * @param lengthInches length of Bolt in inches
     */
    public Bolt(double diameterInches, double lengthInches){

        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;

    }

    /**
     * Gives the price of the part
     * @return cost of part
     */
    @Override
    public double getCost() {
        double totalCost = USD_MULTIPLIER * diameterInches * lengthInches;
        return totalCost;
    }

    /**
     * Gives the weight of the object
     * @return weight of the part
     */
    @Override
    public double getWeight() {
        double totalWeight = LBS_MULTIPLIER * (diameterInches * diameterInches) * lengthInches;
        return totalWeight;
    }

    /**
     * Gives the name of the part
     * @return name of part
     */
    @Override
    public String getName() {
        return diameterInches + "x" + lengthInches + " Bolt";
    }

    /**
     * Prints the entire bill of part(s)
     */
    @Override
    public void printBillOfMaterials() {
        System.out.println(
                "==========================\n" +
                getName() + "\n" +
                "==========================\n" +
                "Length: " + lengthInches + " inches\n" +
                "Diameter: " + diameterInches + " inches \n" +
                "Cost: $" + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs\n"
        );

    }



}

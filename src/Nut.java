/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Pedro Mendoza IV
 * Created: 12/14/2016
 */
import java.text.DecimalFormat;

public class Nut implements Part {

    private DecimalFormat costFormat = new DecimalFormat("##0.00");
    private DecimalFormat weightFormat = new DecimalFormat("###.###");
    public static final double USD_MULTIPLIER = 0.5;
    public static final double LBS_MULTIPLIER = 0.01;
    private double diameterInches;

    /**
     * Constructor of Nut
     * @param diameterInches Diameter of Nut in inches
     */
    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    /**
     * Gives the price of the part
     * @return cost of part
     */
    @Override
    public double getCost() {
        double totalCost = (USD_MULTIPLIER * diameterInches);
        return totalCost;
    }

    /**
     * Gives the weight of the object
     * @return weight of the part
     */
    @Override
    public double getWeight() {
        double totalWeight = LBS_MULTIPLIER * (diameterInches * diameterInches);
        return totalWeight;
    }

    /**
     * Gives the name of the part
     * @return name of part
     */
    @Override
    public String getName() {
        return diameterInches + " inch Nut";
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
                "Diameter : " + diameterInches + "\n" +
                "Cost: $" + costFormat.format(getCost()) + "\n" +
                "Weight: " + weightFormat.format(getWeight()) + " lbs\n"
        );
    }


}

/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Pedro Mendoza IV
 * Created: 12/7/2016
 */
import java.text.DecimalFormat;

public class SheetMetal implements Part {

    private DecimalFormat costFormat = new DecimalFormat("###.##");
    private DecimalFormat weightFormat = new DecimalFormat("###.###");
    public static final double LBS_MULTIPLIER = 0.1;
    public static final double USD_MULTIPLIER = 0.50;
    private double lengthInches;
    private double thicknessInches;
    private double widthInches;

    /**
     * Constructor of Sheet Metal
     * @param lengthInches length of sheet metal in inches
     * @param thicknessInches thickness of sheet metal in inches
     * @param widthInches width of sheet metal in inches
     */
    public SheetMetal(double lengthInches, double thicknessInches, double widthInches){
        this.lengthInches = lengthInches;
        this.thicknessInches = thicknessInches;
        this.widthInches = widthInches;
    }

    /**
     * Gives the price of the part
     * @return cost of part
     */
    @Override
    public double getCost() {
        double totalCost = Double.parseDouble(costFormat.format(USD_MULTIPLIER * thicknessInches * widthInches * lengthInches));
        return totalCost;
    }

    /**
     * Gives the weight of the object
     * @return weight of the part
     */
    @Override
    public double getWeight() {
        double totalWeight = Double.parseDouble(weightFormat.format(LBS_MULTIPLIER * thicknessInches * widthInches * lengthInches));
        return totalWeight;
    }

    /**
     * Gives the name of the part
     * @return name of part
     */
    @Override
    public String getName() {
        return lengthInches + "x" + widthInches + "x" + widthInches + " sheet";
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
                "Width: " + widthInches + " inches \n" +
                "Thickness: " + thicknessInches + "\n" +
                "Cost: $" + getCost() + "\n" +
                "Weight: " + getWeight() + " lbs\n"
        );
    }
}

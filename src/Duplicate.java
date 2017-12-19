import java.text.DecimalFormat;

public class Duplicate implements Part{

    private DecimalFormat costFormat = new DecimalFormat("$##.##");
    private DecimalFormat weightFormat = new DecimalFormat("##.#");
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    Part identicalPart;
    int numDuplicates;

    public Duplicate(Part identicalPart, int numDuplicates){

        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;

    }

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

    @Override
    public double getWeight() {
        double weight = Double.parseDouble(weightFormat.format(numDuplicates * identicalPart.getWeight()));
        return weight;
    }

    @Override
    public String getName() {

        return numDuplicates + " " + identicalPart.getName() + "s";

    }

    @Override
    public void printBillOfMaterials() {
        System.out.println(

                "\n" + numDuplicates + " " + getName() + "\n\n" +
                "Duplicate part: " + identicalPart.getName() + "\n" +
                "Copies: " + numDuplicates + "\n" +
                "Individual Cost: " + identicalPart.getCost() + "\n" +
                "Individual Weight: " + identicalPart.getWeight() + "\n" +
                "Total Cost: " + getCost() + "\n" +
                "Total weight: " + getWeight() + "lbs\n"

        );

        identicalPart.printBillOfMaterials();

    }


}

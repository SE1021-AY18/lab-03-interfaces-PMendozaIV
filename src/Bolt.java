public class Bolt implements Part {

    public static final double USD_MULTIPLIER = 1.00;
    public static final double LBS_MULTIPLIER = 0.05;
    private double diameterInches;
    private double lengthInches;

    public Bolt(double diameterInches, double lengthInches){

        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;

    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * diameterInches * lengthInches;
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * diameterInches * diameterInches * lengthInches;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void printBillOfMaterials() {

    }

}

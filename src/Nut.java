public class Nut implements Part {

    public static final double USD_MULTIPLIER = 0.5;
    public static final double LBS_MULTIPLIER = 0.01;
    private double diameterInches;

    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * diameterInches;
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * diameterInches * diameterInches;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void printBillOfMaterials() {

    }
}

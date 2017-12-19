
public class SheetMetal implements Part {

    public static final double LBS_MULTIPLIER = 0.1;
    public static final double USD_MULTIPLIER = 0.50;
    private double lengthInches;
    private double thicknessInches;
    private double widthInches;

    public SheetMetal(double lengthInches, double thicknessInches, double widthInches){
        this.lengthInches = lengthInches;
        this.thicknessInches = thicknessInches;
        this.widthInches = widthInches;
    }

    @Override
    public double getCost() {
        return USD_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    @Override
    public double getWeight() {
        return LBS_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    @Override
    public String getName() {
        return lengthInches + "x" + widthInches + "x" + widthInches + " sheet";
    }

    @Override
    public void printBillOfMaterials() {
        System.out.println(
                "Length: " + lengthInches + " inches\n" +
                "Width: " + widthInches + " inches \n" +
                "Cost: $" + getCost() + "\n" +
                "Weight: " + getWeight() + " lbs"
        );
    }
}

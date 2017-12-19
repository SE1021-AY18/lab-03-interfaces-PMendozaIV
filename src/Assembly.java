
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly implements Part{

    private DecimalFormat costFormat = new DecimalFormat("$##.##");
    private DecimalFormat weightformat = new DecimalFormat("##.#");
    private ArrayList subParts = new ArrayList();
    public static final double USD_PER_SUB_PART = 0.25;
    private String name;

    public Assembly(String name){

        this.name = name;

    }

    public void addPart(Part part){

        subParts.add(part);

    }

    @Override
    public double getCost() {//TODO

        Part temp;
        double partsCost;

        for (int i = 0; i < subParts.size(); i++)
        {
           subParts.get(i);
        }

        double totalCost = Double.parseDouble(costFormat.format(USD_PER_SUB_PART * ));
        return totalCost;
    }

    @Override
    public double getWeight() {
        return 0;
    }//TODO

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printBillOfMaterials() {//TODO

        System.out.println(
                getName() + "\n\n" +
                        "Part: " + "INSERT PART HERE" + "\n" +
                        "Total cost: " + getCost() + "\n" +
                        "Total weight: " + getWeight() + "\n" +
                        
        );

    }
}

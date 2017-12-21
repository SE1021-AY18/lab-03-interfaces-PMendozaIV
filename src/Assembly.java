/*
 * SE1021
 * Winter 2017-2018
 * Lab 3 - Interfaces
 * Name: Pedro Mendoza IV
 * Created: 12/14/2016
 */
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Assembly implements Part{

    private DecimalFormat costFormat = new DecimalFormat("##0.00");
    private DecimalFormat weightFormat = new DecimalFormat("###.###");
    private ArrayList<Part> subParts = new ArrayList();
    public static final double USD_PER_SUB_PART = 0.25;
    private String name;

    /**
     * Constructor of Assembly
     * @param name name of the Assembly
     */
    public Assembly(String name){

        this.name = name;

    }

    /**
     * Adds part to the assemply of the object
     * @param part the part to be added to the assembly
     */
    public void addPart(Part part){

        subParts.add(part);

    }

    /**
     * Gives the price of the part
     * @return cost of part
     */
    @Override
    public double getCost() {

        double partsCost = 0;

        for (int i = 0; i < subParts.size(); i++)
        {
           partsCost += subParts.get(i).getCost() + USD_PER_SUB_PART;

        }

        return partsCost;
    }

    /**
     * Gives the weight of the object
     * @return weight of the part
     */
    @Override
    public double getWeight() {
        double partsWeight = 0;

        for (int i = 0; i < subParts.size(); i++)
        {
            partsWeight += subParts.get(i).getWeight();

        }

        return partsWeight;
    }

    /**
     * Gives the name of the part
     * @return name of part
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Prints the entire bill of part(s)
     */
    @Override
    public void printBillOfMaterials() {

        System.out.println("==========================\n" +
                getName() + "\n" +
                "=========================="
        );
        for(int i = 0; i < subParts.size(); i++){
            System.out.println(
                    "Part: " + subParts.get(i).getName() + "\n" +
                    "Cost: $" + costFormat.format(subParts.get(i).getCost()) + "\n" +
                     "Weight: " + weightFormat.format(subParts.get(i).getWeight()) + " lbs\n"
            );
        }

        System.out.println(
                "Total Cost: $" + costFormat.format(getCost()) + "\n" +
                "Total Weight: " + weightFormat.format(getWeight()) + " lbs\n"
        );

        for(int i =0; i < subParts.size(); i++){
            subParts.get(i).printBillOfMaterials();
        }


    }





}

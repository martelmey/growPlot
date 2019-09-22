package ca.chalister;

public class PrintDetails {

    private String pageDiv = "==============================";
    private String phaseTitle = "VEG. PHASE ONE";
    private String lightTitle = "* hrs: 18";
    private String tankTitle = "                   10 litres";
    private String nutrientsField = "Nutrients (mL): ";
    private String tankBorder = "+-----------+";
    private double ecValue = .9;

    private String nutrient1 = "Terra Vega";
    private String nutrient2 = "Rhizotonic";
    private String nutrient3 = "Cannazym";

    private int nutrient1Dose = 30;
    private int nutrient2Dose = 20;
    private int nutrient3Dose = 25;

    // Change to a date/time object
    private String startDate = "Sept. 14";
    private String lastWater = "Sept. 20";
    private String lastFeed = "Sept. 13";
    // veg1FromStart = 1 week
    // veg2FromStart = 4 weeks
    // gen1FromStart = 8 weeks
    // gen2FromStart = 11 weeks
    // gen3FromStart = 12 weeks
    // gen4fromStart = 15 weeks
    // endFromStart = 17 weeks

    public void printDetails() {
        String nutrientField = (nutrient1 + " -->  |   " + nutrient1Dose + "      |");
        String ecField = ("                     EC: " + ecValue);
        String lastWaterField = ("Last water: " + lastWater); // + difference
        String lastFeedField = ("Last feed: " + lastFeed); // + difference

        System.out.println(pageDiv);
        System.out.println(phaseTitle + "      " + lightTitle);
        System.out.println();
        System.out.println(tankTitle);
        System.out.println(nutrientsField + tankBorder);
        System.out.println(nutrientField);
        System.out.println("                " + tankBorder);
        System.out.println(ecField);
        System.out.println();
        System.out.println(lastWaterField);
        System.out.println(lastFeedField);
        // print when next phase starts
        System.out.println(pageDiv);
    }
}

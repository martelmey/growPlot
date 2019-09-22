package ca.chalister;

public class PrintMap {

    private String pageDiv = "=======================";
    private int sqInchArea = 24;
    private String plantBlock = "+---+ +---+ +---+ +---+\n|   | |   | |   | |   |\n+---+ +---+ +---+ +---+";
    private int plantNumber = 12;

    public void printMap() {
        System.out.println(pageDiv);
        System.out.println("Grow area: " + sqInchArea + " sq/inches");

        for (int i = 0; i <= plantNumber/4; i++) {
            System.out.println(plantBlock);
        }

        System.out.println(pageDiv);
    }
}

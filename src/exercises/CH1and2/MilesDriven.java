package exercises;
import java.util.Scanner;

public class MilesDriven {

    public static void main(String[] args) {
        MilesDriven milesPerGallon = new MilesDriven();
        milesPerGallon.calculateMilesPerGallon();
    }

    public void calculateMilesPerGallon() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double numberOfMilesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did your car guzzle? ");
        Double gallonsOfGasGuzzled = input.nextDouble();

        // Miles/Gal = miles / gallons
        Double milesPerGallon = numberOfMilesDriven / gallonsOfGasGuzzled;
        System.out.println("Your car ran: " + milesPerGallon.toString() + " mpg");

    }
}

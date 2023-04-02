package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        System.out.println("Enter the length of your rectangle (as a number): ");
//        Doubles userNumber = input.nextDouble();
//        System.out.println("" + userNumber);
//
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();

        //input.close();  //always add to the end of the main method
    }

    public void calculateAreaOfRectangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your rectangle (as a number): ");
        Double usersRectangleLength = scanner.nextDouble();

        System.out.println("Enter the width of your rectangle (as a number): ");
        Double usersRectangleWidth = scanner.nextDouble();

        //Area = length * width
        Double area = usersRectangleLength * usersRectangleWidth;
        System.out.println("The area of your rectangle is: " + area.toString() + " square units");

    }

}

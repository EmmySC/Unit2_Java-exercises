package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a numerical value for the radius of your circle.");
//        double radius = input.nextDouble();

        //try {

            do {
                double radius = input.nextDouble();
                int intValue = (int)radius; //.parseInt(String.valueOf(radius));

                if (radius < 0 || radius != intValue) { //addresses negative numbers & non-numbers
                    System.out.println("Please enter a valid number, greater than 0, for the radius.");

                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of your circle, with a radius of " + radius + " , is " + area + " " +
                            "square units.");
                }

            } while (input.hasNextDouble()); //false //util.Scanner.hasNextDouble() method returns true if the next
            // token in this scanner's input can be interpreted as a double value using the nextDouble() method.

//        } catch (Exception error) {
//            System.out.println("Please enter a valid number for the radius.");
//            }

        input.close(); //end the Scanner
    }
}

//double area = Circle.getArea(radius);
//System.out.println("The area of your circle, with a radius of " + radius + " , is " + area + " square units.");

//Double PI = 3.14159265359; //Ch 1.7 - Constant --> variable created using static and final modifiers
// A = PI*r^2
// double area = Circle.getArea(radius);
// System.out.println("The area of your circle, with a radius of " + radius + " , is " + area + " square units.");

//BONUS:
//no negative numbers or non-numeric characters
//no empty strings
//use a do-while loop to re-prompt the user if they do not enter a valid numerical value
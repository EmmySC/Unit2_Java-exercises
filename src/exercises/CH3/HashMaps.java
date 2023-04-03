package exercises.CH3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Integer;


public class HashMaps {

    public static void main(String[] args) {

    //takes in student names and ID numbers (as integers), keys should be the IDs and the values should be the names
        HashMap<Integer, String> students = new HashMap<>();  //key is ID - Integer, value is Names - String
        Scanner input = new Scanner(System.in);
        Integer newID;
        String newStudent;

        // Get student names and IDs
        do {
            System.out.print("Enter your Student ID: ");
            newID = input.nextInt();

            // Read in the newline before looping back
            input.nextLine(); //clear the Scanner to take in new input

            if (!newID.equals(-1)) {  //(!newID.equals(null)) OR if (newID != null)
                System.out.print("Enter your First and Last Name: ");
                newStudent = input.nextLine();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                //input.nextLine();
            }

        } while(!newID.equals(-1)); //loop will be looking for int, not String, and there will never be a
        // negative

        // Print class roster
        System.out.println("\nCLASS ROSTER:");

        //students.forEach((key, value) -> System.out.println(key + " : " + value));

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " | Student: " + student.getValue());
        }

    } //main ending curly bracket

} //HashMaps ending curly bracket


/*
For HashMaps, must specify the types of the objects we’ll be storing when we declare a variable or parameter
to be a map. This means specifying both key and value data types, which are allowed to be
different types for a given map.

Modify the roster printing code accordingly.
 */

/*
       HashMap<Integer, String> students = new HashMap<>();
       Scanner input = new Scanner(System.in);
       Integer newID;

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newID = input.nextInt();

            // Read in the newline before looping back
            input.nextLine();

            if (!newID.equals(-1)) {
                System.out.print("Student Name: ");
                String newStudent = input.nextLine();
                students.put(newID, newStudent);

            }

        } while(!newID.equals(-1));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
 */
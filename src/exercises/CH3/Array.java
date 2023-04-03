package exercises.CH3;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Array arrayPractice = new Array();
        //arrayPractice.workingWithNumbers();
        //arrayPractice.splitTheString();
        arrayPractice.splitTheStringIntoSentences();

    } //main end curly bracket

///create methods///
    public void workingWithNumbers() {
        //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8
        int[] intArray = {1, 1, 2, 3, 5, 8};

        //Loop through the array and print out each value,
        for (int i = 0; i < intArray.length; i++) {
            //modify the loop to only print the odd numbers (not divisible by 2 --> mod %)
            if (intArray[i] % 2 == 1) {
                System.out.println(intArray[i]);
            }
        }

    } //workingWithNumbers end curly bracket

    public String[] splitTheString() {  //changed from void to String[], to return theSplitStrings
        String stringToSplit = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

    //Use the split method to divide the string at each space and store the individual words in an array.
    //str.split("delimiter"): Splits the string into sections at each delimiter and stores the sections as elements in
        // an array.
        String[] theSplitStrings = stringToSplit.split(" "); //parameter(split at each whitespace in the string)

        //Print the array of words to verify the code works, syntax is: System.out.println(Array.toString(arrayName));
        System.out.println(Arrays.toString(theSplitStrings));    // **undo comment-out to run in Array.java**

        return theSplitStrings;

    } //splitTheString end curly bracket

    public void splitTheStringIntoSentences() {
        String stringToSplit = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        //change the delimiter to split the string into separate sentences
        // **Instead of .split("."), need to use .split("\\.")** --> period denotes the end of a sentence
        // regex: looks for expressions within Strings
        String[] theSplitStrings = stringToSplit.split("\\."); //parameter(split at the period)

        System.out.println(Arrays.toString(theSplitStrings));

    } //splitTheStringIntoSentences end curly bracket


}

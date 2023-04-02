package org.launchcode.java.studio.countingcharacters;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//write a program to count the number of times each character occurs in a string,
//then print the results to the console (use testing quote from Hidden Figures)
// A) Loop through the string one character at a time
// B) Store and/or update the count for a given character using an appropriate data structure
// C) Loop through the data structure to print the results (one character and its count per line)

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your search phrase/quote (as a string) to count the instances of each letter" +
                " (instances of characters): "); //BONUS: prompt the user to enter the string in the command line

        String usersInput = input.nextLine().toLowerCase(); //user's response is stored in usersInput variable
        // BONUS: make the character counts case-insensitive
/*
        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says at " +
                "least one of the two terms has to be zero to start with. So if you move all the " +
                "terms over to one side, you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty" +
                "straightforward from there.";  //quote for testing
*/
        String lettersOfAlphabet = "abcdefghijklmnopqrstuvwxyz"; //BONUS: exclude non-alphabetic characters

        char[] arrayOfCharacters = usersInput.toCharArray(); //breaks users response down into each individual character
        // and puts the characters into their own array (of characters)
        HashMap<Character, Integer> characterCounts = new HashMap<>(); //data structure to store the count (of
        // characters)

        for (char letter : arrayOfCharacters) {  //looping through array --> for each character/letter, of the input
            // response array, do...
            if (lettersOfAlphabet.indexOf(letter) >= 0) { //BONUS: exclude non-alphabetic characters
                if (characterCounts.containsKey(letter)) {  //if there is already an instance of the letter
                characterCounts.put(letter, characterCounts.get(letter) + 1); //in the users input, then increase
                // the letter's count by 1
                } else {
                    characterCounts.put(letter, 1); //otherwise, if the letter hasn't already been added, add it and
                    // start that letter's count at 1
                }
            }
        }

        for (Map.Entry<Character, Integer> entryCount : characterCounts.entrySet()) {
            System.out.println(entryCount.getKey() + " : " + entryCount.getValue()); //from the created HashMap (of
            // user's response phrase/quote, printing each key/value pair (letter : count) to newline
        }

        input.close(); //end the Scanner
    }

}

//SUPER BONUS: https://www.w3schools.com/java/java_files_read.asp
//Scanner class can also be used to read Files, what you pass into the constructor is what will change (want to use
// the file path)
//ex: File myObject = new File("filename.txt"); Scanner myReader = new Scanner(myObject);
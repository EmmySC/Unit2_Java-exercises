package exercises.CH3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayLists {

    // Within main, create a list with at least 10 integers and call your method on the list. //integers.add(1)
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); //use:
        //Helper Class: Arrays --> Arrays method --> asList(what you want initialized)

        Integer total = ArrayLists.sumOfAllEvenNumbers(numbers); //to call the static method, not instance of
        System.out.println(total); //the running total sum is: (total)

        //new instance of Array.java for 3.7.2 BONUS
        //Array arrayPractice = new Array();
        //String[] returnedSplitStrings = arrayPractice.splitAGivenString(); //use Array method splitAGivenString()

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Pansy", "Lily", "Peony", "Rose", "Daisy",
                "Tulip", "Orchid", "mum"));
        System.out.println("Please enter a word length (as a number) to search for that is greater than 3: ");
        int wordsSearchLength = ArrayLists.userInput();
        ArrayLists.printAll5LetterWords(words, wordsSearchLength);

    } //main ending curly bracket

    //Write a static method to find the sumOfAllEvenNumbers in an ArrayList
    public static int sumOfAllEvenNumbers (ArrayList<Integer> array) {  //needs to return Integer
        int runningSumTotal = 0; //primitive

        for (int number : array) {  //primitive
            if (number % 2 == 0) {  //modify the loop to only print the even numbers (divisible by 2 --> mod %)
                runningSumTotal += number;
            }
                //System.out.println(integer);

//            for (int i = 0; i < array.size(); i++) {
//                //modify the loop to only print the even numbers (divisible by 2 --> mod %)
//                if (array.get(i) % 2 == 0) {
//                    runningSumTotal += array.get(i);
//                }
//            }
        }
        return runningSumTotal;

    } //sumOfAllEvenNumbers ending curly bracket

    //Write a static method to print out each word in a list that has exactly 5 letters
    public static void printAll5LetterWords(ArrayList<String> fiveLetterWords, Integer wordsSearchLength) {  //words are Strings

        for (String fiveLetterWord : fiveLetterWords) {
            if (fiveLetterWord.length() == wordsSearchLength) { //changed == 5 to wordsSearchLength
                System.out.println(fiveLetterWord);
            }
        }
        /*
        for (int i = 0; i < fiveLetterWords.size(); i++) {
            if (fiveLetterWords.get(i).length() == wordsSearchLength) { //changed == 5 to wordsSearchLength
                System.out.println(fiveLetterWords.get(i));
            }
        }
        */
    } //printAll5LetterWords ending curly bracket

    //modify the code to prompt the user to enter the word length for the search --> Scanner class
    public static Integer userInput() {
        Scanner input = new Scanner(System.in);
        Integer usersInt = input.nextInt();

        input.close();

        return usersInt;
    } //userInput end curly bracket

}

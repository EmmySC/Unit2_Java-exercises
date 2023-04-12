package exercises.CH1and2;


public class AliceInWonderland {

    public static void main(String[] args) {
        AliceInWonderland myFirstAliceInWonderland = new AliceInWonderland();
        Boolean searchQuoteResult = myFirstAliceInWonderland.searchAliceQuote("aLiCe");
        System.out.println("Your search term, " + searchQuoteResult.toString() + " , was found");
    }

// Store the Alice quote in a string, then prompt the user for a term to search for within the string
// Print whether or not the search term was found
// Make the search case-insensitive, so that searching for “alice”, for example, prints true
    public boolean searchAliceQuote(String searchQuote) {
        String aliceQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
                "pictures or conversation?'";
        String searchQuoteLowerCase = searchQuote.toLowerCase();
        Boolean searchResult = aliceQuote.contains(searchQuoteLowerCase);
        return searchResult;

    }

}

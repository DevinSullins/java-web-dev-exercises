package exercises;
import java.util.Locale;
import java.util.Scanner;

public class AliceSearch {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String aliceParagraph = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in " +
                "it, 'and what is the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        System.out.println("Your word: ");
        String userWord = input.nextLine();
        Boolean wordMatch = aliceParagraph.toLowerCase().contains(userWord.toLowerCase());
        System.out.println(wordMatch);
    }
}

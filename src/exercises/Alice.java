package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        int found;
        String chosenWord;
        String firstSentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        int index;
        int length;



        Scanner input = new Scanner(System.in);
        System.out.println("Define a word");
        chosenWord = input.next();

//        found = firstSentence.toLowerCase().contains(chosenWord.toLowerCase());
        String[] newSentence = firstSentence.toLowerCase().split(chosenWord.toLowerCase());
        index = firstSentence.indexOf(chosenWord);
        length = chosenWord.length();


        System.out.println("Your word was found at index: " + index +
                            " Your word has the length of:" + length +
                            " Your new sentence without word is: ");
        for (String a : newSentence)
            System.out.println(a);

    }
}

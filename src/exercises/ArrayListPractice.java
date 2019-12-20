package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<>();
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not" +
                " eat them in a house. I will not eat them with " +
                "a mouse.";

        String newSentence = sentence.replaceAll(",", "");
        String newerSentence = newSentence.replaceAll("\\.", "");
        String[] splitSentence = newerSentence.split(" ");

        for(String i : splitSentence){
            System.out.println(i);
        }


        arrList.add(2);
        arrList.add(5);
        arrList.add(4);
        arrList.add(3);
        arrList.add(1);
        arrList.add(9);
        arrList.add(6);
        arrList.add(5);
        arrList.add(7);
        arrList.add(9);

//        System.out.println(ArrayListPractice.sumNums( arrList ));
    }

    public static int sumNums(ArrayList<Integer> arr){
        int sum = 0;

        for(int number : arr){
            if( number % 2 == 0){
                sum += number;
            }
        }

        return sum;
    }

    public static ArrayList<String> fiveLetters(String[] words){
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        int length;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your word length: ");
        length = input.nextInt();

        for( String word : words){
            if( word.length() >= length){
                fiveLetterWords.add(word);
            }
        }

        return fiveLetterWords;
    }


}

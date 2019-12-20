package exercises;


import java.util.Arrays;

public class Not {
    public static void main(String[] args){
        int numList[] = new int[]{1,2,3,4,5};
        String sentence = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not" +
                " eat them in a house. I will not eat them with " +
                "a mouse.";

        for( int i : numList ){
            if( i % 2 != 0 ){
                System.out.println(i);
            }
        }

        String[] split = sentence.split(",");
            for( String i : split ){
                System.out.println(i);
            }

         System.out.println(Arrays.toString(split));
    }
}

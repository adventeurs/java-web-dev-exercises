package exercises;

import java.util.Scanner;


public class Mpg {
    public static void main(String[] args){
        double miles;
        double gallons;
        double mpg;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        gallons = input.nextDouble();
        mpg = miles / gallons;

        System.out.println("Your mpg is " + mpg);
    }
}

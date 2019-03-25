package exercises;

import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
        Double miles;
        Double gallons;
        Double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
                miles = in.nextDouble();
        System.out.println("How many gallons of gas have you used?");
                gallons = in.nextDouble();
        mpg = miles / gallons;
        System.out.println("Your car gets " + mpg + " miles per gallon.");
    }
}

package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Double width;
        Double length;
        Double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How wide is your rectangle?");
        width = in.nextDouble();
        System.out.println("How long is your rectangle?");
        length = in.nextDouble();
        area = length * width;
        System.out.println("Your rectangle has an area of " + area +".");
    }
}

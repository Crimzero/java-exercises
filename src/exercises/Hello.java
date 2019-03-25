package exercises;

import java.util.Scanner;



public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Tell me your name ");
        name = in.next();
        System.out.println("Hello, " + name + "!");
    }
}

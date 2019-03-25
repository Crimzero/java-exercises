package exercises;

import jdk.nashorn.internal.parser.Scanner;

import java.util.ArrayList;

public class Sum {
      public static void main(String[] args) {


            ArrayList<Double> numbers = new ArrayList<Double>(){{
                add(1.1);
                add(1.0);
                add(1.0);
                add(1.0);
                add(1.0);
                add(1.0);
                add(7.5);
                add(8.0);
                add(9.0);
                add(10.0);
            }};


          int i;
          double sum = 0;
          for(i = 0; i < numbers.size(); i++)
              System.out.println(sum += numbers.get(i));



            //ArrayList<Double> numbers= new ArrayList<>();

            //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        }
    }


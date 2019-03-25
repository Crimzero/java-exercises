//Still unable to use Integer as key for hashmap, best solution thus far is to turn Integer into String, more research needed.
package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeHash {
    public static void main(String[] args) {
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newId;

        System.out.println("Please enter student ID:");

        do {
            System.out.print("ID:");
            newId = in.nextInt();

            if (!newId.equals("")) {
                System.out.print("Name:");
                String newName = in.next();
                classRoster.put(newId, newName);
                in.nextLine();
            }
        }
        while(newId.equals(""));

        System.out.println("\nClass Roster:");


        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");

        }
    }
}

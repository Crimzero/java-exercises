package exercises;

import java.util.ArrayList;

public class FiveLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>() {{
            add("fuck");
            add("shit");
            add("bless");
            add("donkey");
            add("balls");
            add("tits");
            add("vulgar");
        }};
        for (String i : words) {
            if(i.length() == 5)
            System.out.println(i);
}

    }
}

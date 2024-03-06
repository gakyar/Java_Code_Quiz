package quiz;

import java.util.Arrays;
import java.util.HashMap;

public class Q_03 {
    public static void main(String[] args) {

        //3)  Java Program to Find Duplicate Characters in a String
        //        Verilen String içinde tekrar eden karakterleri ve tekrar sayısını veren bir kod yazınız

        String a = "Merhaba";
        String[] letters = a.split("");
        System.out.println(Arrays.toString(letters));
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : letters) {
            Integer gorunum1 = map.get(w);
            if (gorunum1 == null) {
                map.put(w, 1);
            } else {
                map.put(w, gorunum1 + 1);
            }
        }
        System.out.println(map);

    }
}

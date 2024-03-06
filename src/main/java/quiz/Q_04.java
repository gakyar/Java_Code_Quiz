package quiz;

import java.util.HashMap;

public class Q_04 {
    public static void main(String[] args) {
        //4)  Java Program to Find Duplicate Words in a String
        //    Verilen bir string cümle içinde tekrar eden kelimeleri ve bu kelimelerin sayısını veren kod yazınız

        String s = "Gökhan nasilsin Gökhan";
        s = s.toLowerCase();
        String[] kelimeler = s.split(" ");

        HashMap<String, Integer> myMap = new HashMap<>();

        for (String w : kelimeler) {

            Integer gorunum = myMap.get(w);
            if (gorunum == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, gorunum + 1);
            }
        }
        System.out.println(myMap);
    }
}

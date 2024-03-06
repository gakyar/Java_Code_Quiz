package quiz;

import java.util.ArrayList;
import java.util.List;

public class Q_05 {

    //5) Java Program to Find All the Permutations of a String
    //Girilen String bir ifadenin harfleri yer değiştirilerek oluşturulabilecek anlamlı anlamsız bütün kelimeleri alt alta gösteren bir program yazınız


    public static void main(String[] args) {
        String word = "can";

        System.out.println(findAllPermutation(word));
    }

    public static List<String> findAllPermutation(String str) {

        List<String> permutations = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            permutations.add("");
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            List<String> subPermutation = findAllPermutation(remainingChars);
            for (String w : subPermutation) {
                permutations.add(c + w);
            }
        }
        return permutations;
    }
}

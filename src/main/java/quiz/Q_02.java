package quiz;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {

        //2)  Java Program to Check Palindrome String
        //Verilen String ifadenin palindrome olup olmadığını kontrol eden kod yazınız

        Scanner scn = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String s = scn.nextLine();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1)) {
                System.out.println("Palindrome bir kelime girdiniz");
                break;
            } else {
                System.out.println("Palindrome olmayan bir kelime girdiniz");
                break;
            }
        }

    }
}




package quiz;

public class Q_01 {
    public static void main(String[] args) {

        //1) Java Program to Find the First Non-repeated Character in a String
        //Girilen string bir ifadede tekrar etmeyen ilk karakteri getiren kodu yazınız.

        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First Non-repeated Character : " + ch);
                break;
            }
        }
    }
}

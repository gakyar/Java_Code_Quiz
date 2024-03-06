package quiz;

public class Q_01 {
    public static void main(String[] args) {

    //1) Java Program to Find the First Non-repeated Character in a String
        //Girilen string bir ifadede tekrar etmeyen ilk karakteri getiren kodu yazınız.

        String s = "yusuf";

        if (s.indexOf("y") == s.lastIndexOf("y")){
            System.out.print("y");
        }
        if (s.indexOf("u") == s.lastIndexOf("u")){
            System.out.print("u");
        }
        if (s.indexOf("s") == s.lastIndexOf("s")){
            System.out.print("s");
        }
        if (s.indexOf("f") == s.lastIndexOf("f")){
            System.out.print("f");
        }

    }
}

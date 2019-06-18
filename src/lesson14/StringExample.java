package lesson14;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {

        String example  = "Hello World, it's world of RegExp";
//        przyklad szukania znaków/słów w tekście
        System.out.println(example.matches("World"));
        System.out.println(example.matches(".*World.*"));
        System.out.println(example.matches(".*a"));
        System.out.println(example.matches(".*o?"));
//        przykład zamiany tekstu
        System.out.println(example.replace("World", "moooooo"));
//        podział tekstu na wyrazy
        String [] split = example.split(" ");
        System.out.println(Arrays.toString(split));

        String [] split2 = example.split(",");
        System.out.println(Arrays.toString(split2));
    }
}

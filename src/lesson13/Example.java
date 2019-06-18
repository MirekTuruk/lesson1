package lesson13;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        String example = "W  Szczebrzeszynie chrząszcz brzmi w " +
                "trzcinie i Szczebrzeszyn z tego słynie";
 if(example.matches("(.*)\\s{2}(.*)")){
     System.out.println("Napis ma dwie spacje");
 }
example = example.replaceAll("\\s{2,}", " ");
 example = example.replaceAll("\\s? i Szczebrzeszyn", "\n\ri Szczebrzeszyn");

        System.out.println(example);

        String [] split = example.split(" ");
        System.out.println(Arrays.toString(split));
    }
}

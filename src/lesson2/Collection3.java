package lesson2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Collection3 {
    public static void main(String[] args) {

        Set <String> stringSet = new HashSet <>();

        stringSet.add("jeden");
        stringSet.add("dwa");
        stringSet.add("trzy");
        for (String x : stringSet) System.out.println(x);


        Set <Integer> integerSet = new HashSet <>();
        Random random = new Random();

        while (integerSet.size() < 6) {
            int x = random.nextInt(49) + 1;
            System.out.println("Wylosowano" + x);
            integerSet.add(x);
        }
        for (Integer i : integerSet) {
            System.out.println(i);
        }
    }
}


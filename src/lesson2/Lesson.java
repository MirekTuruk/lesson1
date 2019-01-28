package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public static void main(String[] args) {

        List <String> stringList = new ArrayList <>();

        stringList.add("jeden");
        stringList.add("dwa");
        stringList.add("trzy");

        for(String s : stringList) System.out.println(s);

        stringList.add(1, "zero");
        for(int x = 0; x < stringList.size(); x++){
            System.out.println(stringList.get(x));
        }
    }
}

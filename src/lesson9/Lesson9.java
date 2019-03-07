package lesson9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;

public class Lesson9 {
    public static void main(String[] args) {
        List <Osoba> osobaList = new ArrayList <>();
        osobaList.add(new Osoba("Adam", "Lambert"));
        osobaList.add(new Osoba("Antoni", "Maciekrew"));
        osobaList.add(new Osoba("Janek", "Wiśniewski"));
        osobaList.add(new Osoba("Mirek", "Turuk"));
        osobaList.add(new Osoba("Duduś", "Tyfus"));
        osobaList.add(new Osoba("Kuba", "Walas"));
        osobaList.add(new Osoba("Rysiek", "Ochódzki"));

        for (Osoba o : osobaList) {
            System.out.println(o);
        }
        // Collections.sort(osobaList,(Osoba o1, Osoba o2) ->o1.getImię().compareTo(o2.getImię()));

        osobaList.sort(Comparator.comparing(Osoba::getImię));

        System.out.println("--------------------------");

        for (Osoba o : osobaList) {
            System.out.println(o);
        }
        // Collections.sort(osobaList,(Osoba o1, Osoba o2) ->o1.getNazwisko().compareTo(o2.getNazwisko()));

        osobaList.sort(Comparator.comparing(Osoba::getNazwisko));

        System.out.println("--------------------------");

        for (Osoba o : osobaList) {
            System.out.println(o);
        }
    }
}

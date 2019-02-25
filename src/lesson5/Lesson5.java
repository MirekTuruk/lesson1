package lesson5;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String string;
//        System.out.println("Wpisz coś:");
//        string = scanner.nextLine();
//        System.out.println("Wpisałeś:" + string);
//        try {
//            int x = Integer.parseInt(string);
//            System.out.println(x);
//        }catch (Exception e){
//            System.out.println("Niepoprawna liczba");
//        }main(null);

        System.out.println("Podaj liczbę:");
        try {
            String string2 = scanner.nextLine();
            double aDouble = Double.valueOf(string2);
            System.out.println(string2);
        } catch (Exception e) {

        }
    }

}

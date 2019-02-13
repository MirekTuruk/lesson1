package lesson3;

public class ConditionalStatement3 {
    public static void main(String[] args) {

        String imie = "Janek";
        String imie2 = "Kasia";

        if (!(imie.equals("Jan")) && imie2.equals("Kasia")){
            System.out.println("Cześć " + imie + ", Cześć " + imie2);
        }
    }
}

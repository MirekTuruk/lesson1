package lesson10;

public class Lesson10 {
    public static void main(String[] args) {

        CalculatorInterface dodaj = (a, b) -> a + b;
        CalculatorInterface odejmij = (a, b) -> a - b;
        CalculatorInterface pomnoz = (a, b) -> a * b;
        CalculatorInterface podziel = (a, b) -> a / b;

        System.out.println(dodaj.oblicz(4, 5));
        System.out.println(odejmij.oblicz(9, 5));
        System.out.println(pomnoz.oblicz(4, 5));
        System.out.println(podziel.oblicz(15, 5));


CalculatorInterface calculatorInterface = new CalculatorInterface() {
    @Override
    public int oblicz(int a, int b) {
        return 0;
    }
};
    }
}

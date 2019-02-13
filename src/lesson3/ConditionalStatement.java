package lesson3;

public class ConditionalStatement {
    public static void main(String[] args) {
        int x = 6;
        if (x == 4) {
            System.out.println("x = 4");
        }else if (x == 6){
            System.out.println("x = 6");
        }else if (x == 7) {
            System.out.println("x = 7");
        } else if (x == 3) {
            System.out.println("x = 3");
        }else if (x == 4){
                System.out.println("x = 4");
        }else {
            System.out.println("x nie ma żądanej wartości");
        }
        System.out.println("Koniec");
    }
}

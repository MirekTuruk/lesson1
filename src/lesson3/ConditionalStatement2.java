package lesson3;

public class ConditionalStatement2 {
    public static void main(String[] args) {
        int x = 7;
        switch (x) {
            case 4:
                showNumber(x);
                break;
            case 6:
                showNumber(x);
                break;
            case 7:
                showNumber(x);
                break;
            default:
                System.out.println("x nie ma wymaganej wartości");
                break;
        }
        System.out.println("koniec");
    }

    public static void showNumber(int x) {
        System.out.println("x jest równe" + x);
    }
}

package lesson15;

public class ExampleString {
    public static void main(String[] args) {

        User firstUser = new User ("Jan", "Kowalski");
        User secondUser = new User("Ewa", "Nowak");

        System.out.println(firstUser.toString());
        System.out.println(secondUser);
    }
}

package lesson13;

public class Example {
    public static void main(String[] args) {
        String example = "W Szczebrzeszynie chrząszcz brzmi w " +
                "trzcinie i Szczebrzeszyn z tego słynie";
        int indexOf = example.indexOf("Szcze");
        int indexOf2 = example.lastIndexOf("Szcze", 10);

        boolean startsWith = example.startsWith("W");
        boolean startsWith2 = example.startsWith("W", 10);
        boolean endsWith = example.endsWith("ie");

        System.out.println(indexOf);
        System.out.println(indexOf2);

        System.out.println(startsWith);
        System.out.println(startsWith2);
        System.out.println(endsWith);
    }
}

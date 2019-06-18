package lesson13;

public class Example {
    public static void main(String[] args) {
        String example = "W Szczebrzeszynie chrząszcz brzmi w " +
                "trzcinie i Szczebrzeszyn z tego słynie";
        int start = example.indexOf("ch");
        int end = example.indexOf("nie", 20);
        String substring = example.substring(start, end + 3);

        System.out.println(example.length());
        System.out.println(example.charAt(0));
        System.out.println(substring);
        System.out.println(example.toUpperCase());

    }
}

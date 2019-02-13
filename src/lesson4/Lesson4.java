package lesson4;

public class Lesson4 {
    public static void main(String[] args) {

        Television television2 = new Television();

        Television television1 = new Television("PANASONIC", 60);
        System.out.println(television1.getBrand() + " " + television1.getDiagonal());

        television2.setBrand("SONY");
        television2.setDiagonal(55);
        System.out.println(television2.getBrand() + " " + television2.getDiagonal());

        television2.VolumeUp();
        television2.VolumeDown();
        television2.ProgramUp();
        television2.ProgramDown();
    }
}

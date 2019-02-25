package lesson7;

public class StudentOnline extends Student {
    @Override
    public void presence() {
        System.out.println("Student na wykładzie online");
    }
}

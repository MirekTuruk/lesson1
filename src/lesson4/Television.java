package lesson4;

public class Television {

    private String brand;
    private int diagonal;

    public Television(String brand, int diagonal) {
        this.brand = brand;
        this.diagonal = diagonal;
    }

    public Television() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void VolumeUp() {
        System.out.println("VolumeUp");
    }

    public void VolumeDown() {
        System.out.println("VolumeDown");
    }

    public void ProgramUp() {
        System.out.println("ProgramUp");
    }

    public void ProgramDown() {
        System.out.println("ProgramDown");
    }
}

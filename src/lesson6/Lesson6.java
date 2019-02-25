package lesson6;

public class Lesson6 {
    public static void main(String[] args) {

        GrandFather grandFather = new GrandFather();
        grandFather.name = "Franek";
        grandFather.surname = "Turuk";
        System.out.println(grandFather.name + "  " + grandFather.surname);
        grandFather.relationship();

        Father father = new Father();
        father.name = "Stasiek";
        father.surname = grandFather.surname;
        System.out.println(father.name + "  " + grandFather.surname);
        father.relationship();

        Son son = new Son();
        son.name = "Mirek";
        son.surname = grandFather.surname;
        System.out.println(son.name + "  " + grandFather.surname);
        son.relationship();

        GrandSon grandSon = new GrandSon();
        grandSon.name = "Hubert";
        grandSon.surname = grandFather.surname;
        System.out.println(grandSon.name + "  " + grandFather.surname);
        grandSon.relationship();
    }
}

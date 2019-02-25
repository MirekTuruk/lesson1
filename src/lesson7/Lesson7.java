package lesson7;

public class Lesson7 {
    public static void main(String[] args) {

        Student[] studentTable = new Student[4];
        studentTable[0] = new StudentDzienny();
        studentTable[1] = new StudentDziennyInny();
        studentTable[2] = new StudentOnline();
        studentTable[3] = new StudentZaoczny();

        StudentOnline studentOnline = new StudentOnline();
        studentOnline.presence();

        for (int x = 0; x < studentTable.length; x++) {
            studentTable[x].presence();
        }
        Student student = new StudentOnline();
        Lesson7.takeStudent(student);


    }

    public static void takeStudent(Student student) {
        student.presence();
    }
}

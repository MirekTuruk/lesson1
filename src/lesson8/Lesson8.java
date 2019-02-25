package lesson8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson8 {
    public static void main(String[] args) throws IOException {

        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst 1\n");
            fileWriter.write("Tekst 2\n");
            fileWriter.write("Tekst 3\n");
            fileWriter.write("Tekst 4\n");
            fileWriter.write("Tekst 5\n");
        } catch (IOException ex) {
            System.out.println("Problem z dostępem do pliku");
        } finally {
            if (fileWriter == null) {
                System.out.println("Problem");
                fileWriter.close();
            } else {
                fileWriter.close();
            }
        }
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String linia = null;
            do {
                linia = bufferedReader.readLine();
                if (linia != null) {
                    System.out.println(linia);
                }
            } while (linia != null);
        } catch (IOException ex) {
            System.out.println("Problem z dostępem do pliku");
        } finally {
            bufferedReader.close();
        }
    }
}








/*
Exercise 2: Anonymous Classes and Character Streams
Write a program that uses an anonymous class to handle reading from a file called `input.txt` and writing to a file
called `output.txt` using character streams (`FileReader` and `FileWriter`). */
import java.io.*;

public class Exo2 {
    public static void main(String[] args) {
        // Anonymous class to handle file reading and writing
        new Object() {
            void readAndWriteFiles(String inputFile, String outputFile) {
                try (FileReader fileReader = new FileReader(inputFile);
                     FileWriter fileWriter = new FileWriter(outputFile)) {
                     
                    int character;
                    while ((character = fileReader.read()) != -1) {
                        fileWriter.write(character);
                    }
                    System.out.println("File content successfully copied from " + inputFile + " to " + outputFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.readAndWriteFiles("input.txt", "output.txt");
    }
}

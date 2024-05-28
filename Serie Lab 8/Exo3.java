/*
 Exercise 3: Byte Streams with Files and Java.nio
Write a program that uses byte streams (`FileInputStream` and `FileOutputStream`) and Java.nio (`FileChannel`
and `ByteBuffer`) to copy the contents of a file called `source.dat` to another file called `destination.dat`.
 */
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class Exo3 {
    public static void main(String[] args) {
        String sourceFile = "source.dat";
        String destinationFile = "destination.dat";

        // Copy using byte streams
        copyUsingByteStreams(sourceFile, destinationFile);

        // Copy using java.nio
        copyUsingNio(sourceFile, destinationFile);
    }

    // Method to copy files using byte streams
    public static void copyUsingByteStreams(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File successfully copied using byte streams.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to copy files using java.nio
    public static void copyUsingNio(String sourceFile, String destinationFile) {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile);
             FileChannel sourceChannel = fis.getChannel();
             FileChannel destChannel = fos.getChannel()) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (sourceChannel.read(buffer) > 0) {
                buffer.flip();
                destChannel.write(buffer);
                buffer.clear();
            }

            System.out.println("File successfully copied using java.nio.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

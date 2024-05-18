/* Question : Write a program that performs file operations using a `try-catch` block and includes a `finally` block to close the
file even if an exception occurs. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exo5 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }catch(IOException e){
                System.out.println("An error occurred while closing the file.");
                e.printStackTrace();
            }
        }

}
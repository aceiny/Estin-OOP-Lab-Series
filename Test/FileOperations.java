import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("fileOOP.txt"));
            String line;
            while ((line = reader.readLine()) != null) 
            
            }
        } catch (IOException e) {
            System.out.println("Error: Failed to read the file");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error: Failed to close the file");
                }
            }
        }
    }
}
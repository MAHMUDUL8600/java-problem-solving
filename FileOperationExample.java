import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileOperationExample {
    public static void main(String[] args) {
        // Specify the file name
        String fileName = "example.txt";

        // Writing to a file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a simple file operation example in Java.");
            writer.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file writing.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            File file = new File(fileName);
            FileReader reader = new FileReader(file);
            int character;
            System.out.println("File content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred during file reading.");
            e.printStackTrace();
        }
    }
}

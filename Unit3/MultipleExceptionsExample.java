import java.io.*;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            // Attempt to open a file
            fileInputStream = new FileInputStream("example.txt");

            // Read the first byte from the file
            int data = fileInputStream.read();
            System.out.println("First byte of the file: " + data);

            // Intentionally cause a null pointer exception
            String text = null;
            System.out.println(text.length());
            
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("Exception caught: File not found. " + e.getMessage());
        } catch (IOException e) {
            // Handle IO exception
            System.out.println("Exception caught: IO error. " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.out.println("Exception caught: Null pointer exception. " + e.getMessage());
        } finally {
            // This block always executes
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                    System.out.println("FileInputStream closed successfully.");
                }
            } catch (IOException e) {
                System.out.println("Exception caught while closing the FileInputStream: " + e.getMessage());
            }
        }

        System.out.println("Program continues...");
    }
}

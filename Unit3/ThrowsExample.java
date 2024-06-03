import java.io.*;

public class ThrowsExample {

    public static void main(String[] args) {
        ThrowsExample example = new ThrowsExample();
        
        try {
            example.readFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // Method that declares it throws FileNotFoundException and IOException
    public void readFile(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = null;
        
        try {
            fileInputStream = new FileInputStream(fileName);
            int data = fileInputStream.read();
            System.out.println("First byte of the file: " + data);
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
                System.out.println("FileInputStream closed successfully.");
            }
        }
    }
}

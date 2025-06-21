import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputFile = new FileInputStream("E:\\akshat\\java\\IdeaProjects\\practicalfile\\src\\input.txt");
            FileOutputStream outputFile = new FileOutputStream("E:\\akshat\\java\\IdeaProjects\\practicalfile\\src\\output.txt");
            int data;
            while ((data = inputFile.read()) != -1) {
                outputFile.write(data);
            }
            inputFile.close();
            outputFile.close();
            System.out.println("Data copied from input.txt to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
package practice_project_7;

import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("\nAppending new content to the file.");
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }
}

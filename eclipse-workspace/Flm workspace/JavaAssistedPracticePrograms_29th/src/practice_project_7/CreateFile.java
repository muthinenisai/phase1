package practice_project_7;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}

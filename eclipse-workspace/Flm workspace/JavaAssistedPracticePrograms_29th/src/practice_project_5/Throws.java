package practice_project_5;

import java.io.IOException;

public class Throws {

    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private static void readFile(String fileName) throws IOException {
        // Simulating an IOException during file reading
        throw new IOException("Error reading file: " + fileName);
    }
}

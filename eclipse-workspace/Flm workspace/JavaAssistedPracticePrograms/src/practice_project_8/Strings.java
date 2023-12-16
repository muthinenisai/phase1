package practice_project_8;



public class Strings {

    public static void main(String[] args) {
        // Create a String
        String originalString = "Hello, World!";

        // Display the original String
        System.out.println("Original String: " + originalString);

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Display the StringBuffer
        System.out.println("StringBuffer: " + stringBuffer);

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Display the StringBuilder
        System.out.println("StringBuilder: " + stringBuilder);
    }
}

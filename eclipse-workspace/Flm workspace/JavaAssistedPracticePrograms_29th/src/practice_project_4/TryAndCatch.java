package practice_project_4;

public class TryAndCatch {

    public static void main(String[] args) {
        String input = "123a"; // Invalid integer string

        try {
            int number = convertStringToInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        }
    }

    private static int convertStringToInt(String str) {
        return Integer.parseInt(str);
    }
}

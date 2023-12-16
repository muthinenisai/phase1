package practice_project_5;

public class CustomExceptions {

    public static void main(String[] args) {
        try {
            validateInput("abc");
        } catch (CustomValidationException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }

    private static void validateInput(String input) throws CustomValidationException {
        if (!input.matches("[0-9]+")) {
            throw new CustomValidationException("Input must contain only digits.");
        } else {
            System.out.println("Valid input: " + input);
        }
    }
}

class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

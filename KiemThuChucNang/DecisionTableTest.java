public class DecisionTableTest {
    public static void main(String[] args) {
        System.out.println("Decision Table Test Cases:");

        // R1: Length not in [6-12]
        System.out.println("Test Case R1: " + PasswordValidator.isValidPassword("abc")); // Invalid, length < 6

        // R2: Length valid, missing uppercase
        System.out.println("Test Case R2: " + PasswordValidator.isValidPassword("abcdefg1@")); // Invalid, no uppercase letter

        // R3: Length valid, missing digit
        System.out.println("Test Case R3: " + PasswordValidator.isValidPassword("Abcdefgh@")); // Invalid, no digit

        // R4: Length valid, missing special character
        System.out.println("Test Case R4: " + PasswordValidator.isValidPassword("Abcdefg1a")); // Invalid, no special character

        // R5: Length valid, contains spaces
        System.out.println("Test Case R5: " + PasswordValidator.isValidPassword("Abc123 @a")); // Invalid, contains spaces

        // R6: Valid password
        System.out.println("Test Case R6: " + PasswordValidator.isValidPassword("Abc123@a")); // Valid, all conditions met
    }
}
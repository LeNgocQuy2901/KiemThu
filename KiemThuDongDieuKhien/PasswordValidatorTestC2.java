public class PasswordValidatorTestC2 {
    public static void main(String[] args) {
        System.out.println("C2 (Decision Coverage) Test Cases for isValidPassword:");

        // Test case 1: Null password
        System.out.println("Test Case 1: " + PasswordValidator.isValidPassword(null)); // Expected: false

        // Test case 2: Password length less than 6
        System.out.println("Test Case 2: " + PasswordValidator.isValidPassword("Ab1!")); // Expected: false

        // Test case 3: Password length greater than 12
        System.out.println("Test Case 3: " + PasswordValidator.isValidPassword("Abcdefghijklm1!")); // Expected: false

        // Test case 4: Password without uppercase letter
        System.out.println("Test Case 4: " + PasswordValidator.isValidPassword("abc123!")); // Expected: false

        // Test case 5: Password without digit
        System.out.println("Test Case 5: " + PasswordValidator.isValidPassword("Abcdef!")); // Expected: false

        // Test case 6: Password without special character
        System.out.println("Test Case 6: " + PasswordValidator.isValidPassword("Abcdef1")); // Expected: false

        // Test case 7: Password with spaces
        System.out.println("Test Case 7: " + PasswordValidator.isValidPassword("Abc 123!")); // Expected: false

        // Test case 8: Valid password
        System.out.println("Test Case 8: " + PasswordValidator.isValidPassword("Abc123!")); // Expected: true
    }
}
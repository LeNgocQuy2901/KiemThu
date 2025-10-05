public class BoundaryValueAnalysisTest {
    public static void main(String[] args) {
        System.out.println("Boundary Value Analysis Test Cases:");

        // Length tests
        System.out.println("Test Case L1: " + PasswordValidator.isValidPassword("A1!aa")); // Invalid, length < 6
        System.out.println("Test Case L2: " + PasswordValidator.isValidPassword("A1!aaa")); // Valid, length = 6
        System.out.println("Test Case L3: " + PasswordValidator.isValidPassword("A1!aaaa")); // Valid, length = 7
        System.out.println("Test Case L4: " + PasswordValidator.isValidPassword("A1!aaaaaaaa")); // Valid, length = 9
        System.out.println("Test Case L5: " + PasswordValidator.isValidPassword("A1!aaaaaaaaa")); // Valid, length = 10
        System.out.println("Test Case L6: " + PasswordValidator.isValidPassword("A1!aaaaaaaaaa")); // Valid, length = 12

        // Uppercase tests
        System.out.println("Test Case U1: " + PasswordValidator.isValidPassword("a1!aaaa")); // Invalid, no uppercase
        System.out.println("Test Case U2: " + PasswordValidator.isValidPassword("A1!aaaa")); // Valid, has uppercase

        // Digit tests
        System.out.println("Test Case D1: " + PasswordValidator.isValidPassword("A!!aaaa")); // Invalid, no digit
        System.out.println("Test Case D2: " + PasswordValidator.isValidPassword("A1!aaaa")); // Valid, has digit

        // Special character tests
        System.out.println("Test Case S1: " + PasswordValidator.isValidPassword("A11aaaa")); // Invalid, no special character
        System.out.println("Test Case S2: " + PasswordValidator.isValidPassword("A1!aaaa")); // Valid, has special character

        // Whitespace tests
        System.out.println("Test Case W1: " + PasswordValidator.isValidPassword("A1!aa aa")); // Invalid, contains whitespace
        System.out.println("Test Case W2: " + PasswordValidator.isValidPassword("A1!aaaa")); // Valid, no whitespace
    }
}
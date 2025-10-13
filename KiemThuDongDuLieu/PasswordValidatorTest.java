public class PasswordValidatorTest {
    public static void main(String[] args) {
        System.out.println("===========================================================================");
        System.out.printf("%-10s | %-15s | %-15s | %-15s | %-7s%n",
                "Test Case", "Input (password)", "Expected Output", "Actual Output", "Result");
        System.out.println("===========================================================================");

        runTest("TC1", null, false);
        runTest("TC2", "abc", false);
        runTest("TC3", "abcdef", false);
        runTest("TC4", "Abcdef", false);
        runTest("TC5", "Abcd1", false);
        runTest("TC6", "Ab cd1!", false);
        runTest("TC7", "Abcd1!", true);

        System.out.println("===========================================================================");
    }

    private static void runTest(String id, String password, boolean expected) {
        boolean actual = PasswordValidator.isValidPassword(password);
        boolean pass = (actual == expected);
        String result = pass ? "PASS " : "FAIL ";

        System.out.printf("%-10s | %-15s | %-15s | %-15s | %-7s%n",
                id, String.valueOf(password), expected, actual, result);
    }
}

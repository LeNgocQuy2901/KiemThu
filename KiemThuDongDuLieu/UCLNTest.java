import java.util.Arrays;

public class UCLNTest {
    public static void main(String[] args) {
        System.out.println("=======================================================================");
        System.out.printf("%-6s | %-12s | %-17s | %-17s | %-6s%n",
                "TestID", "Input (m,n)", "Expected Output", "Actual Output", "Result");
        System.out.println("=======================================================================");

        runTest("TC1", 0, 8, 8);
        runTest("TC2", 9, 0, 9);
        runTest("TC3", 5, 5, 5);
        runTest("TC4", 12, 8, 4);
        runTest("TC5", -6, -6, 6);

        System.out.println("=======================================================================");
    }

    private static void runTest(String id, int m, int n, int expected) {
        int actual = UCLN.ucln(m, n);
        boolean pass = (actual == expected);
        String result = pass ? "PASS ✅" : "FAIL ❌";

        System.out.printf("%-6s | (%2d,%2d)       | %-17d | %-17d | %-6s%n",
                id, m, n, expected, actual, result);
    }
}

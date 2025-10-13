import java.util.function.IntSupplier;
import java.util.Arrays;

public class LoopProcessorTest {
    public static void main(String[] args) {
        System.out.println("========================================================================================");
        System.out.printf("%-6s | %-15s | %-25s | %-25s | %-7s%n",
                "TestID", "Input (X,Y)", "Expected Output", "Actual Output", "Result");
        System.out.println("========================================================================================");

        runTest("TC1", 1, -1, new int[]{}, new int[]{1, -1});
        runTest("TC2", 2, 5, new int[]{}, new int[]{2, -1});
        runTest("TC3", -2, 4, new int[]{3}, new int[]{3, -2});
        runTest("TC4", 3, 2, new int[]{}, new int[]{3, -1});

        System.out.println("========================================================================================");
    }

    private static void runTest(String id, int x, int y, int[] inputs, int[] expected) {
        IntSupplier supplier = new IntSupplier() {
            private int index = 0;

            @Override
            public int getAsInt() {
                if (index < inputs.length)
                    return inputs[index++];
                throw new RuntimeException("No more inputs!");
            }
        };

        int[] actual = LoopProcessor.run(x, y, supplier);
        boolean pass = Arrays.equals(actual, expected);
        String result = pass ? "PASS " : "FAIL ";

        System.out.printf("%-6s | (%2d,%2d)          | %-25s | %-25s | %-7s%n",
                id, x, y, Arrays.toString(expected), Arrays.toString(actual), result);
    }
}

public class SumLoopTest {
    public static void main(String[] args) {
        System.out.println("For Loop Test Cases:");

        // Test case 1: Loop does not run (0 iterations)
        int[] a = new int[]{0, 1, 2, 3, 4, 5}; // Corrected array declaration
        System.out.println("Test Case 1: " + Sum.sum(a, 0)); // Expected: 0

        // Test case 2: Loop runs once (1 iteration)
        System.out.println("Test Case 2: " + Sum.sum(a, 1)); // Expected: 0

        // Test case 3: Loop runs twice (2 iterations)
        System.out.println("Test Case 3: " + Sum.sum(a, 2)); // Expected: 1

        // Test case 4: Loop runs five times (5 iterations)
        System.out.println("Test Case 4: " + Sum.sum(a, 5)); // Expected: 10
    }
}
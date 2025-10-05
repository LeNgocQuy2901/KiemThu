public class SumTestC2 {
    public static void main(String[] args) {
        System.out.println("C2 (Decision Coverage) Test Cases:");

        // Test case 1: Empty array
        int[] a1 = {};
        System.out.println("Test Case 1: " + Sum.sum(a1, 0)); // Expected: 0

        // Test case 2: Single element array
        int[] a2 = {2};
        System.out.println("Test Case 2: " + Sum.sum(a2, 1)); // Expected: 5

        // Test case 3: Multiple elements array
        int[] a3 = {1, 2};
        System.out.println("Test Case 3: " + Sum.sum(a3,2)); // Expected: 6

        
    }
}
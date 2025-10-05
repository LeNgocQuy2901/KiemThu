public class SumTestC1 {
    public static void main(String[] args) {
        System.out.println("C1 (Statement Coverage) Test Cases:");

        // Test case 1: Empty array
        int[] a1 = {};
        System.out.println("Test Case 1: " + Sum.sum(a1, 0)); // Expected: 0

        // Test case 2: Single element array
        int[] a2 = {5};
        System.out.println("Test Case 2: " + Sum.sum(a2, 1)); // Expected: 5

        
    }
}
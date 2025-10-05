public class GradeTestC1 {
    public static void main(String[] args) {
        System.out.println("C1 (Statement Coverage) Test Cases:");

        // Test case 1: score < 0
        System.out.println("Test Case 1: " + Grade.getGrade(-1)); // Expected: 'I'

        // Test case 2: score = 9
        System.out.println("Test Case 2: " + Grade.getGrade(9)); // Expected: 'A'

        // Test case 3: score = 8
        System.out.println("Test Case 3: " + Grade.getGrade(8)); // Expected: 'B'

        // Test case 4: score = 7
        System.out.println("Test Case 4: " + Grade.getGrade(7)); // Expected: 'C'

        // Test case 5: score = 5
        System.out.println("Test Case 5: " + Grade.getGrade(5)); // Expected: 'D'

        // Test case 6: score = 4
        System.out.println("Test Case 6: " + Grade.getGrade(4)); // Expected: 'F'
    }
}
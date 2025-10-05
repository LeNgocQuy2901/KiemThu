public class FooTestC2 {
    public static void main(String[] args) {
        System.out.println("C2 (Decision Coverage) Test Cases for foo:");

        // Test case 1: x = 65 (case 65)
        System.out.println("Test Case 1: " + Foo.foo(65)); // Expected: "A"

        // Test case 2: x = 66 (case 66)
        System.out.println("Test Case 2: " + Foo.foo(66)); // Expected: "B"

        // Test case 3: x = 67 (case 67)
        System.out.println("Test Case 3: " + Foo.foo(67)); // Expected: "C"

        // Test case 4: x = 68 (default case)
        System.out.println("Test Case 4: " + Foo.foo(68)); // Expected: "haven't check"
    }
}
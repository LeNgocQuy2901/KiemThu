/**
 * UCLN.java
 * Simple implementation of the Euclidean algorithm (subtraction version) for GCD (UCLN).
 * Translated from the provided pseudocode/image.
 */
public class UCLN {
    /**
     * Return the greatest common divisor (GCD) of m and n using repeated subtraction.
     * Handles negative inputs by taking absolute values.
     */
    public static int ucln(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (m == 0) return n;
        if (n == 0) return m;
        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }

    // small demo runner
    public static void main(String[] args) {
        int[][] tests = {
            {48, 18},
            {0, 5},
            {5, 0},
            {-24, 18},
            {17, 13},
            {270, 192}
        };
        for (int[] t : tests) {
            int a = t[0], b = t[1];
            System.out.printf("ucln(%d, %d) = %d\n", a, b, ucln(a, b));
        }
    }
}

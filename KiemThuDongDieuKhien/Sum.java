public class Sum {
    public static int sum(int[] a, int n) {
        int i, total = 0;
        for (i = 0; i < n; i++) {
            total = total + a[i];
        }
        return total;
    }
}
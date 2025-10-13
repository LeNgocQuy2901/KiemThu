public class LoopProcessor {
    /**
     * Thực hiện thuật toán:
     * input(X, Y)
     * while (Y > 0) {
     *   if (X > 0) Y := Y - X
     *   else input(X)
     * }
     * output(X, Y)
     *
     * @param x initial X
     * @param y initial Y
     * @param inputSupplier cung cấp các giá trị X mới khi input(X) được gọi
     * @return int[]{finalX, finalY}
     */
    public static int[] run(int x, int y, java.util.function.IntSupplier inputSupplier) {
        while (y > 0) {
            if (x > 0) {
                y = y - x;
            } else {
                x = inputSupplier.getAsInt();
            }
        }
        return new int[] { x, y };
    }
}
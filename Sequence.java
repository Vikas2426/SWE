
class Sequence {
    public static void main(String[] argv) {
        int[] A = { 2, 3, 4, 5, 6, 7 };
        System.out.println(isInSequence(A, A.length - 1));
    }

    public static boolean isInSequence(int[] A, int n) {
        if (n == 0)
            return true;

        return (A[n] - A[n - 1] == 1) && isInSequence(A, n - 1);

    }
}
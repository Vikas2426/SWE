public class BubbleSort {

    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
        }
        printSortedArray(array);
    }

    public static void printSortedArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[] { 5, 6, 8, 2, 1, 4, 7, 9, 3, 2, 5, 10 };
        bubbleSort(array);
    }
}
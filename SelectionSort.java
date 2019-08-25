public class SelectionSort {
    public static void selectionSort(int[] array) {
        int firstUnsorted = 0;
        while (firstUnsorted < array.length - 1) {
            int min = firstUnsorted;

            for (int i = firstUnsorted; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }

            }
            if (min != firstUnsorted)
                swap(array, firstUnsorted, min);
            firstUnsorted++;
        }
        printSortedArray(array);
    }

    public static void swap(int[] array, int x, int y) {
        array[x] += array[y];
        array[y] = array[x] - array[y];
        array[x] = array[x] - array[y];
    }

    public static void printSortedArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        printSortedArray(array);
        selectionSort(array);
    }
}
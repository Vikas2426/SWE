public class InsertionSort {
    public static void insertionSort(int[] array) {
        int currentItem = 1;
        while (currentItem < array.length) {
            for (int i = 0; i < currentItem; i++) {
                if (array[currentItem] < array[i]) {
                    insert(array, currentItem, i);
                    break;
                }

            }
            currentItem++;
        }
        printSortedArray(array);
    }

    public static void insert(int[] array, int x, int y) {
        int temp = array[x];
        for (int i = x; i > y; i--) {
            array[i] = array[i - 1];
        }
        array[y] = temp;
    }

    public static void printSortedArray(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[] { 5, 6, 8, 2, 1, 4, 7, 9, 3, 2, 5, 10 };
        printSortedArray(array);
        insertionSort(array);
    }
}
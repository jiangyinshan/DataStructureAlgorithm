public class InsertSort {
    private static void insertSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int arr = a[i + 1];
            int index = i;
            while (index >= 0 && arr < a[index]) {
                a[index + 1] = a[index];
                index--;
            }
            a[index + 1] = arr;
        }
    }
}

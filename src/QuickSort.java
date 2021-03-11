import java.util.Arrays;

public class QuickSort {
    public static void sort(int a[], int low, int hight) {
        int start, end, stand;
        if (low > hight) {
            return;
        }
        start = low;
        end = hight;
        stand = a[start]; // 用子表的第一个记录做基准
        while (start < end) { // 从表的两端交替向中间扫描
            while (start < end && a[end] >= stand)
                end--;
            if (start < end)
                a[start++] = a[end];// 用比基准小的记录替换低位记录
            while (start < end && a[start] < stand)
                start++;
            if (start < end) // 用比基准大的记录替换高位记录
                a[end--] = a[start];
        }
        a[start] = stand;// 将基准数值替换回 a[i]
        sort(a, low, start - 1); // 对低子表进行递归排序
        sort(a, start + 1, hight); // 对高子表进行递归排序

    }

    public static void quickSort(int a[]) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {

        int a[] = {1, 3, 0, 9, 6, 8, 5, 2, 4, 7, 3, 6};
        quickSort(a);
        System.out.println(Arrays.toString(a));
    }
}
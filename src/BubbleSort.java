public class BubbleSort {
//冒泡排序
    public static int[] sort(int[] nums) {
        //只能用于判断趟数，省趟数，不省次数
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            //排序n - 1趟
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            } else {
                //不重置只要交换过就没用了
                flag = true;
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = {2, 4, 3, 5, 1, 4, 6, 9, 7};
        nums = sort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}

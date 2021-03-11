public class BubbleSort {
    public static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = {3, 5, 1, 4, 6, 9, 7};
        nums = sort(nums);
        for (int i : nums
        ) {
            System.out.println(i);
        }
    }
}

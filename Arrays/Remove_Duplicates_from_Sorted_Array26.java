package Arrays;

public class Remove_Duplicates_from_Sorted_Array26 {

    public static void main(String[] args) {

        int nums[] = {1, 1, 2, 2, 2, 3, 3};

        int k = removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeDuplicates(int[] nums) {

        int i = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    nums[i+1] = nums[j];
                    i++;
                }
            }
        return i+1;
    }
}

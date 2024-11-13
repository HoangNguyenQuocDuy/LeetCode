import java.util.Arrays;

public class TwoSum {
    public TwoSum() {};
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[l] + nums[r] < target) l++;
            else if (nums[l] + nums[r] > target) r--;
            else return new int[] { l, r };
        }
        return new int[] { -1, -1 };
    }
}

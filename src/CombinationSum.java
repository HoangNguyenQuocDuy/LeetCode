import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public CombinationSum() {}

    public int solution(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i <= target; i++) {

            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);
            backtrack(result, new ArrayList<>(), candidates, target, 0);
            return result;
        }

        public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums, int remain, int start) {
            if (remain < 0) return;
            else if (remain == 0) list.add(new ArrayList<>(temp));
            else {
                for (int i = start; i < nums.length; i++) {
                    temp.add(nums[i]);
                    backtrack(list, temp, nums, remain - nums[i], i);
                    temp.remove(temp.size() - 1);
                }
            }
        }
}

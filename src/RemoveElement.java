import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveElement {

    public RemoveElement() {}

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                k++;
            }
        }
        return k;
    }
}

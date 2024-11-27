package software.daveturner.samples.puzzles;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

    /*
    find two distinct numbers within the array that when added together, equal the target
    The output will be the indices (positions in the array) of these two numbers
     */
    public int[] sum(int[] nums, int target) {
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (memo.containsKey(nums[i])) { continue; }
            if (memo.containsKey(target - nums[i])) {
                return new int[] {memo.get(target - nums[i]), i};
            }
            memo.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution found");
    }


}

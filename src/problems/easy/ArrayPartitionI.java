package problems.easy;

import java.util.Arrays;

/**
 * Created by stream on 17-4-23.
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

 Example 1:
 Input: [1,4,3,2]

 Output: 4
 Explanation: n is 2, and the maximum sum of pairs is 4.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int ret=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            ret+=nums[i];
        }
        return ret;
    }

}

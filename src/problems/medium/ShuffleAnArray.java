package problems.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by stream on 17-4-17.
 */
public class ShuffleAnArray {
    private int[] nums;

    public ShuffleAnArray(int[] nums) {
        this.nums=nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums==null)
            return nums;
        int[] ret=nums.clone();
        List<Integer> tmpList=new ArrayList<>();
        for(int num:nums)
            tmpList.add(num);
        Collections.shuffle(tmpList);
        int i=0;
        for(int num:tmpList)
            ret[i++]=num;
        return ret;
    }
}

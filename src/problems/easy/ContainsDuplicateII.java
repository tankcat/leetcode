package problems.easy;

import java.util.HashMap;

/**
 * Created by stream on 17-4-22.
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k.
 */
public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> location=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(location.containsKey(nums[i])){
                if(Math.abs(i-location.get(nums[i]))<=k)
                    return true;
                else
                    location.put(nums[i],i);
            }else{
                location.put(nums[i],i);
            }
        }
        return false;
    }
}

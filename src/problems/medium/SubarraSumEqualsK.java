package problems.medium;

/**
 * Created by stream on 17-5-9.
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

 Example 1:
 Input:nums = [1,1,1], k = 2
 Output: 2
 Note:
 The length of the array is in range [1, 20,000].
 The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class SubarraSumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int[] sum=new int[nums.length];
        sum[0]=nums[0];
        int ret=0;
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sum[i]==k)
                ret++;
            for(int j=i-1;j>=0;j--){
                if(sum[i]-sum[j]==k)
                    ret++;
            }
        }
        return ret;
    }
}

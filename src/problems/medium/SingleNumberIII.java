package problems.medium;

/**
 * Created by stream on 17-5-25.
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

 For example:

 Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

 Note:
 The order of the result is not important. So in the above example, [5, 3] is also correct.
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor_result=0;
        for(int i=0;i<nums.length;i++){
            xor_result ^= nums[i];
        }
        int first_one_index=0;
        for(;first_one_index<32;first_one_index++){
            if(((xor_result>>first_one_index)&1)==1)
                break;
        }
        int xor_twice=0;
        for(int i=0;i<nums.length;i++){
            if(((nums[i]>>first_one_index)&1)==1)
                xor_twice ^= nums[i];
        }
        int[] result=new int[2];
        result[0]=xor_twice;
        result[1]=xor_twice^xor_result;
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,1,2,3,4,4};
        SingleNumberIII obj=new SingleNumberIII();
        int[] rest=obj.singleNumber(nums);
        System.out.println(rest[0]+", "+rest[1]);
    }
}

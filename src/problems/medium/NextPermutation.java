package problems.medium;

import tools.Tools;

/**
 * Created by Tankc on 2017/12/26.
 *
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

 If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

 The replacement must be in-place, do not allocate extra memory.

 Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 1,2,3 → 1,3,2
 3,2,1 → 1,2,3
 1,1,5 → 1,5,1
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums==null||nums.length==0||nums.length==1)
            return;
        int i=nums.length-1;
        while(i-1>=0&&nums[i]<=nums[i-1]){
            i--;
        }
        i--;
        if(i>=0){
            int j=i+1;
            while(j<nums.length&&nums[j]>nums[i]){
                j++;
            }
            j--;
            int tmp=nums[j];
            nums[j]=nums[i];
            nums[i]=tmp;
        }
        int end=nums.length-1;
        int begin=i+1;
        for(;begin<end;begin++,end--){
            int tmp=nums[begin];
            nums[begin]=nums[end];
            nums[end]=tmp;
        }
    }

    public static void main(String[] args){
        NextPermutation np=new NextPermutation();
        int[] nums={6,5,4,3,2,1};
        np.nextPermutation(nums);
        Tools.printIntegerArray(nums);
    }
}

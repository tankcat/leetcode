package problems.medium;

/**
 * Created by Tankc on 2017/12/29.
 Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindTheDuplicateNumber {
    public static void main(String[] args){
        int[] nums={1,1};
        System.out.println(findDuplicate(nums));
        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static int findDuplicate(int[] nums) {
        quicksort(nums,0,nums.length-1);
        int tmp=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]==tmp)
                return tmp;
            tmp=nums[i];
        }
        return -1;
    }

    public static void quicksort(int[] nums,int left,int right){
        if(left>=right)
            return;
        int pivot_index=ChoosePivot(nums,left,right);
        quicksort(nums,left,pivot_index-1);
        quicksort(nums,pivot_index+1,right);
    }

    public static int ChoosePivot(int[] nums,int left,int right){
        int pivot;
        int pivot_index;
        int tmp;
        pivot=nums[left];
        pivot_index=left;
        int i=left+1;
        for(int j=left+1;j<=right;j++){
            if(nums[j]<=pivot){
                tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
            }
        }
        nums[pivot_index]=nums[i-1];
        nums[i-1]=pivot;
        return i-1;
    }
}

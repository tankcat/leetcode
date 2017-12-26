package problems.medium;

import java.util.Random;

/**
 * Created by stream on 17-4-17.
 */
public class KthLargestElementInAnArray {
    private Random random=new Random();

    public int findKthLargest(int[] nums, int k) {
        return getMaxK(nums,nums.length,k,0);
    }

    public int getMaxK(int[] nums,int n,int k,int begin){
        int ret=partition(nums,n,begin);
        if(ret==n-k+begin)
            return nums[ret];
        else if(ret<n-k+begin)
            return getMaxK(nums,n-ret-1+begin,k,ret+1);
        else
            return getMaxK(nums,ret-begin,k-(n-ret+begin),begin);
    }

    private int partition(int[] nums,int n,int begin){
        int index=random.nextInt(n);
        swap(nums,index+begin,begin+n-1);
        int i=begin-1;
        int j=begin;
        for(;j<begin+n;j++){
            if(nums[j]<nums[begin+n-1])
                swap(nums,++i,j);
        }
        swap(nums,++i,begin+n-1);
        return i;
    }

    private void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args){
        KthLargestElementInAnArray obj=new KthLargestElementInAnArray();
        int[] nums={1,1,1,1,1};
        int k=4;
        System.out.println(obj.findKthLargest(nums,k));
    }
}

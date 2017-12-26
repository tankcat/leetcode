package problems.medium;

/**
 * Created by stream on 17-4-17.
 */
public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int[] ret=new int[nums.length];
        ret[0]=1;
        for(int i=1;i<nums.length;i++)
            ret[i]=ret[i-1]*nums[i-1];
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            ret[i]=ret[i]*right;
            right*=nums[i];
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,4};
        ProductOfArrayExceptItself obj=new ProductOfArrayExceptItself();
        int[] ret=obj.productExceptSelf(nums);
        for(int num:ret){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}

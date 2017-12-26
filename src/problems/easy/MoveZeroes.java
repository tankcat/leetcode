package problems.easy;

/**
 * Created by stream on 17-5-20.
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length&&nums[i]!=0)
            i++;
        j=i;
        while(j<nums.length&&nums[j]==0)
            j++;
        for(;j<nums.length;j++){
            if(nums[j]!=0)
                nums[i++]=nums[j];
        }
        for(;i<nums.length;i++)
            nums[i]=0;
    }

    public static void main(String[] args){
        int[] nums={1,1,1,3,12,1};
        MoveZeroes obj=new MoveZeroes();
        obj.moveZeroes(nums);
        for(int num:nums)
            System.out.print(num+" ");
        System.out.print("\n");
    }
}

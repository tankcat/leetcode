package problems.easy;

/**
 * Created by stream on 17-4-13.
 */
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] findNums,int[] nums){
        int[] ret=new int[findNums.length];
        int count=0;
        for(int num:findNums){
            int index=0;
            while(index<nums.length&&nums[index]!=num)
                index++;
            index++;
            while(index<nums.length&&nums[index]<=num){
                index++;
            }
            ret[count++]=(index<nums.length?nums[index]:-1);
        }
        return ret;
    }

    public static void main(String[] args){
        NextGreaterElement nge=new NextGreaterElement();
        int[] arr1={2,4};
        int[] arr2={1};
        for(int i:nge.nextGreaterElement(arr1,arr2)){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

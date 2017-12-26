package problems.easy;

/**
 * Created by wxt on 2017/1/19.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] array={1,1,0,0,1,1};
        MaxConsecutiveOnes mco=new MaxConsecutiveOnes();
        System.out.print(mco.findMaxConsecutiveOnes(array));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        String str=sb.toString();
        String[] items=str.split("0");
        int n=0;
        for(int i=0;i<items.length;i++){
            if(n<items[i].length()){
                n=items[i].length();
            }
        }
        return n;
    }
}

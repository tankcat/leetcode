package problems.easy;

/**
 * Created by stream on 17-4-14.
 */
public class TwoSum {
    public int[] twoSum(int[] numbers,int target){
        int[] ret=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            int j=i+1;
            while(j<numbers.length&&numbers[j]+numbers[i]!=target)
                j++;
            if(j<numbers.length&&numbers[j]+numbers[i]==target) {
                ret[0] = i;
                ret[1]=j;
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args){
        TwoSum ts=new TwoSum();
        int[] numbers={0, 4, 3, 0};
        int target=0;
        int[] ret=ts.twoSum(numbers,target);
        System.out.println(ret[0]+" "+ret[1]);
    }

}

package problems.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by stream on 17-4-7.
 */
public class MissingNumber {
    public int missingNumber(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<=nums.length;i++){
            set.add(i);
        }
        for(int i:nums){
            set.remove(i);
        }
        int ret=0;
        for(Integer i :set){
            ret=i;
            break;
        }
        return ret;
    }

    public static void main(String[] args){
        MissingNumber mu=new MissingNumber();
        int[] nums={1,3,4,2};
        System.out.println(mu.missingNumber(nums));
    }
}

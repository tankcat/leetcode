package problems.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by stream on 17-4-14.
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums){
        List<Integer> ret=new LinkedList<>();
        boolean[] flag=new boolean[nums.length];
        for(int num:nums){
            if(flag[num-1]==false)
                flag[num-1]=true;
            else
                ret.add(num);
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums={4,3,2,7,8,2,3,1};
        FindAllDuplicatesInAnArray fadiaa=new FindAllDuplicatesInAnArray();
        System.out.println(fadiaa.findDuplicates(nums));
    }
}

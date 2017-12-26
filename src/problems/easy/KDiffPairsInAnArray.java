package problems.easy;

import java.util.*;

/**
 * Created by stream on 17-4-17.
 */
public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0||k<0)
            return 0;
        Map<Integer,Integer> map=new HashMap<>();
        int ret=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(k==0){
                if(entry.getValue()>=2)
                    ret++;
            }else
                if(map.containsKey(entry.getKey()+k))
                    ret++;
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums={1, 1, 1, 1, 1};
        int k=0;
        KDiffPairsInAnArray kdpinaa=new KDiffPairsInAnArray();
        System.out.println(kdpinaa.findPairs(nums,k));
    }
}

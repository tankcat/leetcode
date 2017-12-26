package problems.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by stream on 17-5-22.
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num))
                map.put(num,map.get(num)+1);
            else
                map.put(num,1);
        }
        int ret=0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1))
                ret=Math.max(ret,map.get(key)+map.get(key+1));
        }
        return ret;
    }
}

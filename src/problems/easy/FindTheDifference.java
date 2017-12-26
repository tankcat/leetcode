package problems.easy;

import java.util.*;

/**
 * Created by stream on 17-3-31.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> s_map=getHashMap(s);
        HashMap<Character,Integer> t_map=getHashMap(t);
        for(Map.Entry<Character,Integer> entry:t_map.entrySet()){
            if(entry.getValue()!=s_map.get(entry.getKey()))
                return entry.getKey();
        }
        return ' ';
    }

    public HashMap<Character,Integer> getHashMap(String s){
        HashMap<Character,Integer> result=new HashMap<>();
        for(char c:s.toCharArray()){
            if(result.containsKey(c)){
                result.put(c,result.get(c)+1);
            }else{
                result.put(c,1);
            }
        }
        return result;
    }
}

package com.tankcat2.leetcode.medium;

import java.util.*;

/**
 * Created by stream on 17-6-2.
 */
public class SortCharactersByFrequency {
    private HashMap<Character,Integer> map=new HashMap<>();
    public String frequencySort(String s) {
        for(int i=0;i<s.length();i++){
            int count=map.containsKey(s.charAt(i))?map.get(s.charAt(i)):0;
            count++;
            map.put(s.charAt(i),count);
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> t1, Map.Entry<Character, Integer> t2) {
                return t2.getValue()-t1.getValue();
            }
        });
        StringBuffer ret=new StringBuffer();
        for(Map.Entry<Character,Integer> item:list){
            char c=item.getKey();
            int count=item.getValue();
            for(int i=0;i<count;i++)
                ret.append(c);
        }
        return ret.toString();
    }
}

package com.tankcat2.leetcode.medium;

/**
 * Created by stream on 17-5-25.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int index_s=0,index_t=0;
        while(index_t<t.length()){
            if(t.charAt(index_t)==s.charAt(index_s)){
                index_s++;
                if(index_s==s.length())
                    return true;
            }
            index_t++;
        }
        return false;
    }
}

package com.tankcat2.leetcode.easy;

import java.util.*;

/**
 * Created by stream on 17-4-12.
 */
public class WordPattern {
   public boolean wordPattern(String pattern,String str){
        if(str==null || str.length()==0)
            return false;
        String[] str_item=str.split(" ");
        if(str_item.length!=pattern.length())
            return false;
        String[] hash_char=new String[26];
        Set<String> hash_str=new HashSet<>();
        for(int i=0;i<hash_char.length;i++){
            hash_char[i]="";
        }
        for(int i=0;i<pattern.length();i++){
            if(!hash_char[pattern.charAt(i)-'a'].equals("")) {
                if (hash_char[pattern.charAt(i)-'a'].equals(str_item[i]))
                    continue;
                else
                    return false;
            }else{
                if(hash_str.contains(str_item[i])){
                    return false;
                }
                hash_str.add(str_item[i]);
                hash_char[pattern.charAt(i)-'a']=str_item[i];
            }
        }
        return true;
    }

   public boolean isIsomorphic(String s, String t) {
        if(s==null&&t==null)
            return true;
        if(s.length()!=t.length())
            return false;
        char[] hash_s=new char[128];
        boolean[] hash_t=new boolean[128];
        for(int i=0;i<s.length();i++){
            if(hash_s[s.charAt(i)]=='\u0000'){
                if(hash_t[t.charAt(i)]==true)
                    return false;
                hash_t[t.charAt(i)]=true;
                hash_s[s.charAt(i)]=t.charAt(i);
            }else{
                if(hash_s[s.charAt(i)]!=t.charAt(i))
                    return false;
            }
        }
        return true;
    }

    class Snow{}
    class Power{}
    class Light extends Power{}
    class Heavy extends Power{}
    public void  test(){
        List<Snow> snow=new ArrayList<>();

    }
    public static void main(String[] args){
        WordPattern wp=new WordPattern();
        System.out.println(wp.isIsomorphic("aaba","bbcb"));

    }
}

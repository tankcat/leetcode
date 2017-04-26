package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-4-26.
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        FirstUniqueCharacterInAString obj=new FirstUniqueCharacterInAString();
        System.out.println(obj.firstUniqChar("aa"));
    }
}

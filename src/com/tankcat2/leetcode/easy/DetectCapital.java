package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-3-31.
 */
public class DetectCapital {
    public static void main(String[] args){
        DetectCapital dc=new DetectCapital();
        System.out.println(dc.detectCapitalUse("acx"));
    }
    public boolean detectCapitalUse(String word) {
        if(word.length()>1) {
            if (word.charAt(0) <= 'Z') {
                if (word.charAt(1) <= 'Z') {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) > 'Z')
                            return false;
                    }
                    return true;
                } else {
                    for (int i = 2; i < word.length(); i++) {
                        if (word.charAt(i) <= 'Z')
                            return false;
                    }
                    return true;
                }
            } else {
                for (int i = 1; i < word.length(); i++) {
                    if (word.charAt(i) <= 'Z')
                        return false;
                }
                return true;
            }
        }
        return true;
    }
}

package com.tankcat2.leetcode.easy;

import java.util.stream.StreamSupport;

/**
 * Created by stream on 17-4-23.
 *Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".

 Subscribe to see which companies asked this question.

 Hide Tags
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] s_char=s.toCharArray();
        while(i<j){
            while(i<s.length()&&s_char[i]!='a'&&s_char[i]!='e'&&s_char[i]!='i'&&s_char[i]!='o'&&s_char[i]!='u'
                    &&s_char[i]!='A'&&s_char[i]!='E'&&s_char[i]!='I'&&s_char[i]!='O'&&s_char[i]!='U')
                i++;
            while(j>=0&&s_char[j]!='a'&&s_char[j]!='e'&&s_char[j]!='i'&&s_char[j]!='o'&&s_char[j]!='u'
                    &&s_char[j]!='A'&&s_char[j]!='E'&&s_char[j]!='I'&&s_char[j]!='O'&&s_char[j]!='U')
                j--;
            if(i>=j)
                break;
            else{
                char tmp=s_char[i];
                s_char[i]=s_char[j];
                s_char[j]=tmp;
                i++;
                j--;
            }
        }
        return String.valueOf(s_char);
    }
    public static void main(String[] args){
        ReverseVowelsOfAString obj=new ReverseVowelsOfAString();
        System.out.println(obj.reverseVowels(".,"));
    }
}

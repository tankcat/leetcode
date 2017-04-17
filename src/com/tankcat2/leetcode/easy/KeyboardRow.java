package com.tankcat2.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by stream on 17-3-25.
 */
public class KeyboardRow {

    public String[] findWords(String[] words){
        Character[] char1={'q','w','e','r','t','y','u','i','o','p'};
        Character[] char2={'a','s','d','f','g','h','j','k','l'};
        Character[] char3={'z','x','c','v','b','n','h','m'};
        Set<Character> row1=new HashSet<Character>();
        Set<Character> row2=new HashSet<Character>();
        Set<Character> row3=new HashSet<Character>();
        for(int i=0;i<char1.length;i++){
            row1.add(char1[i]);
        }
        for(int i=0;i<char2.length;i++){
            row2.add(char2[i]);
        }
        for(int i=0;i<char3.length;i++){
            row3.add(char3[i]);
        }
        ArrayList<String> result=new ArrayList<String>();
        for(String word:words){
            boolean flag=false;
            String tmp_word=word.toLowerCase();
            int first=whichRow(tmp_word.charAt(0),row1,row2,row3);
            for(int i=1;i<tmp_word.length();i++){
                int number=whichRow(tmp_word.charAt(i),row1,row2,row3);
                if(number!=first)
                    flag=true;
            }
            if(flag==false)
                result.add(word);

        }
        String[] rt=new String[result.size()];
        int index=0;
        for(String word:result){
            rt[index++]=word;
        }
        return rt;
    }

    private Integer whichRow(Character ch, Set<Character> row1,Set<Character> row2,Set<Character> row3){
        if(row1.contains(ch)){
            return 1;
        }
        if(row2.contains(ch)){
            return 2;
        }
        if(row3.contains(ch)){
            return 3;
        }
        return -1;
    }

    public static void main(String[] args){
        String[] words={"Hello", "Alaska", "Dad", "Peace"};
        KeyboardRow kr=new KeyboardRow();
        String[] result=kr.findWords(words);
        for(String word:result){
            System.out.print(word+" ");
        }
    }
}

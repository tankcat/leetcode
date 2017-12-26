package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by stream on 17-4-9.
 */
public class FindAllAnagramsInAString {
    public static void main(String[] args){
        FindAllAnagramsInAString faais=new FindAllAnagramsInAString();
        System.out.println(faais.findAnagrams("abab","ab"));
    }
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> ret=new ArrayList<>();
        int p_len=p.length();
        for(int i=0;i<s.length()-p_len+1;i++) {
            String tmp=s.substring(i,i+p_len);
            if(equal(tmp,p))
                ret.add(i);
        }
        return ret;
    }

    public boolean equal(String s,String p){
        char[] s_arr=s.toCharArray();
        Arrays.sort(s_arr);
        char[] p_arr=p.toCharArray();
        Arrays.sort(p_arr);
        if(Arrays.toString(s_arr).equals(Arrays.toString(p_arr)))
            return true;
        else
            return false;
    }
}

package problems.easy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by stream on 17-3-31.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length())
            return false;
        List<Character> s_l=new ArrayList<>();
        List<Character> t_l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            s_l.add(s.charAt(i));
        for(int i=0;i<t.length();i++)
            t_l.add(t.charAt(i));
        Collections.sort(s_l);
        Collections.sort(t_l);
        for(int i=0;i<s_l.size();i++){
            if(t_l.get(i)!=s_l.get(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        ValidAnagram va=new ValidAnagram();
        System.out.println(va.isAnagram("abc","cea"));
    }
}

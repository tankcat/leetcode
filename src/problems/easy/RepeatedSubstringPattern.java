package problems.easy;

/**
 * Created by stream on 17-4-25.
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()<2)
            return false;
        int i=s.length()/2;
        while(s.length()%i!=0)
            i--;
        for(;i>0;){
            while(s.length()%i!=0)
                i--;
            String sub=s.substring(0,i);
            int begin1=0;
            int begin2=i;
            boolean flag=true;
            while(begin2<s.length()){
                if(sub.charAt(begin1++)!=s.charAt(begin2++)) {
                    flag=false;
                    break;
                }
                if(begin1==i)
                    begin1=0;
            }
            if(flag==true)
                return true;
            i--;
        }
        return false;
    }

    public static void main(String[] args){
        RepeatedSubstringPattern obj=new RepeatedSubstringPattern();
        System.out.println(obj.repeatedSubstringPattern("a"));
    }
}

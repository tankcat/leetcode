package problems.easy;

/**
 * Created by stream on 17-4-22.
 * Given two binary strings, return their sum (also a binary string).

 For example,
 a = "11"
 b = "1"
 Return "100"
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        char[] ret=new char[a.length()>b.length()?a.length()+1:b.length()+1];
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        int index=ret.length-1;
        while(i>=0&&j>=0){
            ret[index--]=(char)((a.charAt(i)-'0'+b.charAt(j)-'0'+c)%2+'0');
            c=((a.charAt(i)-'0')+(b.charAt(j)-'0')+c)/2;
            i--;
            j--;
        }
        while(i>=0){
            ret[index--]=(char)((a.charAt(i)-'0'+c)%2+'0');
            c=((a.charAt(i)-'0')+c)/2;
            i--;
        }
        while(j>=0){
            ret[index--]=(char)((b.charAt(j)-'0'+c)%2+'0');
            c=((b.charAt(j)-'0')+c)/2;
            j--;
        }
        if(c==1)
            ret[index--]=(char) ('0'+c);
        return String.valueOf(ret,index+1,ret.length-index-1);
    }

    public static void main(String[] args){
        AddBinary obj=new AddBinary();
        System.out.println(obj.addBinary("10","1"));
    }

}

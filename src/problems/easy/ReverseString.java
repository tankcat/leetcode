package problems.easy;

/**
 * Created by stream on 17-3-31.
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s){
        char[] chararray=s.toCharArray();
        for(int i=0;i<chararray.length/2;i++){
            char tmp=chararray[i];
            chararray[i]=chararray[chararray.length-1-i];
            chararray[chararray.length-1-i]=tmp;
        }
        return new String(chararray);
    }

    public String reverseStr(String s, int k) {
        char[] chararray=s.toCharArray();
        int length=s.length();
        if(length<=k){
            for(int i=0;i<length/2;i++){
                char tmp=chararray[i];
                chararray[i]=chararray[length-1-i];
                chararray[length-1-i]=tmp;
            }
            return new String(chararray);
        }else if(length<2*k){
            for(int i=0;i<k/2;i++){
                char tmp=chararray[i];
                chararray[i]=chararray[k-1-i];
                chararray[k-1-i]=tmp;
            }
            return new String(chararray);
        }else{
            for(int i=0;i<length/(2*k);i++){
                for(int j=0;j<k/2;j++){
                    char temp=chararray[i*2*k+j];
                    chararray[i*2*k+j]=chararray[(2*i+1)*k-j-1];
                    chararray[(2*i+1)*k-j-1]=temp;
                }
            }
            int begin=length/(2*k)*2*k;
            int end;
            if(length%(2*k)<=k){
                end=length;
            }else{
                end=length/(2*k)*2*k+k;
            }
            int time=(end-begin)/2;
            for(int i=0;i<time;i++){
                char tmp=chararray[begin];
                chararray[begin]=chararray[end-1-i];
                chararray[end-1-i]=tmp;
                begin++;
            }
            return new String(chararray);
        }
    }
    public String reverseWords(String s) {
        int length=s.length();
        s+=" ";
        int begin = 0;
        int end = 0;
        char[] s_char = s.toCharArray();
        while(begin<s.length()) {
            while (s_char[end] != ' ') {
                end++;
            }
            for (int j = 0; j < (end - begin) / 2; j++) {
                char tmp = s_char[begin + j];
                s_char[begin + j] = s_char[end - 1 - j];
                s_char[end - 1 - j] = tmp;
            }
            begin = end + 1;
            end++;
        }
        return new String(s_char,0,length);
    }
    public static void main(String[] args){
        ReverseString rs=new ReverseString();
        System.out.println(rs.reverseWords( "Let's take LeetCode contest"));
    }
}

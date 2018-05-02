package problems.medium;

public class LongestPalindromicSubstring {
    public static void main(String[] args){
        LongestPalindromicSubstring obj=new LongestPalindromicSubstring();
        String str="abccba";
        System.out.println(obj.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        /*String result=null;
        int maxLength=s.length();
        for(;maxLength>=1;maxLength--){
            for(int i=0;i+maxLength<=s.length();i++){
                String tmp_str=s.substring(i,i+maxLength);
                if(isPalindromic(tmp_str))
                    return tmp_str;
            }
        }
        return result;*/
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int length1=expandAroundCenter(s,i,i);
            int length2=expandAroundCenter(s,i,i+1);
            int len=Math.max(length1,length2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }

    private boolean isPalindromic(String str){
        int i=0;
        int j=str.length()-1;
        for(;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }

    private int expandAroundCenter(String str, int left,int right){
        int L=left;
        int R=right;
        while(L>=0 && R<str.length() && str.charAt(L)== str.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}

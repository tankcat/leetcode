package problems.easy;

/**
 * Created by stream on 17-4-22.
 * Given an integer, return its base 7 string representation.

 Example 1:
 Input: 100
 Output: "202"
 Example 2:
 Input: -7
 Output: "-10"
 */
public class BaseSeven {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        int tmp_num=Math.abs(num);
        StringBuffer sb=new StringBuffer();
        while(tmp_num>0){
            sb.append((char)(tmp_num%7+'0'));
            tmp_num/=7;
        }
        sb.reverse();
        return num<0?("-"+sb.toString()):sb.toString();
    }

    public static void main(String[] args){
        BaseSeven obj=new BaseSeven();
        System.out.println(obj.convertToBase7(-12));
    }
}

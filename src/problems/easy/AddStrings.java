package problems.easy;

/**
 * Created by stream on 17-4-6.
 */
public class AddStrings {
    public String addStrings(String num1, String num2){
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int c=0;
        while(i>=0&&j>=0){
            int n1=num1.charAt(i)-'0';
            int n2=num2.charAt(j)-'0';
            int ret=(n1+n2+c)%10;
            c=(n1+n2+c)/10;
            sb.insert(0,ret+"");
            i--;
            j--;
        }
        while(i>=0){
            int n1=num1.charAt(i)-'0';
            int ret=(n1+c)%10;
            c=(n1+c)/10;
            sb.insert(0,ret+"");
            i--;
        }
        while(j>=0){
            int n2=num2.charAt(j)-'0';
            int ret=(n2+c)%10;
            c=(n2+c)/10;
            sb.insert(0,ret+"");
            j--;
        }
        if(c>0)
            sb.insert(0,c+"");
        return sb.toString();
    }

    public static void main(String[] args){
        AddStrings as=new AddStrings();
        System.out.println(as.addStrings("1","9"));
        System.out.println(1234+9876);
    }
}

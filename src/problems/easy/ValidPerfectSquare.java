package problems.easy;

/**
 * Created by stream on 17-5-20.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        int begin=0;
        int end=num;
        int mid;
        while(begin<end){
            mid=(begin+end)/2;
            if(num%mid==0&&num/mid==mid)
                return true;
            else if(num/mid<mid){
                end=mid;
            }else
                begin=mid+1;
        }
        return false;
    }

    public static void main(String[] args){
        ValidPerfectSquare obj=new ValidPerfectSquare();
        System.out.println(obj.isPerfectSquare(2147483647));
    }
}

package problems.easy;

/**
 * Created by stream on 17-4-6.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n){
        if(n==1)
            return true;
        if(n<1)
            return false;
        while(n>0&&n!=1){
            if(n%2!=0)
                return false;
            n/=2;
        }
        return true;
    }
    public static void main(String[] args){
        PowerOfTwo pot=new PowerOfTwo();
        System.out.println(pot.isPowerOfTwo(100));
    }
}

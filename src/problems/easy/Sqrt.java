package problems.easy;

/**
 * Created by stream on 17-4-11.
 */
public class Sqrt {
    public int mySqrt(int x){
        /*if(x==0)
            return x;
        int left=1;
        int right=Integer.MAX_VALUE;
        while(true){
            int middle=left+(right-left)/2;
            if(middle>x/middle)
                right=middle-1;
            else{
                if(middle+1>x/(middle+1))
                    return middle;
                left=middle+1;
            }
        }*/
        long r=x;
        while(r*r>x){
            r=(r+x/r)/2;
        }
        return (int)r;
    }

    public static void main(String[] args){

    }
}

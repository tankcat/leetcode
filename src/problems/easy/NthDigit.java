package problems.easy;

/**
 * Created by stream on 17-4-9.
 */
public class NthDigit {
    public int[] tmp={
            9,
            9+2*90,
            9+2*90+3*900,
            9+2*90+3*900+4*9000,
            9+2*90+3*900+4*9000+5*90000,
            9+2*90+3*900+4*9000+5*90000+6*900000,
            9+2*90+3*900+4*9000+5*90000+6*900000+7*9000000,
            9+2*90+3*900+4*9000+5*90000+6*900000+7*9000000+8*90000000,
            //9+2*90+3*900+4*9000+5*90000+6*900000+7*9000000+8*90000000+9*900000000
            Integer.MAX_VALUE

    };

    public int fingNthDigit(int n){
        if(n<tmp[0]+1)
            return n;
        if(n<tmp[1]+1){
            int num;
            if((n-tmp[0])%2==0)
                num=0;
            else
                num=1;
            num+=9+(n-tmp[0])/2;
            int remain=n-(tmp[0]+(num-9-1)*2);
            int ret_index=2-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }
        if(n<tmp[2]+1){
            int num;
            if((n-tmp[1])%3==0)
                num=0;
            else
                num=1;
            num+=99+(n-tmp[1])/3;
            int remain=n-(tmp[1]+(num-1-99)*3);
            int ret_index=3-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }
        if(n<tmp[3]+1){
            int num;
            if((n-tmp[2])%4==0)
                num=0;
            else
                num=1;
            num+=999+(n-tmp[2])/4;
            int remain=n-(tmp[2]+(num-1-999)*4);
            int ret_index=4-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }
        if(n<tmp[4]+1){
            int num;
            if((n-tmp[3])%5==0)
                num=0;
            else
                num=1;
            num+=9999+(n-tmp[3])/5;
            int remain=n-(tmp[3]+(num-1-9999)*5);
            int ret_index=5-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }
        if(n<tmp[5]+1){
            int num;
            if((n-tmp[4])%6==0)
                num=0;
            else
                num=1;
            num+=99999+(n-tmp[4])/6;
            int remain=n-(tmp[4]+(num-1-99999)*6);
            int ret_index=6-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }
        if(n<tmp[6]+1){
            int num;
            if((n-tmp[5])%7==0)
                num=0;
            else
                num=1;
            num+=999999+(n-tmp[5])/7;
            int remain=n-(tmp[5]+(num-1-999999)*7);
            int ret_index=7-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }
        if(n<tmp[7]+1){
            int num;
            if((n-tmp[6])%8==0)
                num=0;
            else
                num=1;
            num+=9999999+(n-tmp[6])/8;
            int remain=n-(tmp[6]+(num-1-9999999)*8);
            int ret_index=8-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }else{

            int num;
            if((n-tmp[7])%9==0)
                num=0;
            else
                num=1;
            num+=99999999+(n-tmp[7])/9;
            int remain=n-(tmp[7]+(num-1-99999999)*9);
            int ret_index=9-remain+1;
            int ret=0;
            while(ret_index>0){
                ret=num%10;
                num/=10;
                ret_index--;
            }
            return ret;
        }

    }
    public static void main(String[] args){
        NthDigit nd=new NthDigit();
        System.out.println(nd.fingNthDigit(2147483647));
    }
}

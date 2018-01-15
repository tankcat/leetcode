package problems.easy;

import java.util.ArrayList;

/**
 * Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.

 (Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)

 Example 1:

 Input: L = 6, R = 10
 Output: 4
 Explanation:
 6 -> 110 (2 set bits, 2 is prime)
 7 -> 111 (3 set bits, 3 is prime)
 9 -> 1001 (2 set bits , 2 is prime)
 10->1010 (2 set bits , 2 is prime)
 Example 2:

 Input: L = 10, R = 15
 Output: 5
 Explanation:
 10 -> 1010 (2 set bits, 2 is prime)
 11 -> 1011 (3 set bits, 3 is prime)
 12 -> 1100 (2 set bits, 2 is prime)
 13 -> 1101 (3 set bits, 3 is prime)
 14 -> 1110 (3 set bits, 3 is prime)
 15 -> 1111 (4 set bits, 4 is not prime)
 Note:

 L, R will be integers L <= R in the range [1, 10^6].
 R - L will be at most 10000.
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {
    private ArrayList<Integer> allPrimes=new ArrayList<>();
    public int countPrimeSetBits(int L, int R) {
        /*int[] obnL=getPairs(L);
        int[] obnR=getPairs(R);
        getAllPrimes(obnR[0]-1);
        int ret=0;
        for(int i=obnL[0]+1;i<obnR[0];i++){
            int index=0;
            while(allPrimes.get(index)<=i){
                ret+=permutation(i,allPrimes.get(index));
                index++;
            }
        }*/
        int ret=0;
        for(int i=L;i<=R;i++){
            if(isPrime(getOneBitNumber(i))){
                ret++;
            }
        }
        return ret;
    }

    /*private int[] getPairs(int num){
        int[] ret=new int[2];
        while(num!=0){
            num/=2;
            ret[0]++;
            if(num%2==1)
                ret[1]++;
        }
        return ret;
    }*/

    private int getOneBitNumber(int num){
        int ret=0;
        while(num!=0){
            if(num%2==1)
                ret++;
            num/=2;
        }
        //System.out.println(ret);
        return ret;
    }
    private boolean isPrime(int num){
        if(num==1)
            return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    /*private void getAllPrimes(int num){
        for(int i=2;i<=num;i++){
            boolean flag=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0) {
                    flag = true;
                    break;
                }
            }
            if(flag==false)
                allPrimes.add(i);
        }
    }*/

    /*private int permutation(int n,int m){
        int a=1;
        for(int i=1;i<=m;i++){
            a*=i;
        }
        int b=1;
        for(int i=1;i<=n;i++){
            b*=i;
        }
        int c=1;
        for(int i=1;i<=n-m;i++){
            c*=i;
        }
        return b/(a*c);
    }*/

    public static void main(String[] args){
        PrimeNumberOfSetBitsInBinaryRepresentation obj=new PrimeNumberOfSetBitsInBinaryRepresentation();
        System.out.println(obj.countPrimeSetBits(6,10));
    }
}

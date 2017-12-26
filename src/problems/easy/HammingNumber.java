package problems.easy;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by wxt on 2017/1/19.
 */
public class HammingNumber {
    public HammingNumber(){

    }
    public static void main(String[] args){
        HammingNumber hn=new HammingNumber();
        Scanner sc = new Scanner(System.in);
        int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.print(hn.hammingDistance(x,y));

    }
    public int hammingDistance(int x, int y) {
        ArrayList<Integer> xl=getBinaryBit(x);
        ArrayList<Integer> yl=getBinaryBit(y);
        if(xl.size()<yl.size()){
            int delta=yl.size()-xl.size();
            for(int i=0;i<delta;i++){
                xl.add(0);
            }
        }else if(xl.size()>yl.size()){
            int delta=xl.size()-yl.size();
            for(int i=0;i<delta;i++){
                yl.add(0);
            }
        }
        int result=0;
        for(int i=0;i<xl.size();i++){
            if(!xl.get(i).equals(yl.get(i))){
                result++;
            }
        }
        return result;
    }
    public ArrayList<Integer> getBinaryBit(int x){
        ArrayList<Integer> list=new ArrayList<>();
        while(x!=0){
            int a=x%2;
            x=x/2;
            list.add(a);
        }
        return list;
    }
}

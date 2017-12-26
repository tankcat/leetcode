package problems.medium;

import java.util.stream.Stream;

/**
 * Created by stream on 17-5-22.
 * Given a string representing an expression of fraction addition and subtraction, you need to return the calculation result in string format. The final result should be irreducible fraction. If your final result is an integer, say 2, you need to change it to the format of fraction that has denominator 1. So in this case, 2 should be converted to 2/1.

 Example 1:
 Input:"-1/2+1/2"
 Output: "0/1"
 Example 2:
 Input:"-1/2+1/2+1/3"
 Output: "1/3"
 Example 3:
 Input:"1/3-1/2"
 Output: "-1/6"
 Example 4:
 Input:"5/3+1/3"
 Output: "2/1"
 Note:
 The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
 Each fraction (input and output) has format ±numerator/denominator. If the first input fraction or the output is positive, then '+' will be omitted.
 The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1,10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
 The number of given fractions will be in the range [1,10].
 The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.

 */
public class FractionAdditionAndSubtraction {
    public String fractionAddition(String expression) {
        String[] fracs=expression.split("(?=[-,+])");
        String ret="0/1";
        for(String frac:fracs){
            ret=add(frac,ret);
        }
        return ret;
    }

    private String add(String frac1,String frac2){
        int[] f1= Stream.of(frac1.split("/")).mapToInt(Integer::parseInt).toArray();
        int[] f2= Stream.of(frac2.split("/")).mapToInt(Integer::parseInt).toArray();
        int denominator=f1[1]*f2[1]/gcd(f1[1],f2[1]);
        int numerator=denominator/f1[1]*f1[0]+denominator/f2[1]*f2[0];
        String sign="";
        if(numerator<0){
            sign="-";
            numerator*=-1;
        }
        return sign+numerator/gcd(numerator,denominator)+"/"+denominator/gcd(numerator,denominator);
    }

    private int gcd(int x,int y){
        while(y!=0){
            int r=y;
            y=x%y;
            x=r;
        }
        return x;
    }

    public static void main(String[] args){
        FractionAdditionAndSubtraction obj=new FractionAdditionAndSubtraction();
        System.out.println(obj.fractionAddition("1/2-1/3"));
    }
}

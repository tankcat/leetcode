package com.tankcat2.leetcode.Hard;

/**
 * Created by stream on 17-4-26.
 */
public class IntegerToEnglishWords {
    //hundred, thousand(1000), million(100,0000), billion(10,0000,0000)
    //Integer.MAX_VALUE=21,4748,3647
    //20,00000000
    //two billion
    //1,4700,0000
    //one hundred forty seven million
    //48,3647
    //forty hundred eighty three thousand
    //647
    //six hundred forty eight

    private final String[] Less_Than_20={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] Tens={"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        return "";
    }



    public static void main(String[] args){
        IntegerToEnglishWords obj=new IntegerToEnglishWords();
        System.out.println(obj.numberToWords(1121));
    }

}

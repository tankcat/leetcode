package com.tankcat2.leetcode.medium;

/**
 * Created by stream on 17-6-2.
 */
public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] ret=new int[n][n];
        int m=1;
        int i,j;
        for(i=0;i<n/2;i++){
            for(j=0;j<n-i;j++){
                if(ret[i][j] ==0)
                    ret[i][j] = m++;
            }
            for(j=i+1;j<n-i;j++){
                if(ret[j][n-1-i] ==0)
                    ret[j][n-1-i] = m++;
            }

            for(j=n-i-1;j>i;j--){
                if(ret[n-i-1][j] ==0)
                    ret[n-i-1][j] = m++;
            }
            for(j=n-i-1;j>i;j--){
                if(ret[j][i] ==0)
                    ret[j][i] = m++;
            }
        }
        if(n%2==1)
            ret[n/2][n/2]=m;
        return ret;
    }

    public static void main(String[] args){
        int[][] ret=new SpiralMatrixII().generateMatrix(2);
        for(int i=0;i<ret.length;i++){
            for(int j=0;j<ret[0].length;j++){
                System.out.print(ret[i][j]+" ");
            }
            System.out.println();
        }
    }
}

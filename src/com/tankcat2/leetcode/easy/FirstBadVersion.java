package com.tankcat2.leetcode.easy;

/**
 * Created by stream on 17-5-20.
 */
public class FirstBadVersion {
    private boolean isBadVersion(int num){
        return true;
    }
    public int firstBadVersion(int n) {
        int begin=1;
        int end=n;
        int mid;
        while(begin<end){
            mid=begin+(end-begin)/2;
            if(isBadVersion(mid)==false)
                begin=mid+1;
            else
                end=mid;
        }
        return begin;
    }
}

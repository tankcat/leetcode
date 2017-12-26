package problems.easy;

import java.util.*;

/**
 * Created by stream on 17-4-15.
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ret=new LinkedList<>();
        Set<Integer> num1_set=new HashSet<>();
        for(int num:nums1){
            num1_set.add(num);
        }
        for(int num:nums2){
            if(num1_set.contains(num)) {
                ret.add(num);
            }
        }
        int[] ret_arr=new int[ret.size()];
        if(ret.size()==0)
            return ret_arr;
        int index=0;
        for(int num:ret)
            ret_arr[index++]=num;
        return ret_arr;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ret=new LinkedList<>();
        HashMap<Integer,Integer> num1_set=new HashMap<>();
        for(int num:nums1){
            num1_set.put(num,num1_set.containsKey(num)?num1_set.get(num)+1:1);
        }
        for(int num:nums2){
            if(num1_set.containsKey(num)){
                ret.add(num);
                if(num1_set.get(num)==1)
                    num1_set.remove(num);
                else
                    num1_set.put(num,num1_set.get(num)-1);
            }
        }
        int[] ret_arr=new int[ret.size()];
        if(ret.size()==0)
            return ret_arr;
        int index=0;
        for(int num:ret)
            ret_arr[index++]=num;
        return ret_arr;
    }

    public static void main(String[] args){
        IntersectionOfTwoArrays iot=new IntersectionOfTwoArrays();
        int[] nums1={3,1,2};
        int[] nums2={1};
        int[] ret=iot.intersection(nums1,nums2);
        for(int i:ret){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

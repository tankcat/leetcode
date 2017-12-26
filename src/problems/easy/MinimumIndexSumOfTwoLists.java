package problems.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by stream on 17-5-31.
 */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        List<String> ret=new LinkedList<>();
        for(int i=0;i<list2.length;i++){
            Integer j=map.get(list2[i]);
            if(j!=null&&j+i<=min){
                if(j+i<min){
                    ret.clear();
                    min=j+i;
                }
                ret.add(list2[i]);
            }
        }
        return ret.toArray(new String[ret.size()]);
    }

    public static void main(String[] args){
        String[] list1={"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2={"KFC", "Shogun", "Burger King"};
        MinimumIndexSumOfTwoLists obj=new MinimumIndexSumOfTwoLists();
        String[] ret=obj.findRestaurant(list1,list2);
        for(String str:ret){
            System.out.print(str+" ");
        }
        System.out.println();
    }
}

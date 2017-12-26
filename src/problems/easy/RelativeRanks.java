package problems.easy;

import java.util.HashMap;

/**
 * Created by stream on 17-4-23.
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

 Example 1:
 Input: [5, 4, 3, 2, 1]
 Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 For the left two athletes, you just need to output their relative ranks according to their scores.
 */
public class RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        String[] ret=new String[nums.length];
        int rank=1;
        for(int i=0;i<nums.length;i++){
            int tmp;
            int index=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[index]<nums[j]){
                    index=j;
                }
            }
            ret[map.get(nums[index])]=(rank++)+"";
            tmp=nums[index];
            nums[index]=nums[i];
            nums[i]=tmp;
        }
        for(int i=0;i<ret.length;i++){
            if(ret[i].equals("1"))
                ret[i]="Gold Medal";
            else if(ret[i].equals("2"))
                ret[i]="Silver Medal";
            else if(ret[i].equals("3"))
                ret[i]="Bronze Medal";
        }
        return ret;
    }

    public static void main(String[] args){
        int[] nums={1,91,6,7,5};
        RelativeRanks obj=new RelativeRanks();
        String[] ret=obj.findRelativeRanks(nums);
        for(String str:ret){
            System.out.print(str+" ");
        }
        System.out.println();
    }
}

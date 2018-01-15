package problems.easy;

public class RangeSumQuery {
    private int[] sums;
    public RangeSumQuery(int[] nums) {
        sums=new int[nums.length+1];
        sums[0]=0;
        for(int i=1;i<=nums.length;i++){
            sums[i]=sums[i-1]+nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }

    public static void main(String[] args){
        int[] nums={-2, 0, 3, -5, 2, -1};
        RangeSumQuery obj=new RangeSumQuery(nums);
        System.out.println(obj.sumRange(2,5));
    }
}

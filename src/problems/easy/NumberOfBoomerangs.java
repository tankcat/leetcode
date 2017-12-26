package problems.easy;

import java.util.HashMap;

/**
 * Created by stream on 17-4-24.
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

 Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

 Example:
 Input:
 [[0,0],[1,0],[2,0]]

 Output:
 2

 Explanation:
 The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int ret=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i==j)
                    continue;
                int d=getInstance(points[i],points[j]);
                if(map.containsKey(d))
                    map.put(d,map.get(d)+1);
                else
                    map.put(d,1);
            }
            for(int num:map.values()){
                ret+=num*(num-1);
            }
            map.clear();
        }
        return ret;
    }

    public int getInstance(int[] point1,int[] point2){
        int x=point1[0]-point2[0];
        int y=point1[1]-point2[1];
        return x*x+y*y;
    }
}

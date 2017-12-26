package problems.easy;

/**
 * Created by stream on 17-3-31.
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid){
        int one_number=0;
        int edge_number=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    one_number++;
                    if(j+1<grid[0].length&&grid[i][j+1]==1){
                        edge_number++;
                    }
                    if(i+1<grid.length&&grid[i+1][j]==1){
                        edge_number++;
                    }
                }
            }
        }
        return one_number*4-edge_number*2;
    }
    public static void main(String[] args){
        IslandPerimeter ip=new IslandPerimeter();
        int[][] grids={{0,1,0,1},
                {0,0,1,0},
                {1,1,0,1},
                {0,0,0,0}};
        System.out.println(ip.islandPerimeter(grids));

    }
}

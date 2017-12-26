package problems.easy;

/**
 * Created by stream on 17-4-13.
 */
public class ConstructTheRectangle {
    public static void main(String[] args){
        ConstructTheRectangle ctr=new ConstructTheRectangle();
        int[] ret=ctr.constructRectangle(21);
        System.out.println(ret[0]+" "+ret[1]);
    }

    public int[] constructRectangle(int area){
        int[] ret=new int[2];
        ret[0]= (int) Math.sqrt(area);
        ret[1]=area/ret[0];
        while(ret[0]*ret[1]!=area){
            ret[0]--;
            ret[1]=area/ret[0];
        }
        int tmp=ret[0];
        ret[0]=ret[1];
        ret[1]=tmp;
        return ret;
    }
}

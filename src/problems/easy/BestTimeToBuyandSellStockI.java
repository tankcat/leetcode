package problems.easy;

public class BestTimeToBuyandSellStockI {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int minValue=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(minValue>prices[i]){
                minValue=prices[i];
            }else{
                if(maxProfit<prices[i]-minValue){
                    maxProfit=prices[i]-minValue;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        BestTimeToBuyandSellStockI obj=new BestTimeToBuyandSellStockI();
        int[] stocks={};
        System.out.println(obj.maxProfit(stocks));
    }

}

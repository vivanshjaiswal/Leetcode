class Solution {
    public int maxProfit(int[] prices) {
        //Greedy Approach
        int minBuy=prices[0];
        int Maxprofit=0;
        for(int i=1;i <prices.length;i++){
            if(prices[i]>minBuy){
                int profit=prices[i]-minBuy;
                Maxprofit=Math.max(profit,Maxprofit);
                
            }
            else{//This is important because everytime it will update the value of the 
        //minBuy Otherwise
                minBuy=Math.min(prices[i],minBuy);
            }

        }
        return Maxprofit;
    }
}
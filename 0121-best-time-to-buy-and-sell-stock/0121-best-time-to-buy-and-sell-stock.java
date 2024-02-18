class Solution {
    public int maxProfit(int[] prices) 
    {
        int buy=0,sell=1,ans=0;
        while(sell<prices.length)
        {
           if(prices[buy]>prices[sell]){
               buy=sell;
               sell=sell+1;
           }
           else if(prices[buy]<=prices[sell])
           {
               ans= Integer.max(ans,(prices[sell]-prices[buy]));
               sell++;
           }
        }
        return ans;
}}
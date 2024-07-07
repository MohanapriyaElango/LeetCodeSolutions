class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=0;
        while(numBottles>=numExchange)
        {
            ans =ans+ (numBottles-(numBottles%numExchange));
            numBottles= (numBottles%numExchange)+(numBottles/numExchange);
            //System.out.println(ans+" "+numBottles);
        }
        return ans+numBottles;
    }
}
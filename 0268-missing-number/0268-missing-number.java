class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2=0;
        int n=nums.length;
        sum1=(n*(n+1))/2;
        for(int i:nums)
            sum2=sum2+i;
        return sum1-sum2;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,curr=0;
        double ans=0;
        for(int right=0;right<k;right++)
            curr=curr+nums[right];
        ans=(double)curr/k;
        for(int right=k;right<nums.length;right++)
        {
            curr=curr-nums[left++]+nums[right];
            ans=Math.max(ans,(double)curr/k);
        }
        return ans;
    }
}
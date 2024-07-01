class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,right=0;
        int curr,max=0;
        while(left<nums.length && right<nums.length)
        {
            if(nums[right]==1)
            {
                right++;
                curr= right-left;
                max= Math.max(max,curr);
            }
            else
            {
                left=right+1;
                right=right+1;
                
            }
        }
        return max;
    }
}
class Solution {
    public int minMoves(int[] nums) {
        int min= nums[0];
        for(int i: nums)
        {
            if(min>i) min=i;
        }
        int ans =0;
        for(int i: nums)
        {
            ans+=Math.abs(i-min);
        }
        return ans;
    }
}
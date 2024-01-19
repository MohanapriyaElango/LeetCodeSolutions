class Solution {
    public int waysToSplitArray(int[] nums) {
        long left=0,right=0;
        int ans=0;
        long[] prefix= new long[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            left=prefix[i];
            right=prefix[nums.length-1]-prefix[i];
            if(left>=right)
            {
                ans++;
            }
        }
        return ans;
    }
}



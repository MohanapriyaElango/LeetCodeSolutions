class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int sum=0,ans=0;
        for(int i:nums)
        {
            sum=sum+i;
            if(sum==0)
                ans++;
        }
        return ans;
    }
}
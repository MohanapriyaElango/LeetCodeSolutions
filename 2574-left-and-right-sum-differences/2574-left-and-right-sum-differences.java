class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        int[] ans= new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++)
        {
        left[i]=left[i-1]+nums[i-1];
        }
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>-1;i--)
        {
        right[i]=right[i+1]+nums[i+1];
        ans[i]=Math.abs(right[i]-left[i]);
        }
        ans[nums.length-1]=Math.abs(right[nums.length-1]-left[nums.length-1]);
        return ans;
    }
}
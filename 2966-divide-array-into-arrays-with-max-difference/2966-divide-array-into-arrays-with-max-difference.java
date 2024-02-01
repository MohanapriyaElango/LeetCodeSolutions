class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len= nums.length,ind=0;
        int[][] ans= new int[len/3][3];
        for(int i=0;i<len/3;i++)
        {
            if((nums[ind+2]-nums[ind])<=k)
            {
                ans[i][0]=nums[ind++];
                ans[i][1]=nums[ind++];
                ans[i][2]=nums[ind++];
            }
            else{
                return new int[0][0];
            }
        }
        return ans;
    }
}
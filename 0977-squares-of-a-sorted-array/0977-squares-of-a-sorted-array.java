class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans= new int[nums.length];
        int k=0;
        for(int i:nums)
            ans[k++]=i*i;
        Arrays.sort(ans);
        return ans;
    }
}
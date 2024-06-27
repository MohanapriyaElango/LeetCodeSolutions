class Solution {
    public int minMoves2(int[] nums) {
        
        //MEDIAN METHOD
        
        int n= nums.length;
        Arrays.sort(nums);
        int median = n%2==0 ? (nums[n/2]+nums[(n/2)-1])/2 : nums[n/2];
        
        int ans = 0;
        for(int i: nums)
        {
            ans+=Math.abs(i-median);
        }
        return ans;
    }
}
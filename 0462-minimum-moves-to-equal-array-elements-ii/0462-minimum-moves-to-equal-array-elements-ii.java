class Solution {
    public int minMoves2(int[] nums) {
        
//         //MEDIAN METHOD
        
//         int n= nums.length;
//         Arrays.sort(nums);
//         int median = n%2==0 ? (nums[n/2]+nums[(n/2)-1])/2 : nums[n/2];
        
//         int ans = 0;
//         for(int i: nums)
//         {
//             ans+=Math.abs(i-median);
//         }
//         return ans;
        
        
        
        //TWO - POINTERS METHOD
        
        int left =0;
        int right = nums.length-1;
        Arrays.sort(nums);
        int ans=0;
        while(left<=right)
        {
            ans+=Math.abs(nums[left]-nums[right]);
            left++;
            right--;
        }
        return ans;
    }
}
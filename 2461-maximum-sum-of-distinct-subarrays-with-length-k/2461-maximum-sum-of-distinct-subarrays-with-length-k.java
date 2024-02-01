class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long cur=0;
        long ans=0;
        Set<Integer> a= new HashSet<Integer>();
        for(int right=0;right<nums.length;right++)
        {
            if(!a.contains(nums[right]))
            {
                // System.out.println(right+" "+nums[right]+" "+"1");
                a.add(nums[right]);
                cur=cur+nums[right];
                if(right-left+1==k)
                {
                   ans= Math.max(ans,cur);
                   cur=cur-nums[left];
                   a.remove(nums[left]);
                   left++;
                }
            }
            else if(a.contains(nums[right]))
            {
                // System.out.println(right+" "+nums[right]+" "+"2");
                while(a.contains(nums[right]))
                {
                    cur=cur-nums[left];
                    a.remove(nums[left]);
                    left++;
                }
                a.add(nums[right]);
                cur=cur+nums[right];
            }
             }
        return ans;
    }
}
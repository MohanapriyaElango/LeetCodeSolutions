class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long cur=0;
        long ans=0;
        Map<Integer,Integer> a= new HashMap<Integer,Integer>();
        for(int right=0;right<nums.length;right++)
        {
            if(!a.containsKey(nums[right]))
            {
                // System.out.println(right+" "+nums[right]+" "+"1");
                a.put(nums[right],1);
                cur=cur+nums[right];
                if(right-left+1==k)
                {
                   ans= Math.max(ans,cur);
                   cur=cur-nums[left];
                   a.remove(nums[left]);
                   left++;
                }
            }
            else if(a.containsKey(nums[right]))
            {
                // System.out.println(right+" "+nums[right]+" "+"2");
                while(a.containsKey(nums[right]))
                {
                    cur=cur-nums[left];
                    a.remove(nums[left]);
                    left++;
                }
                a.put(nums[right],1);
                cur=cur+nums[right];
            }
             }
        return ans;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a= new HashMap<Integer,Integer>();
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int check= target-nums[i];
            if(a.containsKey(check))
            {
                ans[0]=a.get(check);
                ans[1]=i;
                break;
            }
            a.put(nums[i],i);
        }
        return ans;
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=Integer.MIN_VALUE;
        Set<Integer> a= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!a.contains(nums[i]) && nums[i]>0)
            a.add(nums[i]);
            if(max<nums[i])
                max=nums[i];
        }
        int i;
        for(i=1;i<=max;i++)
        {
            if(!a.contains(i))
            {
                return i;
            }
        }
        return i;
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> a= new HashSet<Integer>();
        int count=0;
        for(int i: nums)
        {
            if(!a.contains(i))
            {
                a.add(i);
                nums[count++]=i;
            }
        }
        return a.size();
    }
}
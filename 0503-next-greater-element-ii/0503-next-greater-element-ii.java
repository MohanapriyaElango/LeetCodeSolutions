class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> a= new Stack<Integer>();
        int[] ans= new int[nums.length];
        a.add(0);
        ans[0]=-1;
        for(int i=1;i<nums.length;i++)
        {
            ans[i]=-1;
            while(!a.isEmpty() && nums[a.peek()]<nums[i])
            {
                ans[a.peek()]=nums[i];
                a.pop();
            }
            a.push(i);
        }
        for(int i: a)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[j]>nums[i])
                {
                ans[i]=nums[j];
                break;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public boolean isMonotonic(int[] nums) {
        Stack<Integer> a= new Stack<Integer>();
        a.push(nums[0]);
        if(nums.length==1)
        return true;
        if(nums[0]<=nums[nums.length-1] )
        {
            for(int i=1;i<nums.length;i++){
                // System.out.println(a);
            if(!a.empty() && a.peek()<=nums[i])
            {
                a.pop();
            }
            a.push(nums[i]);
           }
           if(a.size()==1)
           return true;
        }
        else
        {
            for(int i=1;i<nums.length;i++){
            if(!a.empty() && a.peek()>=nums[i])
            {
                a.pop();
            }
            a.push(nums[i]);
           }
           if(a.size()==1)
           return true;
        }
        return false;
    }
}
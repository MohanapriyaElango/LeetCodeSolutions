class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=1;
        int[] a= new int[2];
        while(i<j && i<nums.length && j<nums.length)
        {
            // System.out.println(nums[i]+" "+nums[j]);
            if(nums[i]+nums[j]==target)
            {
                a[0]=i;
                a[1]=j;
                // return a;
                break;
            }
            j++;
            if(j==nums.length)
            {
                i++;
                j=i+1;
            }
        }
        return a;
        // HashMap<Integer,Integer> a= new HashMap<Integer,Integer>();
        // for(int i=0;i<nums.length;j++)
        // {

        // }
    }
}
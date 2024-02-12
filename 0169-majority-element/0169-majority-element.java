class Solution {
    public int majorityElement(int[] nums) {
    //     HashMap<Integer,Integer> a= new HashMap<Integer,Integer>();
    //     int ans=Integer.MIN_VALUE,count=nums.length/2;
    //     for(int i: nums)
    //     {  
    //         a.put(i,a.getOrDefault(i,0)+1);
    //        if(a.get(i)>count)
    //        {
    //            count=a.get(i);
    //            ans=i;
    //     }}
    // return ans;
    
        
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
class Solution {
    public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);
    int i=0,j=1,n=nums.length,count=0;
    Map<Integer,Integer> a= new HashMap<Integer,Integer>();
    while(i<n && j<n ){
        int diff=Math.abs(nums[i]-nums[j]);
        if(diff==k){
            if(!a.containsKey(nums[i]))
            {
             a.put(nums[i],nums[j]);
             count++;
            }
          i++;
          j=i+1;
        }
        else if(k<diff)
        {
            i++;
            j=i+1;
        }
        else if(k>diff)
        {
            j++;
        }
        }
    return count;
    }
}
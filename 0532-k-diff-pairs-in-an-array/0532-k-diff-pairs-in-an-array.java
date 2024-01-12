class Solution {
    public int findPairs(int[] nums, int k) {
    Arrays.sort(nums);
    int i=0,j=1,n=nums.length,count=0;
    Map<Integer,Integer> a= new HashMap<Integer,Integer>();
    while(i<n && j<n ){
        int n1=nums[i],n2=nums[j],diff=Math.abs(n1-n2);
        if(diff==k){
            if(!a.containsKey(n1))
            {
             a.put(n1,n2);
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
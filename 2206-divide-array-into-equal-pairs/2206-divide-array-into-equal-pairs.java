class Solution {
    public boolean divideArray(int[] nums) {
        // int n=nums.length/2,count=0;
        HashMap<Integer,Integer> a= new HashMap<Integer,Integer>();
        for(int i: nums)
        {
            a.put(i,a.getOrDefault(i,0)+1);
        }
        for(int i: a.keySet())
        {
            if(a.get(i)%2!=0)
              return false;
            // count=count+a.get(i)/2;
        }
        return true;
    }
}
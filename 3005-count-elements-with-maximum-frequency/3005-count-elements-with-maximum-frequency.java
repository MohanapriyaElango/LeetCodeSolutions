class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0,count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i : nums)
        {
                map.put(i,map.getOrDefault(i,0)+1);
                max=Math.max(max,map.get(i));
   
        }
        for(int i : map.values())
        {
            if(i==max)
               count+=max;
        }
    return count;
        
    }
}
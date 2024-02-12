class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i: nums)
        {
            if(min>i)
            min=i;
            if(max<i)
            max=i;
        }
        min=min+k;
        if(max-min<=k)
        max=max-(max-min);
        else
        max=max-k;
        return max-min;
    }
}
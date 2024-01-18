class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix= new int[gain.length+1];
        prefix[0]=0;
        int max=prefix[0];
        for(int i=1;i<=gain.length;i++)
        {
            prefix[i]=prefix[i-1]+gain[i-1];
            if(prefix[i]>=max)
                max=prefix[i];
        }
        return max;
    }}
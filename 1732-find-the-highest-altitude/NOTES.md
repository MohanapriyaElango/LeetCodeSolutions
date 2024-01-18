//Prefix sum without array

class Solution {
    public int largestAltitude(int[] gain) {
        // int[] prefix= new int[gain.length+1];
        int prefix=0;
        int max=0;
        for(int i=1;i<=gain.length;i++)
        {
            prefix=prefix+gain[i-1];
            if(prefix>=max)
                max=prefix;
        }
        return max;
    }
}​

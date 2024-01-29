class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i:nums)
        {
            String a= Integer.toString(i);
            if(a.length()%2==0)
                ans++;
        }
        return ans;
    }
}
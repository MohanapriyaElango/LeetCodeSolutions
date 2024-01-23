class Solution {
    public int firstUniqChar(String s) {
        int ans=-1;
        for(char i:s.toCharArray())
        {
            if(s.indexOf(i) == s.lastIndexOf(i))
            {
                ans=s.indexOf(i);
                break;
            }
        }
        return ans;
    }
}
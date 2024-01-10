class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,ans=0;
        Map<Character,Integer> a= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            a.put(ch,a.getOrDefault(ch,0)+1);
            while(a.get(ch)>1)
            {
                a.put(s.charAt(left),a.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }}
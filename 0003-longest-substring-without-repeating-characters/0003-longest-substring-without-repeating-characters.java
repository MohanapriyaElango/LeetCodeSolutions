class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,ans=0;
        Map<Character,Integer> a= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            a.put(ch,a.getOrDefault(ch,0)+1);
            while(a.get(ch)>1)
            {
                char l=s.charAt(left);
                a.put(l,a.getOrDefault(l,0)-1);
                left++;
            }
            System.out.println(s.substring(left,i+1));
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}
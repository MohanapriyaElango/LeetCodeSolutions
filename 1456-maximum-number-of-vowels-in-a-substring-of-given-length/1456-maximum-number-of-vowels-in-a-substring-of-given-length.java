class Solution {
    public int maxVowels(String s, int k) {
        int left=0,curr=0,ans=0;
        for(int right=0;right<k;right++)
        {
            if("aeiou".contains(""+s.charAt(right)))
            {
                curr++;
            }
        }
        ans=curr;
        if(ans==k)
        return ans;
        for(int right=k;right<s.length();right++)
        {
            if("aeiou".contains(""+s.charAt(left)))
            {
                curr--;
            }
            left++;
            if("aeiou".contains(""+s.charAt(right)))
            {
                curr++;
            }
            if(curr>ans)
            ans=curr;
        }
        return ans;
    }
}
class Solution {
    public boolean ispalindrom(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
        return true;
    }
    public String firstPalindrome(String[] words) {
        String ans="";
        for(String s: words)
        {
            if(ispalindrom(s))
            {
                return s;
            }
        }
        return ans;
    }
}
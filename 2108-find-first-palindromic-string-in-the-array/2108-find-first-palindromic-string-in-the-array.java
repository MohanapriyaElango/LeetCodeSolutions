class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        for(String s: words)
        {
            int i=0,j=s.length()-1,flag=0;
            while(i<j)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    i++;
                    j--;
                }
                else{
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                return s;
            }
        }
        return ans;
    }
}
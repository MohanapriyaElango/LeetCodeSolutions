class Solution {
    public String reverseVowels(String s) {
        StringBuilder ans= new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j)
        {
            char a= s.charAt(i);
            char b= s.charAt(j);
            if("aeiouAEIOU".indexOf(""+a)>=0 && "aeiouAEIOU".indexOf(""+b)>=0)
            {
                ans.setCharAt(i,b);
                ans.setCharAt(j,a);
                i++;
                j--;
            }
            else{
                if("aeiouAEIOU".indexOf(""+a)<0)
                    i++;
                if("aeiouAEIOU".indexOf(""+b)<0)
                    j--;
            }
        }
        return ans.toString();
    }
}
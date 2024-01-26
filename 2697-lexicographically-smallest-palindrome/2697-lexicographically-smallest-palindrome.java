class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder a= new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j)
        {
                if((int)a.charAt(i)>(int)(a.charAt(j)))
                {
                    a.setCharAt(i,a.charAt(j));
                }
                else if((int)a.charAt(i)<(int)(a.charAt(j)))
                {
                    a.setCharAt(j,a.charAt(i));
                }
                i++;
                j--;
        }
        return a.toString();
    }
}
class Solution {
    public boolean isPalindrome(String str) {
        int i=0,j=str.length()-1;
        String s= str.toLowerCase();
        while(i<=j)
        {
            while(i<s.length() && !((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='0' && s.charAt(i)<='9')))
            {
                i++;
            }
            while(j>=0 && !((s.charAt(j)>='a' && s.charAt(j)<='z')||(s.charAt(j)>='0' && s.charAt(j)<='9')))
            {
                j--;
            }
            if(j==-1 || i==s.length())
            break;
            // System.out.println(i+" "+j+" "+s.charAt(i)+" "+s.charAt(j));
            if(i<s.length() && j>=0 && s.charAt(i)==s.charAt(j))
            {
                // System.out.println("hello3");
                i++;
                j--;
            }
            else
            {
                // System.out.println("hello4");
                return false;
            }
        }
        return true;
    }
}
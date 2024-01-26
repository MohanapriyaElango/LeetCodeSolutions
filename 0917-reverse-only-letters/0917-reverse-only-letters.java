class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        StringBuilder a= new StringBuilder(s);
        while(i<j)
        {
            char p=a.charAt(i);
            char q=a.charAt(j);
            if(((p>='a' && p<='z')|| (p>='A' && p<='Z')) && ((q>='a' && q<='z')|| (q>='A' && q<='Z')))
            {
                a.setCharAt(i,q);
                a.setCharAt(j,p);
                i++;
                j--;
            }
            else{
                if(!((p>='a' && p<='z')|| (p>='A' && p<='Z')))
                i++;
                if(!((q>='a' && q<='z')|| (q>='A' && q<='Z')))
                j--;
            }
        }
        return a.toString();
    }
}
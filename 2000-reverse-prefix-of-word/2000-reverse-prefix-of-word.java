class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        StringBuilder a= new StringBuilder(word);
        int i=0,j=index;
        while(i<j)
        {
            char temp= a.charAt(i);
            a.setCharAt(i,a.charAt(j));
            a.setCharAt(j,temp);
            i++;
            j--;
        }
        String ans= a.toString();
        return ans;
    }
}
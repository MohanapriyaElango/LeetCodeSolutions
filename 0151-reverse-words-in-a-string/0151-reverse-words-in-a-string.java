class Solution {
    public String reverseWords(String s) {
        String[] sa= s.trim().split("\\s+");
        StringBuilder ans= new StringBuilder();
        for(int i=sa.length-1;i>0;i--)
        {
            ans.append(sa[i].trim()+" ");    
        }
        ans.append(sa[0]);
        String ans1= new String(ans);
        return ans1;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans= new StringBuilder();
        Arrays.sort(strs);
        String a= strs[0];
        String b= strs[strs.length-1];
        int len=a.length()<b.length()?a.length():b.length();
        int left=0,max=0,maxleft=-1,maxright=-1;
        for(int right=0;right<len;right++)
        {
            if(a.charAt(right)==b.charAt(right))
            {
                if(max<right-left+1)
                {
                    max=right-left+1;
                    maxleft=left;
                    maxright=right;
                }
            }
            else{
                    break;
                }
        }
        if(maxleft==-1 && maxright==-1)
        return "";
        return a.substring(maxleft,maxright+1);
    }
}
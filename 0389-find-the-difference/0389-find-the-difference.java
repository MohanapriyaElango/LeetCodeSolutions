class Solution {
    public char findTheDifference(String s, String t) {
        // int i=0,j=0;
        int[] a= new int[26];
        int[] b= new int[26];
        char ans='a';
        for(char i: s.toCharArray())
        a[i-'a']=a[i-'a']+1;

        for(char i: t.toCharArray())
        b[i-'a']=b[i-'a']+1;

        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            ans=(char)(i+97);
        }
        return ans;
    
    }
}
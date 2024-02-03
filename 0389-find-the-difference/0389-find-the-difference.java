class Solution {
    public char findTheDifference(String s, String t) {
        int[] a= new int[26];
        int[] b= new int[26];
        char ans='a';
        for(char i: s.toCharArray())
        a[i-'a']++;

        for(char i: t.toCharArray())
        b[i-'a']++;

        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i])
            ans=(char)(i+97);
        }
        return ans;
    
    }
}
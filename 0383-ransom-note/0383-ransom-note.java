class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len=(ransomNote.length()>magazine.length())?ransomNote.length():magazine.length();
        char[] r=new char[26];
        char[] m=new char[26];
        for(int i=0;i<len;i++)
        {
            if(i<ransomNote.length())
            {
                r[(ransomNote.charAt(i))-'a']++;
            }
            if(i<magazine.length())
            {
                m[(magazine.charAt(i))-'a']++;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(r[i]>0)
            {
                if(r[i]<=m[i])
                {
                    continue;
                }
                else
                    return false;
            }
        }
        return true;
    }
}
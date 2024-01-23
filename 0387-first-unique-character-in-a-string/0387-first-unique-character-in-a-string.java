class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character,Integer> a= new HashMap<Character,Integer>();
        // char b='$';
        // int ans=-1;
        // for(char i: s.toCharArray())
        // {
        //     a.put(i,a.getOrDefault(i,0)+1);
        // }
        // for(char i: s.toCharArray())
        // {
        //     if(a.get(i)==1)
        //     {
        //         b=i;
        //         break;
        //     }
        // }
        // if(b=='$')
        // {
        //     return -1;
        // }
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)==b)
        //     {
        //         ans=i;
        //         break;
        //     }
        // }
        // return ans;
        char a='$';
        int ans=0;
        for(char i:s.toCharArray())
        {
            if(s.indexOf(i) == s.lastIndexOf(i))
            {
                a=i;
                break;
            }
        }
        if(a=='$')
        {
            return -1;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==a)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}
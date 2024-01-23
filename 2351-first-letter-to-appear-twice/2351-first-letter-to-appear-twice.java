class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> a= new HashMap<Character,Integer>();
        char ans='a';
        for(char i: s.toCharArray())
        {
            a.put(i,a.getOrDefault(i,0)+1);
            if(a.get(i)==2)
            {
              ans= i;
              break;}
        }
        return ans;
    
    }}
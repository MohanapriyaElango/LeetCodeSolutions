class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Map<Character,Integer> a= new HashMap<Character,Integer>();
        for(char i: jewels.toCharArray())
        {
            a.put(i,0);
        }
        for(char i: stones.toCharArray())
        {
            if(a.containsKey(i))
            {
                count++;
            }
        }
        return count;}
}
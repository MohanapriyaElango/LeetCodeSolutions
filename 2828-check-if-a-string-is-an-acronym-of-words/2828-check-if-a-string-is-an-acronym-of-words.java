class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int count=0;
        if(words.size()!=s.length())
            return false;
        for(String i: words)
        {
            if(i.charAt(0)!=s.charAt(count++))
            {
                return false;
            }
        }
        return true;
    }
}
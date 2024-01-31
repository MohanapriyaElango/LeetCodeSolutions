class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans= new ArrayList<List<String>>();
        Map<String,List<String>> a= new HashMap<String,List<String>>();
        for(String i: strs)
        {
            char[] k= i.toCharArray();
            Arrays.sort(k);
            if(a.containsKey(new String(k)))
            {
                a.get(new String(k)).add(i);
            }
            else
            {
                List<String> p= new ArrayList<String>();
                p.add(i);
                a.put(new String(k),p);
            }
        }
        for(String i: a.keySet())
        {
            ans.add(a.get(i));
        }
        return ans;
    
    }
}
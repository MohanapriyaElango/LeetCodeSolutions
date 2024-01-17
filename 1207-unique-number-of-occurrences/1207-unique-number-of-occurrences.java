class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> a= new HashMap<Integer,Integer>();
        Set<Integer> b= new HashSet<Integer>();
        for(int i: arr)
        {
                a.put(i,a.getOrDefault(i,0)+1);
        }
        for(int i: a.values())
        {
            b.add(i);
        }
        if(a.size()==b.size())  return true;
        return false; 
        
    }
}
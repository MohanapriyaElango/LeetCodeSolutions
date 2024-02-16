class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);
        PriorityQueue<Integer>heap=new PriorityQueue<>(map.values());
        int count=heap.size();
        while(!heap.isEmpty() && k>0)
        {
            int cur=heap.poll();
            k-=cur;
            if(k>=0){
            count--;
            }
        }
        return count;
    }
}
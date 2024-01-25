class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max= new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int i: stones)
            max.add(i);
        while(max.size()>1)
        {
            int a= max.remove();
            int b= max.remove();
            if(a>b)
            {
                max.add(a-b);
            }
        }
        if(max.isEmpty())
            return 0;
        return max.remove();
    }
}
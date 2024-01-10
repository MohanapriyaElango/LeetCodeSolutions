class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> max= new PriorityQueue<Integer>(Comparator.reverseOrder());
        PriorityQueue<Integer> min= new PriorityQueue<Integer>();
        for(int i:nums1)
        {
            max.add(i);
            min.add(max.remove());
            if(min.size()>max.size())
            {
                max.add(min.remove());
            }
        }
        for(int i:nums2)
        {
            max.add(i);
            min.add(max.remove());
            if(min.size()>max.size())
            {
                max.add(min.remove());
            }
        }
        System.out.println(max);
        System.out.println(min);
        if(min.size()==max.size())
            return ((double)(min.peek()+max.peek())/2);
        return (double)max.remove();
    }
}
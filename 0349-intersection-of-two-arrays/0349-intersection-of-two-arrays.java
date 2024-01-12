class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a= new HashSet<>();
        List<Integer> li= new ArrayList<>();
        for(int i: nums2)
            li.add(i);
        for(int i: nums1)
        {
            if(li.contains(i))
            {
                a.add(i);
            }
        }
        int[]ans= new int[a.size()];
        int k=0;
        for(int i: a)
            ans[k++]=i;
        return ans;
    }
}
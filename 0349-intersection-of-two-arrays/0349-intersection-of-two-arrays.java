class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a= new HashSet<Integer>();
        int i=0,j=0;
        while(i<nums1.length)
        {
            if(nums1[i]==nums2[j])
            {
                a.add(nums1[i]);
                i++;
                j=0;
            }
            else{
                if(j==nums2.length-1)
                {
                    i++;
                    j=0;
                }
                else{
                    j++;
                }
            }
        }
        int[] ans= new int[a.size()];
        int count=0;
        for(int k: a)
        {
            ans[count++]=k;
        }
        return ans;
    }
}
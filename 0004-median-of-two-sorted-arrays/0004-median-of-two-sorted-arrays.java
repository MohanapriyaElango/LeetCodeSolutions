class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        ArrayList<Integer> a= new ArrayList<Integer>();
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                a.add(nums1[i]);
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                a.add(nums2[j]);
                j++;
            }
            else if(nums1[i]==nums2[j])
            {
                a.add(nums1[i]);
                a.add(nums2[j]);
                i++;
                j++;
            }
        }
        while(i<nums1.length)
        {
            a.add(nums1[i]);
            i++;
        }
        while(j<nums2.length)
        {
            a.add(nums2[j]);
            j++;
        }
        int mid=(a.size()/2);
        if(a.size()%2==0)
        {
            return ((double)(a.get(mid)+a.get(mid-1))/2);
        }
        return a.get(mid);
    }
}
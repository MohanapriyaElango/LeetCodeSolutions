class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,ind=0;
        int[] a= new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                a[ind++]=nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                a[ind++]=nums2[j];
                j++;
            }
            else if(nums1[i]==nums2[j])
            {
                a[ind++]=nums1[i];
                a[ind++]=nums2[j];
                i++;
                j++;
            }
        }
        while(i<nums1.length)
        {
            a[ind++]=nums1[i];
            i++;
        }
        while(j<nums2.length)
        {
            a[ind++]=nums2[j];
            j++;
        }
        int mid=(a.length/2);
        if(a.length%2==0)
        {
            return ((double)(a[mid]+a[mid-1])/2);
        }
        return a[mid];
    }}
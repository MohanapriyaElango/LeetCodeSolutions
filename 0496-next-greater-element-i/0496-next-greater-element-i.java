class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> a= new Stack<Integer>();
        Map<Integer,Integer> b= new HashMap<Integer,Integer>();
        a.add(0);
        for(int i=1;i<nums2.length;i++)
        {
            while(!a.isEmpty() && nums2[a.peek()]<nums2[i])
            {
                b.put(nums2[a.peek()],nums2[i]);
                a.pop();
            }
            a.push(i);
        }
        int[] ans= new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            if(b.containsKey(nums1[i]))
            {
                ans[i]=b.get(nums1[i]);
            }
            else
            ans[i]=-1;
        }
        return ans;
    }
}
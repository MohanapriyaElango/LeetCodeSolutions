class Solution {
    public int[] sortedSquares(int[] nums) {
        // PriorityQueue<Integer> a= new PriorityQueue<>();
        // for(int i: nums)
        //     a.add(i*i);
        // int[] ans= new int[nums.length];
        // for(int i=0;i<nums.length;i++)
        //     ans[i]=a.remove();
        // return ans;
        int[] ans= new int[nums.length];
        int k=0;
        for(int i:nums)
            ans[k++]=i*i;
        Arrays.sort(ans);
        return ans;
    }
}
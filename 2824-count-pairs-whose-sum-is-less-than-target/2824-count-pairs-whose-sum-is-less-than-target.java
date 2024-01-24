class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int l=0,ans=0,r=nums.size()-1;
        Collections.sort(nums);
        while(l<r){
            if((nums.get(l)+nums.get(r))<target){
                ans=ans+r-l;
                l++;
            }
            else {
                r--;
            }
        }
        return ans;
    }
}
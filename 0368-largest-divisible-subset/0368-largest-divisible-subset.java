class Solution {
    List<Integer> ans=new ArrayList<>();
    int[] memo;
    public List<Integer> largestDivisibleSubset(int[] nums) {
        memo=new int[nums.length];
        Arrays.fill(memo,-1);
        Arrays.sort(nums);
        List<Integer> temp=new ArrayList<>();
        largestDivisibleSubset(nums,0,1,temp);
        return ans;
    }
    public void largestDivisibleSubset(int[] nums, int si , int prev ,List<Integer> temp) {
        if(si>=nums.length){
            if(temp.size()>ans.size()){
                ans.clear();
                ans.addAll(temp);
            }
            return;
        }
        if(temp.size()>memo[si] && nums[si]%prev==0 || prev%nums[si]==0){
             memo[si] = temp.size();
             temp.add(nums[si]);
             largestDivisibleSubset(nums,si+1,nums[si],temp);
             temp.remove(temp.size()-1);
        }
        largestDivisibleSubset(nums,si+1,prev,temp);
        return;
    }
}


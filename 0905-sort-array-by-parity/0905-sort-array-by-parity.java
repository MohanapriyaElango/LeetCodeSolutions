class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=0;
        if(nums.length<2)
        return nums;
        while(i<=j && i<nums.length && j<nums.length) {
            if(nums[i]%2==1)
            {
                while(j<nums.length && nums[j]%2==1)
                    j++;
                if(j<nums.length){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j=j+1;
                
                }
            }
            else{
                i++;
                j++;
            }
        }
        return nums;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        // int i=0,j=1;
        // while(i<nums.length-1)
        // {
        //     if(nums[i]>nums[j])
        //     {
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //     }
        //     if(j==nums.length-1)
        //     {
        //         i++;
        //         j=i+1;
        //     }
        //     else
        //     j++;}

        //THREE POINTERS AND ONE PASS- ALGO
        int left=0,right=nums.length-1,i=0;
        while(i<nums.length && i<=right)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
                i++;
            }
            else if(nums[i]==2)
            {
                int temp=nums[i];
                nums[i]=nums[right];
                nums[right]=temp;
                right--;
            }
            else
            i++;
        }
    }
}
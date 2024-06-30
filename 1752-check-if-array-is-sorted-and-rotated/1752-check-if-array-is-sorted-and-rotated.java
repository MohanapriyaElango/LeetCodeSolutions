class Solution {
    public boolean check(int[] nums) {
        // int min = nums[0];
        // int minPosition = 0;
        // for(int i=1;i<nums.length;i++)
        // {
        //     if(nums[i-1]>nums[i])
        //     {
        //         minPosition = i;
        //         break;
        //     }  
        // }
        // int i= 0;
        // int j= minPosition-1;
        // while(i<j)
        // {
        //     nums[i] = nums[i]^nums[j];
        //     nums[j] = nums[i]^nums[j];
        //     nums[i] = nums[i]^nums[j];
        //     i++;
        //     j--;
        // }
        // i= minPosition;
        // j= nums.length-1;
        // while(i<j)
        // {
        //     nums[i] = nums[i]^nums[j];
        //     nums[j] = nums[i]^nums[j];
        //     nums[i] = nums[i]^nums[j];
        //     i++;
        //     j--;
        // }
        // i=0;
        // j=nums.length-1;
        // while(i<j)
        // {
        //     nums[i] = nums[i]^nums[j];
        //     nums[j] = nums[i]^nums[j];
        //     nums[i] = nums[i]^nums[j];
        //     i++;
        //     j--;
        // }
        // boolean sorted = true;
        // for(i=1;i<nums.length;i++)
        // {
        //     if(!(nums[i-1]<=nums[i]))
        //     {
        //         sorted=false;
        //         break;
        //     }
        // }
        // return sorted;
        
        
        
        //second approach
        
        int decreaseCount =0;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                decreaseCount++;
            }
        }
        if(nums[0]<nums[nums.length-1])
                  decreaseCount++;
        if(decreaseCount<=1) return true;
        return false;
        
        
        }
}
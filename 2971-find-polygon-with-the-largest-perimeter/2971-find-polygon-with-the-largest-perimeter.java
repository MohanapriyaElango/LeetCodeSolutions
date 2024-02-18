// class Solution {
//     public long largestPerimeter(int[] nums) {
//         Arrays.sort(nums);
//         int[] prefix= new int[nums.length];
//         int ans=-1;
//         prefix[0]=nums[0];
//         for(int i=1;i<nums.length;i++)
//         prefix[i]=prefix[i-1]+nums[i];
//         int i,count=0,p=0;
//         for(i=0;i<nums.length-1;i++)
//         {
//             if(prefix[i]>=nums[i+1])
//             {
//                 count=i+1;
//                 p++;
//                 ans=prefix[i];
//             }
//         }
//         if(count==nums.length-1 && prefix[nums.length-2]>nums[nums.length-1])
//         return prefix[nums.length-1];   
//         else if(p<3)
//         return -1;
//         return ans;
//     }
// }



class Solution {
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}

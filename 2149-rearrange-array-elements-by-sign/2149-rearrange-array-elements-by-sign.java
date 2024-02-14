class Solution {
    public int[] rearrangeArray(int[] nums) {
        int a=0,b=1;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arr[b] = nums[i];
                b+=2;
            }
            else{
                arr[a] = nums[i];
                a+=2;
            }            
        }
        return arr;
    }
}
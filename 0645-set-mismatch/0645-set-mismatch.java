class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i:nums){
            arr[i]++;
        }
        int original=0;
        int duplicate=0;
        for(int i=1;i<=n;i++){
            if(arr[i]==2)
            {
                duplicate=i;
            }
            if(arr[i]==0){
                original=i;
            }
        }
        return new int[]{duplicate,original};


    }
}
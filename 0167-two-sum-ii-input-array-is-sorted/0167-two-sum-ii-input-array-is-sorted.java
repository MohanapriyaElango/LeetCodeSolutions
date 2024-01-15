class Solution {
    public int[] twoSum(int[] a, int target) {
        int result[]=new int[2];
        int i=0,j=a.length-1,n=a.length;
        while(i<j){
            int sum=a[i]+a[j];
            if(sum==target){
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            else if(sum>target)
            j--;
            else if(sum<target)
            i++;
        }
        return result;
    }
}
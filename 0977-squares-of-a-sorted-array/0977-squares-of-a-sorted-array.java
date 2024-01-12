class Solution {
    public int[] sortedSquares(int[] a) {
        int[] ans= new int[a.length];
        int i=0,j=a.length-1,k=a.length-1;
        while(i<=j)
        {
            if((a[i]*a[i])>(a[j]*a[j]))
            {
                ans[k--]=a[i]*a[i];
                i++;
            }
            else if((a[i]*a[i])<(a[j]*a[j]))
            {
                ans[k--]=a[j]*a[j];
                j--;
            }
            else if((a[i]*a[i])==(a[j]*a[j]))
            {
                ans[k--]=a[i]*a[i];
                i++;
            }
        }
        return ans;
    }
}
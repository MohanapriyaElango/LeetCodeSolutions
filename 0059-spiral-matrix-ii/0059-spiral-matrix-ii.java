class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int num=1;
        for(int i=0;i<n/2;i++)
        {
            int r=i;
            int c=i;
            while(c<n-i-1)
            {
                ans[r][c]=num++;
                c++;
            }
            while(r<n-i-1)
            {
                ans[r][c]=num++;
                r++;
            }
            
            while(c>i)
            {
                ans[r][c]=num++;
                c--;
            }
            while(r>i)
            {
                ans[r][c]=num++;
                r--;
            }
        }
        
        if(n%2==1)
        ans[n/2][n/2]=num++;

        return ans;
    }
}
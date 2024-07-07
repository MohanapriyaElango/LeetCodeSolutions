class Solution {
    public int[] countBits(int n) {
        int ans[] =new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int count=0;
            int k=i;
            // System.out.println("helo");
            while(k>0)
            {
                // System.out.println(count);
                ++count;
                k=k & (k-1);
            }
            ans[i]=count;
        }
        return ans;
    }
}
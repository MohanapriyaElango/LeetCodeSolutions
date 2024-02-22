class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==trust.length)
          return -1;
        int[] c1=new int[n+1];
        int[] c2=new int[n+1];
            for(int[] i: trust)
            {
                 c1[i[0]]++;
                 c2[i[1]]++;
            }
            for(int i=1;i<=n;i++)
            {
                if(c1[i]==0 && c2[i]==n-1)
                {
                    return i;
                }
            }
        return -1;
    }
}
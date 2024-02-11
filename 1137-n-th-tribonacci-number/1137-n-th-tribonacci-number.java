class Solution {
    public int ntri(int n,int a,int b,int c)
    {
        if(n==3)
        return a+b+c;
        return ntri(n-1,b,c,a+b+c);
    }
    public int tribonacci(int n) {
        int a=0,b=1,c=1;
        if(n==0)
        return 0;
        if(n==1 || n==2)
        return 1;
        int ans=ntri(n,a,b,c);
        return ans;
    }
}
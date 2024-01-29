class Solution {
    public int[] evenOddBit(int n) {
        //String a="";
        // this is will used to convert decimal to binary
        // while(n>=1)
        // {
        //     int k=n%2;
        //     a=k+a;
        //     n=n/2;
        // }
        // System.out.println(a);
        String a=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        for(int i=0;i<a.length();i++)
        {
            if(i%2==0 && a.charAt(a.length()-1-i)=='1')
            even++;
            else if(a.charAt(a.length()-1-i)=='1')
            odd++;
        }
        int []ans= new int[2];
        ans[0]=even;
        ans[1]=odd;
        return ans;
   }}
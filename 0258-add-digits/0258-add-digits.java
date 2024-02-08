class Solution {
    public int sum(int num)
    {
        if(num==0)
            return 0;
        return (num%10)+sum(num/10);
    }
    public int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            // sum=0;
            // while(num>0)
            // {
            //  int r=num%10;
            //  sum=sum+r;
            //  num=num/10;
            // }
            // num=sum;
            num=sum(num);
        }
        return num;
    }
}
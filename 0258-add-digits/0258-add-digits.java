class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10)
        {
            sum=0;
            while(num>0)
            {
             int r=num%10;
             sum=sum+r;
             num=num/10;
            }
            num=sum;
        }
        return num;
    }
}
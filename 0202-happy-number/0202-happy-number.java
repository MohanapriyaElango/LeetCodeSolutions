class Solution {
    public int square(int n)
    {
        int s=0;
        while(n!=0)
        {
            int r=n%10;
            s=s+(r*r);
            n=n/10;
        }
        return s;
    }
    public boolean isHappy(int n) {
        int fast,slow;
        fast=slow=n;
        do{
            slow=square(slow);
            fast=square(fast);
            fast=square(fast);
        }while(slow!=fast);
        if(slow==1)
            return true;
        return false;
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int n=x,ans=0;
        while(n!=0)
        {
            int rem= n%10;
            ans=(ans*10)+rem;
            n=n/10;
        }
        if(x==ans)
            return true;
        return false;
    }
}
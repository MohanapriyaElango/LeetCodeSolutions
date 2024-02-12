class Solution {
    public boolean isPowerOfFour(int n) {
        // System.out.println((float)(Math.log10(n)/Math.log10(4)));
        // return (Math.log10(n)/Math.log10(4))%1==0;
        
        if(n==0) return false;
        if(n==1) return true;
        if(n%4!=0) return false;
        return isPowerOfFour(n/4);

    }
}
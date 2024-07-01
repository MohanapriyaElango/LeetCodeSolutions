class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int k = 0;
        for(int i: arr)
        {
            if((i & 1) == 1)
            {
                k++;
            }
            else k=0;
            if(k==3)
            return true;
        }
        return false;
    }
}
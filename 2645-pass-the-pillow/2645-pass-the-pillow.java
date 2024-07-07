class Solution {
    public int passThePillow(int n, int time) {
        int ans=0;
        if((time/(n-1))%2==1)
        {
            //System.out.println("helo");
            ans = n-(time%(n-1));
        }
        else{
            //System.out.println("h");
            ans = (time%(n-1))+1;
        }
        return ans;
    }
}
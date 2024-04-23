class Solution {
    public boolean lemonadeChange(int[] bills) {
        // int change=0;
        int[] change=new int[3];
        for(int i: bills)
        {
            if(i==5)
            change[0]+=1;
            else if(i==10)
            {
                if(change[0]>0){
                    change[1]++;
                    change[0]--;
                }
                else
                return false;
            }
            else if(i==20)
            {
                if((change[0]>0 && change[1]>0))
                {
                    change[0]--;
                    change[1]--;
                    change[2]++;
                }
                else if(change[0]>=3)
                {
                change[0]=change[0]-3;
                change[2]++;
                }
                else
                return false;
            }
            // System.out.println(change[0]+" "+change[1]);
        }
        return true;
    }
}
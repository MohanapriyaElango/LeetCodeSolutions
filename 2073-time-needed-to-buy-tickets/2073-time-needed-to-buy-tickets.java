class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0,flag=0;
        while(tickets[k]!=0)
        { 
            for(int i=0;i<tickets.length;i++)
            {
                
                if(tickets[i]!=0)
                {
                    time++;
                    tickets[i]--;
                }
                if(tickets[k]==0)
                {
                    flag=1;
                    break;
                }
                System.out.print(tickets[i]+" ");
            }
            if(flag==1)
                break;
            System.out.println();
        }
        return time;
    }
}
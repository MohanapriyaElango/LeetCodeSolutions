class Solution {
    public int minValue(int n,List<Integer> s,HashMap<Integer,Integer> memo)
    {
        if(n==0)
        return 0;
        if(n<0)
        return -1;
        if(memo.containsKey(n))
        return memo.get(n);
        int min=-1;
        for(int i: s)
        {
            int subn= n-i;
            int subi=minValue(subn,s,memo);
            if(subi!=-1)
            {
                int num= subi+1;
                if(num<min || min==-1)
                min=num;
            }
        }
        memo.put(n,min);
        return min;
    }
    public int numSquares(int n) {
        // int[] s= new int[n+1];
        ArrayList<Integer> s= new ArrayList<Integer>();
        int i=1,j=0;
        while((i*i)<=n)
        {
            s.add(i*i);
            if((i*i)==n)
              return 1;
            i++;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans= minValue(n,s,map);
        return ans;
    }
}
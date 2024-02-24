class Solution {
    public List<Integer> findAllPeople(int n, int[][] meet, int fp) {
        ArrayList<ArrayList<int[]>> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<meet.length;i++)
        {
            list.get(meet[i][0]).add(new int[]{meet[i][1],meet[i][2]});
            list.get(meet[i][1]).add(new int[]{meet[i][0],meet[i][2]});
        }
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{fp,0});
        q.add(new int[]{0,0});
        int vis[]=new int[n];
        Arrays.fill(vis,Integer.MAX_VALUE);
        vis[fp]=0;
        vis[0]=0;
        while(!q.isEmpty())
        {
            int x[]=q.poll();
            int u=x[0];
            int t=x[1];
            for(int a[]:list.get(u))
            {
                int v=a[0];
                int tt=a[1];
                if(tt-t>=0 && vis[v]>tt)
                {
                    vis[v]=tt;
                    q.add(new int[]{v,tt});
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(vis[i]!=Integer.MAX_VALUE)
                ans.add(i);
        }
        return ans;
    }
}
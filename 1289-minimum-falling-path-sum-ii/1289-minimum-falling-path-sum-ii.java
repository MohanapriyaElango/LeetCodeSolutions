class Solution {
    public int minimum(int[] row,int ele)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<row.length;i++)
        {
            if(min>row[i] && i!=ele)
            {
                min=row[i];
            }
        }
        return min;
    }
    public int minFallingPathSum(int[][] grid) {
        int row= grid.length;
        int col= grid[0].length;
        for(int i=1;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int value=minimum(grid[i-1],j);
                grid[i][j]=grid[i][j]+value;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i: grid[grid.length-1])
        {
            if(min>i)
            min=i;
        }
        return min;
    }
}
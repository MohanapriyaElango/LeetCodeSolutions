class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;
        for(int i=1;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=matrix[i][j]+Math.min(matrix[i-1][Math.max(j-1,0)],Math.min(matrix[i-1][j],matrix[i-1][Math.min(j+1,col-1)]));
            }
        }
        int min= Integer.MAX_VALUE;
        for(int i:matrix[matrix.length-1])
        {
            if(min>i)
            {
                min=i;
            }
        }
        return min;
    }
}
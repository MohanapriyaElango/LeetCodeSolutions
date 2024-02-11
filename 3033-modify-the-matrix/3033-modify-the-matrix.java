class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        ArrayList<Integer> row= new ArrayList<Integer>();
        ArrayList<Integer> col= new ArrayList<Integer>();
        int[] max= new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==-1)
                {
                    row.add(i);
                    col.add(j);
                }
                if(max[j]<=matrix[i][j])
                    max[j]=matrix[i][j];
            }
        }
        for(int i=0;i<row.size();i++)
        {
            matrix[row.get(i)][col.get(i)]=max[col.get(i)];
        }
        return matrix;
    }
}
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row= mat.length;
        int col= mat[0].length;

        for(int c=0;c<col;c++)
        {
            sortDiagonal(0,c,mat,row,col);
        }
        for(int r=0;r<row;r++)
        {
            sortDiagonal(r,0,mat,row,col);
        }
        return mat;
    }
    public static void sortDiagonal(int r,int c,int[][] mat,int row,int col)
    {
        int[] countsort = new int[101];
        int r1=r;
        int c1=c;
        while(r1<row && c1<col)
        {
            countsort[mat[r1][c1]]++;
            r1++;
            c1++;
        }
        r1=r;
        c1=c;
        for(int i=0;i<countsort.length;i++)
        {
            if(countsort[i]>0)
            {
                while(countsort[i]>0)
                {
                    mat[r1][c1]=i;
                    countsort[i]--;
                    r1++;
                    c1++;
                }
            }
        }
    }
}
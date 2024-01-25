class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> ans = new ArrayList<>(Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(1, 1)
        ));
        if(numRows==1)
        {
        //     // List<List<Integer>> ans1 = new ArrayList<>(Arrays.asList(
        //     //     Arrays.asList(1)  )); 
        // return ([[1]]).asList();
            ans.remove(1);
        }
        for(int i=2;i<numRows;i++)
        {
            List<Integer> a= new ArrayList<Integer>();
            a.add(1);
            List<Integer> b=ans.get(i-1);
            for(int j=0;j<b.size()-1;j++)
            {
                a.add(b.get(j)+b.get(j+1));
            }
            a.add(1);
            ans.add(a);
        }
        return ans;
    }
}
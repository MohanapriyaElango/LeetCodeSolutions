class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        String num="123456789123456789";
        String one="1111111111111";
        int start= Integer.parseInt(num.substring(0,(Integer.toString(low)).length()));
        int ones= Integer.parseInt(one.substring(0,(Integer.toString(low)).length()));
        while(start<=high)
        {
            System.out.println(start);
            if(start>=low)
            ans.add(start);
            start=start+ones;
            // System.out.println(start);
            if(!ans.isEmpty() && start%10==0)
            {
                start=Integer.parseInt(num.substring(0,(Integer.toString((ans.get(ans.size()-1)))).length()+1));
                ones= Integer.parseInt(one.substring(0,(Integer.toString(ones)).length()+1));
            }
            if(ans.isEmpty() && start%10==0)
            {
                start=Integer.parseInt(num.substring(0,(Integer.toString(start)).length()+1));
                ones= Integer.parseInt(one.substring(0,(Integer.toString(ones)).length()+1));
            }
        }
        return ans;
    }
}
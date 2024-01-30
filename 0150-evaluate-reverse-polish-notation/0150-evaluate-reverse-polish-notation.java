class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> a= new Stack<Integer>();
        for(String i: tokens)
        {
            if(i.equals("+"))
            {
                int s= a.pop();
                int t= a.pop();
                a.add(s+t);
            }
            else if(i.equals("-"))
            {
                int s= a.pop();
                int t= a.pop();
                a.add(t-s);
            }
            else if(i.equals("*"))
            {
                int s= a.pop();
                int t= a.pop();
                a.add(t*s);
            }
            else if(i.equals("/"))
            {
                int s= a.pop();
                int t= a.pop();
                a.add(t/s);
            }
            else
                a.add(Integer.parseInt(i));
        }
        return a.peek();
    }
}
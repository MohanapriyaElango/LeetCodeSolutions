class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> push= new Stack<Integer>();
        Stack<Integer> pop= new Stack<Integer>();
        for(int i=popped.length-1;i>=0;i--)
           pop.push(popped[i]);
        for(int i: pushed)
        {
            push.push(i);
            while(!push.isEmpty() && !pop.isEmpty() && push.peek().equals(pop.peek()))
            {
                push.pop();
                pop.pop();
            }
        }
        if(push.isEmpty() && pop.isEmpty())
        {
            return true;
        }
        System.out.println(pushed.length+" "+popped.length+" "+push.size()+" "+pop.size());
        return false;
    }
}
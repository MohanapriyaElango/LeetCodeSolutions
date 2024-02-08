class Solution {
    public boolean isValid(String p) {
        Stack<Character> s= new Stack<Character>();
        for(char i: p.toCharArray())
        {
            // if(!s.isEmpty() && () && a.get(i)==s.peek())
            if(!s.isEmpty() && ((i==')' && s.peek()=='(') || (i=='}' && s.peek()=='{') || (i==']' && s.peek()=='[')))
                s.pop();
            else
            s.push(i);}
        if(s.isEmpty())
            return true;
        return false;
    }
}
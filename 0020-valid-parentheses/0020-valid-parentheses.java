class Solution {
    public boolean isValid(String p) {
        HashMap<Character,Character> a= new HashMap<Character,Character>();
        a.put('}','{');
        a.put(']','[');
        a.put(')','(');
        Stack<Character> s= new Stack<Character>();
        for(char i: p.toCharArray())
        {
            if(!s.isEmpty() && a.containsKey(i) && a.get(i)==s.peek())
                s.pop();
            else
            s.push(i);
               }
        if(s.isEmpty())
            return true;
        return false;
    }
}
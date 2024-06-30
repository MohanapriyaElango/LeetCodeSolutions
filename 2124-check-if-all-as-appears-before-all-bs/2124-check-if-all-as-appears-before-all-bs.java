class Solution {
    public boolean checkString(String s) {
        boolean turna = true;
        boolean ans = true;
        
        for(char i : s.toCharArray())
        {
            
            if(i =='b')
            {
                
                turna = false;
            }
                
            if(turna==false && i=='a')
            {
                ans = false;
                break;
            }
            
            
        }
        return ans;
    }
}
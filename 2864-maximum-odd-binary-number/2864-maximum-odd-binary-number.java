class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0,zero=0;
        for(char i: s.toCharArray())
        {
            if(i=='0') zero++;
            else one++;
        }
        String ans="";
        ans=ans+("1".repeat(one-1));
        ans=ans+("0".repeat(zero));
        ans=ans+"1";
        return ans;
    
    }
}
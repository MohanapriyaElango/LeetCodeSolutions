class Solution {
    public String finalString(String s) {
      StringBuilder a= new StringBuilder();
      for(int i=0;i<s.length();i++)  
      {
          char c=s.charAt(i);
          if(c!='i')
          {
              a.append(c);
          }
          else{
              a.reverse();
          }
      }
        return a.toString();
    }
}
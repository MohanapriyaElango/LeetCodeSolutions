class Solution {
    public String finalString(String s) {
      StringBuilder a= new StringBuilder();
      for(char i: s.toCharArray())  
      {
          if(i!='i')
          {
              a.append(i);
          }
          else{
              a.reverse();
          }
      }
        return a.toString();
    }
}
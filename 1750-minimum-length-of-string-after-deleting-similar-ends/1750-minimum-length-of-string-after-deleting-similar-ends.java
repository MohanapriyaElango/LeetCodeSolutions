class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            // System.out.println(mid1+" "+mid2);
            if(s.charAt(i)==s.charAt(j))
            {
            while((i+1)<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                i++;
            }
            while((j-1)>=0 && s.charAt(j)==s.charAt(j-1))
                j--;
                i++;
                j--;
                if(i>s.length() || j<-1)
                break;
            }
            else
              break;
        }
        return i-j<=0?j-i+1:0;
    }
}
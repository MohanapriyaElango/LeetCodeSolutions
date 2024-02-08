class Solution {
    public boolean halvesAreAlike(String s) {
        String a= s.substring(0,(s.length()/2));
        String b= s.substring((s.length()/2));
        int a1=0,b1=0;
        for(int k=0;k<s.length()/2;k++)
        {
            char i= a.charAt(k);
            char j= b.charAt(k);
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u' || i=='A' || i=='E' || i=='I' || i=='O' || i=='U')
            a1++;
            if(j=='a' || j=='e' || j=='i' || j=='o' || j=='u' || j=='A' || j=='E' || j=='I' || j=='O' || j=='U')
            b1++;
        }
        return a1==b1;
    }
}
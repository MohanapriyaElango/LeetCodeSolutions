class Solution {
    public String convert(String a, int k) {
        // int n= s.length();
        // StringBuilder ans= new StringBuilder();
        // for(int i=0;i<numRows;i++)
        // {
        //     for(int j=i;j<n;j+=i)
        //     {
        //         ans.append(s.charAt(j));
        //     }
        // }
        // String ans1= new String(ans);
        // return ans1;
		String [] ans= new String[k];
		for(int i=0;i<k;i++)
		ans[i]="";
		int count=0,i=0,turn=1;
        if(k==1)
        return a;
		while(count<a.length())
		{
		     ans[i]=ans[i]+a.charAt(count);
		     if(turn==1)
		     i++;
		     else if(turn==-1)
		     i--;
		     if(i==k)
		     {
		         turn=-1;
		         i=k-2;
		     }
		     else if(i==-1)
		     {
		         turn=1;
		         i=1;
		     }
		     count++;
		}
		String encrypted="";
		for(i=0;i<k;i++)
		   encrypted=encrypted+ans[i];
        // System.out.println(encrypted);
        return encrypted;
    }
}
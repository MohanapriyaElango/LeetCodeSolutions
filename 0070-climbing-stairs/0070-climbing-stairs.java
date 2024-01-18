// class Solution {
//     static int fact(int n){    
//   if (n == 0)    
//     return 1;    
//   else    
//     return(n * fact(n-1));    
//  }    
//     public int climbStairs(int n) {
//         int ans=1;
//         for(int i=1;i<=n/2;i++)
//         {
//             int fact1=fact((n-(2*i))+i);
//             int fact2=fact(n-(2*i));
//             int fact3=fact(i);
//             int sol=fact1/(fact2*fact3);
//             // ans=ans+(fact((n-(2*i)+i))/(fact(n-(2*i))*fact(i)));
//             ans=ans+(fact1/(fact2*fact3));
//             System.out.println(fact1+" "+fact2+" "+fact3+" "+sol+" "+ans);
//         }
//         return ans;
//     }
// }

class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

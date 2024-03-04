class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0,maxScore=0,l=0,r=tokens.length-1;
        Arrays.sort(tokens);
        // List<Integer> played= new ArrayList<Integer();
        while(l<=r)
        {
            if(tokens[l]<=power)
            {
                score+=1;
                power-=tokens[l];
                l++;
                // l++;
                maxScore= Integer.max(score,maxScore);
            }
            else if(score>=1)
            {
                power+=tokens[r];
                score--;
                r--;
            }
            else
            break;
            // System.out.println(l+" "+r+" "+power+" "+score);
        }
        return maxScore;
    }
}
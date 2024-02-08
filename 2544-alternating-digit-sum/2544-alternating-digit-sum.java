class Solution {
    public int alternateDigitSum(int n) {
        int sumodd=0,sumeven=0,size=0;
        String turn;
        int len=(Integer.toString(n)).length();
        if(len%2==0)
        turn="odd";
        else
        turn="even";
        while(n>0)
        {
            if(turn.equals("even"))
            {
                sumeven=sumeven+(n%10);
                turn="odd";
            }
            else
            {
            sumodd=sumodd+(n%10);
            turn="even";
            }
            n/=10;
            size++;
        }
        if(size%2==0)
        return sumeven-sumodd;
        return sumeven-sumodd;
    }
}
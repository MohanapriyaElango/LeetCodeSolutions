class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]= new int [26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        int space=freq[25]-1;
        int initialGap=(space*n);
        for (int i = 24; i >= 0; i--)
        initialGap -= Math.min(space, freq[i]);

        return initialGap < 0 ? tasks.length : initialGap + tasks.length;
    }
}
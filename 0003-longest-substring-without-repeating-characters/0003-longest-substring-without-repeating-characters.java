class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,ans=0;
        Map<Character,Integer> a= new HashMap<Character,Integer>();
        for(int right=0;right<s.length();right++)
        {
            char ch= s.charAt(right);
                a.put(ch,a.getOrDefault(ch,0)+1);
                Set<Integer> b= new HashSet<Integer>(a.values());
                if(b.size()>1 || a.get(ch)>1)
                {
                    char l= s.charAt(left);
                    a.put(l,a.getOrDefault(l,0)-1);
                    if(a.get(l)==0)
                    {
                        a.remove(l);
                    }
                    left++;
                }
                ans=Math.max(ans,right-left+1);
            }
            return ans;
        }
    }

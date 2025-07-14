class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> seen=new HashSet<>();
        int left=0;
        int le=0;

        for(int right=0;right<s.length();right++){
            char currentChar=s.charAt(right);

            while(seen.contains(currentChar)){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(currentChar);
             le=Math.max(le,right-left+1);

        }
        return le;
        
    }
}
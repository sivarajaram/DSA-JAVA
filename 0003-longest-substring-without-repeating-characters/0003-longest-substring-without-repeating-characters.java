class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set< Character> seen=new HashSet<>();
        int left=0;
        int length=0;

        for(int right=0;right<s.length();right++){
            char current=s.charAt(right);
            while(seen.contains(current)){
                seen.remove(s.charAt(left));
                left++;
            }
                seen.add(current);
                length=Math.max(length,right-left+1);
            
            
        }
        return length;
        
    }
}
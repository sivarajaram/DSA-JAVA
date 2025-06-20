class Solution {
    public int lengthOfLastWord(String s) {
     s=  s.trim();
     int lastind=s.lastIndexOf(" ");
     return s.length()-lastind-1;

        
    }
}
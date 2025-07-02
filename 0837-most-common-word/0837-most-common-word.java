class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        String[] words=paragraph.split(" ");
        HashMap<String,Integer> frq=new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        
     for(String word:words){
        if(!bannedSet.contains(word) && !word.equals("")){
        frq.put(word, frq.getOrDefault(word,0)+1);
     }
     }
String  mostcommon="";
int max=0;

for(String word:frq.keySet()){
    if(frq.get(word)>max){
        max=frq.get(word);
        mostcommon=word;
    }

}
return mostcommon;
    }
}
class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int count[]=new int[n+1];
        for(int c:citations){
            if(c>=n){
                count[n]++;
            }
                else{
                    count[c]++;
                }
            }
            int h=0;
            for(int i=n;i>=0;i--){
                h+=count[i];
                if(h>=i){
                    return i;
                }
            }
            return 0;

        }
        
        
    }

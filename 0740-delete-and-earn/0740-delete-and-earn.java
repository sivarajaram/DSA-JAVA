class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        int[] points=new int[100000];

        for(int num:nums){
            points[num]+=num;
            max=Math.max(max,num);
        }

       int take = 0, skip = 0;
        for (int i = 0; i <= max; i++) {
            int takei = skip + points[i];  
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }

        return Math.max(take, skip);
      
        
    }
}
class Solution {
    public int maxArea(int[] height) {
        int water=0;
        int left=0;
        int right=height.length-1;
        
        while(left<right){
            int hig=Math.min(height[left],height[right]);
            int length=right-left;
            int cwater=hig*length;
            water=Math.max(water,cwater);
            if(height[left]>height[right]) right--;
            else left++;
        }
        return water;
        
    }
}
class Solution {
    public int maximumLength(int[] nums) {
        int countE=0;
        int countO=0;
        for(int num:nums){
            if(num%2==0){
                countE++;
            }
            else{
                countO++;
            }
        }
        int Edp=0;
        int Odp=0;
        for(int num:nums){
            if(num%2==0){
                Edp=Math.max(Edp,Odp+1);
            }
            else{
                Odp=Math.max(Odp,Edp+1);
            }
        }
        return Math.max(Math.max(Edp,Odp),Math.max(countE,countO));
    }
}
class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        int duplicate=0;
        int sum=0;
        for(int num:nums){
            if(!set.add(num)){
                duplicate=num;
            }
            sum+=num;
        }

        int expected=n*(n+1)/2;
        int miss=expected-(sum-duplicate);
        return new int[]{duplicate,miss};
        
    }
}
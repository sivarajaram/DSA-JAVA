class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0){
            return result;
        }
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Set<String> used=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                int cursum=nums[i]+nums[j];
                if(map.containsKey(-1*cursum)){
                    int k=map.get(-1*cursum);
                    if(!used.contains(nums[i] +":"+ nums[j]+":"+nums[k]) &&  k>i && k>j ){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    used.add(nums[i] +":"+ nums[j]+":"+nums[k]);
                }



            }
        }
      
       
    }
     return result;
}
}

/*  Easy and alternate way to aolve this problem
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            int l = i + 1, r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    set.add(List.of(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                } 
                else if (sum < 0) {
                    l++;
                }
                else {
                    r--;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}
*/
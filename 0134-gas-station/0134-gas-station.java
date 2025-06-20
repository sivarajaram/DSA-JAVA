class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_left=0;
        for(int i=0;i<gas.length;i++){
            total_left+=gas[i]-cost[i];
        }

        
        
        if(total_left<0)
            return -1;
        
        
        int start_index=0;
        int remaining=0;
for(int i=0;i<gas.length;i++){
    int current=gas[i]+remaining;
    int current_cost=cost[i];
        remaining=current-current_cost;
        if(remaining<0){
            remaining=0;
            start_index=i+1;
        }
}

   return start_index; }
}


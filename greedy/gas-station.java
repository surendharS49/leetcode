class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int gsum=0;
        int csum=0;
        int s=0;
        for(int i=0;i<gas.length;i++){
            sum+=gas[i]-cost[i];
            gsum+=gas[i];
            csum+=cost[i];
            if(sum<0){
                sum=0;
                s=i+1;
            }
        }
        if(gsum>=csum){
        return s;}
        return -1;
    }
}
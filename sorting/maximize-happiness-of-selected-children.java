class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
       Arrays.sort(happiness);
        long ans=0;
        int i=0;
        int arr[]=new int[happiness.length];
        for(int j=happiness.length-1;j>=0;j--){
            arr[i++]=happiness[j];
        }
        for(int v=0;v<k;v++){
            if(arr[v]-v>0){
            ans=ans+arr[v]-v;
        }}    
           return ans;
    }
}
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int j=cost.length;
        int arr[]=new int[j];
        int x=0;
        if(j==1){
            return cost[0];
        }
       for(int i=j-1;i>=0;i--){
        arr[x++]=cost[i];
        // cost[i]=cost[j];
        // cost[j]=temp;
        // j--;
       } 
       int ans=0;
       int c=1;
       for(int i=0;i<arr.length;i++){
        if(c%3!=0){
            ans+=arr[i];
            c++;
        }else{
            c++;
        }
      
       }
       return ans;
    }
}
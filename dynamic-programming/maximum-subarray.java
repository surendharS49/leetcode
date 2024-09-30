class Solution {
    public int maxSubArray(int[] arr) {
        int n=arr.length;
       int sum[]=new int[n];
        sum[0]=arr[0];
        for(int i=1;i<n;i++){
            int an=sum[i-1]+arr[i];
            if(an<arr[i]){
                sum[i]=arr[i];
            }else{
                sum[i]=an;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:sum){
            max=Math.max(i,max);
        }
        return max;
    }}
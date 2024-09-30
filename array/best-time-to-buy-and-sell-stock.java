class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=0;
        int i=0;
        int j=n-2;
        while(i<n){
            if(arr[i]<min){
                min=arr[i];
            }
            else {
                int sum=arr[i]-min;
                if(sum>max){
                    max=sum;
                }
            }
            i++;
          
        }
      return max;
    }
}
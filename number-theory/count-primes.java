class Solution {
    public int countPrimes(int n) {
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        
        if(n<=1){return 0;}
        arr[0]=0;
        arr[1]=0;
    int i=2;
        while(i<n){
          
                for(int j=i*2;j<n;j=j+i){
                    arr[j]=0;
                }
            
            i++;
        }
        int count=0;
        for(int k:arr){
            if(k==1){
                count++;
            }
        }
        return count;
    }
}
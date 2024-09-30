class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
       int n=str.length();
       int arr[]=new int[n];
       int x=n-1;
       while(x>=0){
        arr[x]=num%10;
        num=num/10;
        x--;

       }
       for(int i=0;i<n;i++){
        if(arr[i]==6){
            arr[i]=9;
            break;
        }
       }
       int ans=0;
       for(int j:arr){
        ans=ans*10+j;
       }return ans;
    }
}
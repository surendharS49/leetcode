class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        int l=s.length();
        int arr[]=new int[l];
        int i=l-1;
        while(i>=0){
            arr[i]=n%10;
            n=n/10;
            i--;
        }
        int j=0;
        int ans=0;
        while(j<l){
           if(j%2==0){
                ans=ans+arr[j];
            }else{
                ans=ans-arr[j];
            }
            j++;
        }return ans;
    }
}
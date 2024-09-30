class Solution {
    public int countEven(int num) {
        int count=0;
       for(int i=1;i<=num;i++){
        int ans=0;
        int k=i;
        while(k>0){
            ans=ans+k%10;
            k=k/10;
        }if(ans%2==0){
            count++;
        }
       } return count;
    }
}
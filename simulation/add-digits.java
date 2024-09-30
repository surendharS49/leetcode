class Solution {
    public int addDigits(int num) {
       
        while(num>9){
            int s=num;
            int ans=0;
            while(s>0){
                int d=s%10;
                ans+=d;
                s=s/10;
            }
            num=ans;

        }
        return num;
    }
}
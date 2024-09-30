class Solution {
    public boolean hasAlternatingBits(int n) {
        int a=n%2;
        n=n/2;
        while(n>0){
            if(n%2==a){
                return false;
            }else{
                a=n%2;
                 n=n/2;
            }
        }return true;
    }
}
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int h=0;
        int a=x;
        int s=0;
        while(x>0){
            h=x%10;
            s=s+h;
            x=x/10;
        }if(a%s==0){
            return s;
        }
        return -1;
        
    }
}
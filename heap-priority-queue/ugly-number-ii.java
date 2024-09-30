class Solution {
    public int nthUglyNumber(int n) {
        int num[]=new int[n];
        num[0]=1;
        int f=0,a=0,b=0,c=0;
        for(int i=1;i<n;i++){
            num[i]=Math.min(Math.min(2*num[a],3*num[b]),5*num[c]);
            f=num[i];
        
        if(num[a]*2==f){
            a++;
        }
        if(num[b]*3==f){
            b++;
        }
        if(num[c]*5==f){
            c++;
        }
        }
        return num[n-1];
    }
}
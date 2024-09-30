class Solution {
    public int distanceTraveled(int m, int a) {
        int ans=0;
        while(m>=5)
        {
            ans=ans+5*10;
            if(a>0){
                m=m-5+1;
            }else{
                m=m-5;
            }
            a--;
        }
        return m*10+ans;
    }
}
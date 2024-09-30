class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        if(s.length()<=8){
            return s.length();
        }
        int count=0;
        int ans=1;
        while(n>=8){
            count+=8*ans;
            n=n-8;
            ans++;
        }
        count+=n*ans;
        return count;
    }
}
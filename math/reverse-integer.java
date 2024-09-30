class Solution {
    public int reverse(int x) {
       
        int dig=0;
        int rev=0;
        int ans=0;
        String s=Integer.toString(x);
        int l=s.length();
       
          while(x!=0){
            
            dig=x%10;
            rev=ans*10+dig;
            if((rev-dig)/10!=ans)
            return 0;
            x/=10;
            ans=rev;
        }
        
        
        return rev ;
    }
}
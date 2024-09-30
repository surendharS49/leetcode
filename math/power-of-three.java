class Solution {
    public boolean isPowerOfThree(int n) {
        boolean p=false;
        if(n==1){
            return true;
        
        }
        if(n<=0){
            return false;
        }
        if(n%3!=0){
            return false;
        }
        
        for(int i=1;i<31;i++){
            if(n==Math.pow(3,i)){
                return true;
            

            }
        }
        return false;

        
    }
}
     
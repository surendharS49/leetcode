class Solution {
    public boolean isPowerOfTwo(int n) {

        boolean p=false;
        if(n==1  ){
            return true;
        
        }
        if(n%2!=0){
            return false;
        }
        
        for(int i=1;i<31;i++){
            if(n==Math.pow(2,i)){
                return true;
            

            }
        }
        return false;

        
    }
}
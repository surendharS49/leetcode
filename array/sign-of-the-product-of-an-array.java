class Solution {
    public int arraySign(int[] nums) {
        long nev=0;
        long pos=1;
        for(int i:nums){
            if(i==0){
                return 0;
            }
            if(i<0){
                nev++;
            }
          
        }if(nev%2==0){
            return 1;
        }else
            return -1;
        
    }
}
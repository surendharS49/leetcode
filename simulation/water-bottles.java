class Solution {
    public int numWaterBottles(int nu, int ex) {
         int empty=nu;
        int drink=nu;
      
       
        while(ex<=empty){
           drink++;
           empty=empty-ex+1;
        
        }
        return drink;
    }
}
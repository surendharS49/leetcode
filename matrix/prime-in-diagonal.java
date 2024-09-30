class Solution {
    public int diagonalPrime(int[][] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                
                if(j==i ||j==nums[0].length-i-1){
                int a=nums[i][j];
                int count=0;
                if(a<2){
                    ans=0;
                    break;
                }else{
                for(int v=1;v<=Math.sqrt(a);v++){
                    
                    if(a%v==0){
                        count++;
                    }
                }
                if(count==1){
                    ans=Math.max(ans,nums[i][j]);
                }}
            
            }}
        }return ans;
    }
}
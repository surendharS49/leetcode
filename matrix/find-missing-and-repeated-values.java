class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(hm.containsKey(grid[i][j])){
                    hm.put(grid[i][j],hm.get(grid[i][j])+1);
                }else{
                    hm.put(grid[i][j],1);
                }
            }}
            
            int v=n*m;
           
            int ans[]=new int[2];
            for(int k=1;k<=v;k++){
                if(hm.containsKey(k)){
                if(hm.get(k)==2){
                    ans[0]=k;
                }
            }else{ans[1]=k;}
            }
        return ans;
    }
}
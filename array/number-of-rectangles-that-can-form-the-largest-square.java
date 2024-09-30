class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int n=rectangles.length;
        int min[]=new int[n];
        for(int i=0;i<n;i++){
            int ans=Integer.MAX_VALUE;
            for(int j=0;j<rectangles[0].length;j++){
                ans=Math.min(ans,rectangles[i][j]);
            }
            min[i]=ans;
        }//int ma=0;
int ma=Integer.MIN_VALUE;
        int count=0;
        for(int x=0;x<n;x++){
            
                ma=Math.max(ma,min[x]);
        }for(int y=0;y<n;y++){
            if(ma==min[y]){
                count++;
            }
        }return count;
    }
}
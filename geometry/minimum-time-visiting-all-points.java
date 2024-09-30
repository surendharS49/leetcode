class Solution {
    public int minTimeToVisitAllPoints(int[][] p) {
        int r=p.length;
        int max=0;
        for(int i=0;i<r-1;i++){
            max=max+Math.max(Math.abs(p[i][0]-p[i+1][0]),(Math.abs(p[i][1]-p[i+1][1])));
            
        }
        return max;
    }
}
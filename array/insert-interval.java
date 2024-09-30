class Solution {
    public int[][] insert(int[][] in, int[] ne) {
        if(in.length==0){
            int arr[][]=new int[1][2];
            arr[0][0]=ne[0];
            arr[0][1]=ne[1];
            return arr;
        }
        int sum[][]=new int[in.length+1][2];
        for(int i=0;i<in.length;i++){
            sum[i][0]=in[i][0];
            sum[i][1]=in[i][1];
        }
        sum[in.length][0]=ne[0];
        sum[in.length][1]=ne[1];
        Arrays.sort(sum,(a,b)-> Integer.compare(a[0],b[0]));
        int x=0;
        int pre[][]=new int[in.length+1][2];
        pre[x][0]=sum[x][0];
        pre[x][1]=sum[0][1];
        for(int i=1;i<in.length+1;i++){
            if(sum[i][0]<=pre[x][1]){
        int min=Math.min(pre[x][0],sum[i][0]);
           int max=Math.max(pre[x][1],sum[i][1]);
           pre[x][0]=min;
            pre[x][1]=max;}
            else{
                x++;
                pre[x][0]=sum[i][0];
                pre[x][1]=sum[i][1];
            }
        }
           return Arrays.copyOf(pre,x+1);
    }
}
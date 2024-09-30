class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
       for(int i=0;i<n;i++){
        int j=0;
        int k=m-1;
        while(j<=k){
            int temp=image[i][j];
            image[i][j]=image[i][k];
            image[i][k]=temp;
            j++;
            k--;
        }
       }
       for(int i=0;i<n;i++){
        for(int l=0;l<m;l++){
            
            image[i][l]=1-image[i][l];
        }
       }return image;
    }
}
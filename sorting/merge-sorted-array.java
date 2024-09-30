class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int k=0;
        int ar[]=new int [m+n];
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(num1[i]<num2[j]){
                ar[k++]=num1[i++];

            }
            else
            {
                ar[k++]=num2[j++];

            }
        }
        while(i<m){
            ar[k++]=num1[i++];

        }
        while(j<n){
            ar[k++]=num2[j++];
        }
        for(int x=0;x<m+n;x++){
            num1[x]=ar[x];
        }
        for(int x=0;x<m+n;x++){
            System.out.print(num1[x]+" ");
        }

    }
}
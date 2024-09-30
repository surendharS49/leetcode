class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int ans[]=new int[arr.length];
        int x=0;
        for(int i:arr){
            int count=0;
            while(i>0){
                count=count+i%2;
                i=i/2;
            }
            ans[x++]=count;
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(ans[j]>ans[j+1]){
                    int temp=ans[j+1];
                    ans[j+1]=ans[j];
                    ans[j]=temp;
                    int temp1=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp1;
                }
            }
        }
        return arr;
    }
}
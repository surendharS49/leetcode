class Solution {
    public int largestCombination(int[] arr) {
        int bin[]=new int[32];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<32;j++){
                int temp=arr[i]>>j&1;
                if(temp==1){
                    bin[j]++;
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i:bin){
            if(i>max){
                max=i;
            }
        } 
        return max;       
    }
}
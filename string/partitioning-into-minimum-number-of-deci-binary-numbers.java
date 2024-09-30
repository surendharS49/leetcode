class Solution {
    public int minPartitions(String n) {
        
        int max=0;
        int i=0;
        char[] arr=n.toCharArray();
        while(i<arr.length){

           int dec=(arr[i]-'0');
            if(dec>max){
                max=dec;
            }
            i++;
        }
        return max;
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int arr[]=new int[gain.length+1];
        int i=0;
        arr[0]=0;
        while(i<gain.length){
            arr[i+1]=arr[i]+gain[i];
            i++;
        }
        Arrays.sort(arr);
        return arr[gain.length];

    }
}
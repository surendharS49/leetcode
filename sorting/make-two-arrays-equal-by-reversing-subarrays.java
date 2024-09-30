class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // Arrays.sort(target);
        // Arrays.sort(arr);
        // for(int i=0;i<target.length;i++){
        //     if(arr[i]!=target[i]){
        //         return false;
        //     }
        // }
        // return true;
        int num[]=new int[1001];
        for(int i:target){
            num[i]++;
        }
        for(int i:arr){
            num[i]--;
        }
        for(int n:num){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
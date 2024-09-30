class Solution {
    public int longestConsecutive(int[] arr) {
        Arrays.sort(arr);
       int count=0;
       ArrayList<Integer>lis=new ArrayList<>();
       int ans=0;
       if(arr.length==0){
        return 0;
       }
       lis.add(arr[0]);
       for(int i=1;i<arr.length;i++){
        if(arr[i]!=arr[i-1]){
            lis.add(arr[i]);
        }
       }
        for(int i=0;i<lis.size();i++){
            if(i>0 && lis.get(i)==lis.get(i-1)+1){
                count++;
            }else{
                count=1;
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}
class Solution {
    public int[] decompressRLElist(int[] nums) {
         ArrayList<Integer>arr=new ArrayList<>();;
         int x=0;
        for(int i=0;i<nums.length-1;i+=2){
           
            int f=nums[i];
            int v=nums[i+1];
            for(int j=0;j<f;j++){
                arr.add(v);
            }
           
        } int res[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[x++]=arr.get(i);
        }
        return res;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        ArrayList<Integer>arr=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(hm.get(nums[j])==1){
                arr.add(nums[j]);
            }
        }
        int ans[]=new int[arr.size()];
        int k=0;
        for(int q:arr){
            ans[k]=arr.get(k);
            k++;
        }
        return ans;
    }
}
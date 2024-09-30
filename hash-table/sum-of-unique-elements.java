class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        int ans=0;
        for(int j=0;j<nums.length;j++){
            if(hm.get(nums[j])==1){
                ans=ans+nums[j];
                hm.remove(nums[j]);
            }
        }
        return ans;
    }
}
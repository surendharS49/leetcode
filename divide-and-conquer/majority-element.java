class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        int n=nums.length/2;
        for(int j=0;j<nums.length;j++){
            if(hm.get(nums[j])>n){
                return nums[j];
            }
        }
        return -1;
    }
}
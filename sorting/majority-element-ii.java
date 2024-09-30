class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        ArrayList<Integer>arr=new ArrayList<>();
        for (int num : nums) {
            if (hm.get(num) > nums.length / 3 && !arr.contains(num)) {
                arr.add(num);
            }
        }
       return arr; 
    }
}
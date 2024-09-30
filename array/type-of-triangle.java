class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        int count=1;
         if(nums[0]+nums[1]<=nums[2]){
                return "none";
            }
        for(int i=0;i<nums.length-1;i++){
           
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        if(count==nums.length){
            return "equilateral";
        }else if(count==nums.length-1){
            return "isosceles";
        } 
        return "scalene";      
    }
}
class Solution {
    public int[] resultArray(int[] nums) {
       ArrayList<Integer>arr1=new ArrayList<>();
       ArrayList<Integer>arr2=new ArrayList<>();
       
            arr1.add(nums[0]);
        
            arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
        if(arr2.get(arr2.size()-1)<arr1.get(arr1.size()-1)){
            arr1.add(nums[i]);
        }else{
            arr2.add(nums[i]);
        }
       }
       int ans[]=new int[nums.length];
       int x=0;
       for(int i=0;i<arr1.size();i++){
        ans[x++]=arr1.get(i);
       }
       for(int i=0;i<arr2.size();i++){
        ans[x++]=arr2.get(i);
       }
       return ans;
    }
}
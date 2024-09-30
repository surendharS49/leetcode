class Solution {
    public void moveZeroes(int[] nums) {
    //Arrays.sort(nums);
    ArrayList<Integer>arr=new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            arr.add(nums[i]);
        }
    }
    for(int j=arr.size();j<nums.length;j++){
        arr.add(0);
    }
    for(int x=0;x<nums.length;x++){
        nums[x]=arr.get(x);
    }
    }
}
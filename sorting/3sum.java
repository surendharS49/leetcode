class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>lis=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                List<Integer>arr=new ArrayList<>();
                arr.add(nums[i]);
                arr.add(nums[j]);
                arr.add(nums[k]);
                lis.add(arr);
               while(j<k && nums[j]==nums[j+1]){
                j++;}
            }
            if(sum>0){
                k--;
            }else{
                j++;
            }
        }
       }
       return lis;
    }
}
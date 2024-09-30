class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>>set=new HashSet<>();
        function(set,nums,0,nums.length);
        List<List<Integer>>lis=new ArrayList<>(set);
        return lis;
    }
    public void function(HashSet<List<Integer>> set,int[] nums,int l,int h){
        if(l==h){
        List<Integer>hm=new ArrayList<>();
            for(int i:nums){
                hm.add(i);
            }
            set.add(hm);
        }
        for(int i=l;i<h;i++){
            swap(nums,l,i);
            function(set,nums,l+1,h);
            swap(nums,l,i);
        }
    }
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
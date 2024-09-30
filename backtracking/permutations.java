class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length-1;
        int l=0;
        fun(nums,l,n,arr);
        return arr;
    }
    public static void fun(int nums[],int l,int n,List<List<Integer>> arr){
        if(l==n){
            List<Integer> ans=new ArrayList<>();
            for(int k:nums){
                ans.add(k);
            }
            arr.add(ans);
        }else{
            for(int i=l;i<=n;i++){
                swap(nums,l,i);
                fun(nums,l+1,n,arr);
                 swap(nums,l,i);
            }
        }
    }
    public static void swap(int s[],int a,int b){
        
        int temp=s[a];
         s[a]=s[b];
        s[b]=temp;
       
    }
}
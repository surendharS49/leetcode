class Solution {
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=nums[j];
        }
        Arrays.sort(arr);
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            if(isPrime(nums[i])){
                max=Math.max(max,i);
                min=Math.min(min,i);
            }
        }
        return Math.abs(max-min);
    }
}
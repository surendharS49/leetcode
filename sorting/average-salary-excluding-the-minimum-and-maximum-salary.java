class Solution {
    public double average(int[] salary) {
    
        double ans=0;
        int n=salary.length;
        Arrays.sort(salary);       
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+salary[i];
        }
        sum=sum-salary[0]-salary[n-1];
        ans=sum/(n-2);
        return ans;
    }
}
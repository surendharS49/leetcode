class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
    int ind=0;
    int ans=0;
    int arr[]=new int[(n*(n+1))/2];
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=nums[j];
            arr[ind]=sum;
            ind++;
        }
    }
    Arrays.sort(arr);
     //sort(arr,0,arr.length-1); 
     System.out.println(Arrays.toString(arr));
     int an=0;
     int mod=(int)1e9+7;
     while(left<=right){
        an=(an+arr[left-1])%mod;
        left++;
     }
     return an;
    }
    public static void sort(int arr[],int l,int h){
        if(l<h){
        int p=part(arr,l,h);
        sort(arr,l,p-1);
        sort(arr,p+1,h);}
    }
    public static int part(int[] arr,int l,int h){
        int pivot=arr[h];
        int a=l-1;
        for(int i=l;i<=h;i++)
        if(arr[i]<pivot){
            a++;
            swap(arr,a,i);
        }
        swap(arr,a+1,h);
        return a+1;
    }
    public static void swap(int arr[] ,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    
}
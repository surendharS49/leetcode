class Solution {
    public int[] sortArray(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    int[] mergesort(int a[],int start,int end){
        if(start<end){
        int mid=(start+end)/2;
        mergesort(a,start,mid);
        mergesort(a,mid+1,end);
        merge(a,start,mid,end);
    }return a;
    }
    void merge(int a[],int beg,int mid,int end){
         int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[] = new int[n1];
        int RightArray[] = new int[n2];

        for (int i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (int j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = beg;

        while (i < n1 && j < n2) {
            if (LeftArray[i] <= RightArray[j]) {
                a[k] = LeftArray[i];
                i++;
            } else {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
        
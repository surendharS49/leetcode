class Solution {
    public String makeSmallestPalindrome(String s) {
        int i=0;
            int j=s.length()-1;
            char[] arr=s.toCharArray();
            while(i<j){
                if(arr[i]!=arr[j]){
                    if(arr[i]<arr[j]){
                        arr[j]=arr[i];
                    }else{
                        arr[i]=arr[j];
                    }}
                    i++;
                    j--;
                
            }
            String str="";
        for(char a:arr){
            str+=a;
        }
        return str;
    }
}
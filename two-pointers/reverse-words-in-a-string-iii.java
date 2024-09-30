class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int h=0;h<arr.length;h++){

            char[] ch=arr[h].toCharArray();
            int i=0;
            int j=ch.length-1;
            while(i<j){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            String e="";
            for(int k=0;k<ch.length;k++){
                e=e+ch[k];
            }
            arr[h]=e;
        }
        String rev="";
        for(String a:arr){
            rev=rev+a+" ";
        }
        return rev.trim();
    }
}
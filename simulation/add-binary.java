class Solution {
    public String addBinary(String a, String b) {  
        int l = a.length() - 1;
        int r = b.length() - 1;
        int carry=0;
        String ans="";   
        while(l>=0 || r>=0 || carry!=0){
            int sum=carry;
            if(l>=0){
                sum+=a.charAt(l)-'0';
                l--;
            }
            if(r>=0){
                sum+=b.charAt(r)-'0';
                r--;
            }
            ans=Integer.toString(sum%2)+ans;
            carry=sum/2;
        }
        return ans;
        // String carry = "0";
        // String ans = "";
        // while (l >= 0 && r >= 0) {
        //     if (a.charAt(l) == '1' && b.charAt(r) == '1' && carry.equals("1")) {
        //         ans = "1" + ans;
        //         carry = "1";
        //     } else if (a.charAt(l) == '1' && b.charAt(r) == '1' && carry.equals("0")) {
        //         ans = "0" + ans;
        //         carry = "1";
        //     } else if ((a.charAt(l) == '1' || b.charAt(r) == '1') && carry.equals("1")) {
        //         ans = "0" + ans;
        //         carry = "1";
        //     } else if ((a.charAt(l) == '1' || b.charAt(r) == '1') && carry.equals("0")) {
        //         ans = "1" + ans;
        //         carry = "0";
        //     } else if (carry.equals("1")) {
        //         ans = "1" + ans;
        //         carry = "0";
        //     } else {
        //         ans = "0" + ans;
        //     }
        //     l--;
        //     r--;
        // }
        // while (l >= 0) {
        //     if (carry.equals("1") && a.charAt(l) == '1') {
        //         ans = "0" + ans;
        //         carry = "1";
        //     } else if (carry.equals("1") && a.charAt(l) == '0') {
        //         ans = "1" + ans;
        //         carry = "0";
        //     } else {
        //         ans = a.charAt(l) + ans;
        //     }
        //     l--;
        // }
        // while (r >= 0) {
        //     if (carry.equals("1") && b.charAt(r) == '1') {
        //         ans = "0" + ans;
        //         carry = "1";
        //     } else if (carry.equals("1") && b.charAt(r) == '0') {
        //         ans = "1" + ans;
        //         carry = "0";
        //     } else {
        //         ans = b.charAt(r) + ans;
        //     }
        //     r--;
        // }

        // if (carry.equals("1")) {
        //     ans = "1" + ans;
        // }

        // return ans;
    }
}

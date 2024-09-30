import java.math.BigInteger;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        BigInteger ans=BigInteger.ZERO;
        if(head==null){
            return 0;
        }
        while(head!=null){
            ans=ans.multiply(BigInteger.TEN).add(BigInteger.valueOf(head.val));
            head=head.next;
        }
       String st = ans.toString();
        int res = Integer.parseInt(st,2);
        return res;
        
    }
}
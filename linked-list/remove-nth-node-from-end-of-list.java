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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur=head;
        if(head==null){
            return head;
        }int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }
        int i=1;
        ListNode temp=head;
        int k=size-n;
          if (k < 0) {
            return head;
        }

        
        if (k == 0) {
            return head.next;
        }
        while(i<k && temp.next!=null){
           
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
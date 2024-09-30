/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer>hm=new HashMap<>();
        while(headA!=null){
            if(hm.containsKey(headA)){
                hm.put(headA,hm.get(headA)+1);
                headA=headA.next;

            }else{
                hm.put(headA,1);
                headA=headA.next;
            }
        }while(headB!=null){
            if(hm.containsKey(headB)){
                return headB;
            }
            else{
                headB=headB.next;
            }
        }
        return null;
    }
}
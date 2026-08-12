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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        int n=0;
        ListNode cur=head;
        while(cur!=null){
            n++;
            cur=cur.next;
        }
        int mid=n/2;
        cur=head;
        for(int i=1;i<mid;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}
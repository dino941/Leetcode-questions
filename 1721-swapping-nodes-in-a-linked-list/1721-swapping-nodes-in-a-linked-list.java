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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode tmp=head;
        int n=0;
        while(tmp!=null){
            n++;
            tmp=tmp.next;
        }
        ListNode first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode sec=head;
        for(int i=1;i<n-k+1;i++){
            sec=sec.next;
        }
        int t=first.val;
        first.val=sec.val;
        sec.val=t;
        return head;

    }
}
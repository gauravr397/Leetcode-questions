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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode oddh=head,evenh=head.next,evenlist=evenh;
        while(evenh!=null && evenh.next!=null){
            oddh.next=evenh.next;
            oddh=oddh.next;
            evenh.next=oddh.next;
            evenh=evenh.next; 
        }
        oddh.next = evenlist;
        return head;
    }
}
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head;
        Queue<Integer> q=new PriorityQueue<>();
        while(curr!=null){
            q.add(curr.val);
            curr=curr.next;
        }
        curr=head;
        while(curr!=null && !q.isEmpty()){
            curr.val=q.poll();
            curr= curr.next;  
        }
        return head;
    }
}
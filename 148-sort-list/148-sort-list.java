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
        Queue<Integer> pq = new PriorityQueue();
        ListNode l = head;
        while(l!=null){
            pq.add(l.val);
            l=l.next;
        }
        l=head;
        while(l!=null &&!pq.isEmpty()){
            l.val=pq.poll();
            l=l.next;
        }
        return head;
    }
}
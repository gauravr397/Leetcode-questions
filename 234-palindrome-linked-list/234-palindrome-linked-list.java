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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;    
        }
        if(fast!=null)
            slow=slow.next;
        slow=reverse(slow);
        
        while(slow!=null){
            if(head.val!=slow.val)
                return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    } 
    
    public ListNode reverse(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
        }
        return prev;
    }
}

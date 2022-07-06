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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         // Stack<ListNode> s1=new Stack<>();
         // Stack<ListNode> s2=new Stack<>(); 
        Deque<ListNode> s1 = new ArrayDeque<>();
    Deque<ListNode> s2 = new ArrayDeque<>();
        while(l1!=null){
            s1.push(l1);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2);
            l2=l2.next;
        }
        
        ListNode res=null;
        int carry=0;
        while(!s2.isEmpty() || !s1.isEmpty() || carry>0){
            if(!s1.isEmpty()){
                carry+= s1.pop().val;
            }
             if(!s2.isEmpty()){
                carry+= s2.pop().val;
            }
            ListNode curr=new ListNode(carry%10);
            curr.next=res;
            res=curr;
            carry/=10;
        }
        return res;
    } 
}
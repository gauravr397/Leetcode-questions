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
        
        // Approach I
//         ListNode slow=head,fast=head;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;    
//         }
//         if(fast!=null)
//             slow=slow.next;
//         slow=reverse(slow);
        
//         while(slow!=null){
//             if(head.val!=slow.val)
//                 return false;
//             head=head.next;
//             slow=slow.next;
//         }
//         return true;
//     } 
    
//     public ListNode reverse(ListNode head){
//         ListNode prev=null;
//         while(head!=null){
//         ListNode temp=head.next;
//         head.next=prev;
//         prev=head;
//         head=temp;
//         }
//         return prev;
        
        
        // Approach II

        List<Integer> arr = new ArrayList();
        
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        
        int i=0,j=arr.size()-1;
        while(i<j){
            if(arr.get(i)!=arr.get(j))
                return false;
            i++;
            j--;
            
        }
        return true;
    }
}

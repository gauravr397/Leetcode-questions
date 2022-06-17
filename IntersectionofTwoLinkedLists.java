public class IntersectionofTwoLinkedLists {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    // class check {
    // static Node insertNode(Node head,int val){
    // Node newNode =new Node(val);
    // if(head ==null){
    // head = newNode;
    // return head;
    // }
    // }
    // }
    public class Solution {

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode longer = headB, shorter = headA;
            if (headA == null || headB == null)
                return null;
            while (longer != shorter) {
                if (shorter == null) {
                    shorter = headB;
                } else {
                    shorter = shorter.next;
                }
                if (longer == null) {
                    longer = headA;
                } else {
                    longer = longer.next;
                }
            }
            return shorter;
        }
    }
}

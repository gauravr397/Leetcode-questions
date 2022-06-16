public class MiddleoftheLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode middleNode(ListNode head) {

            ListNode incOne = head;
            ListNode incTwo = head;
            while (incTwo != null && incTwo.next != null) {
                incOne = incOne.next;
                incTwo = incTwo.next.next;
            }

            return incOne;
        }
    }

}

public class PalindromeLinkedList {

    public boolean ispalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        if (fast != null)
            slow = slow.next;
        ListNode start = reverse(slow);
        boolean result = compare(head, start);
        return result;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean compare(ListNode head, ListNode slow) {
        while (slow != null) {
            if (head.val != slow.val) {
                return false;
                slow = slow.next;
                head = head.next;
            }
        }
        return true;
    }
}

class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) { // check if element val is present at start node then just skip it
            head = head.next;
        }
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) { // example team.next = 2 then nxt -> is 6 condition true
                temp.next = temp.next.next; // then make 2 -> reference to temp.next.next = 3 & then as 6 has no refence
                                            // grabase collector will remove it from the linked list

            } else {
                temp = temp.next; // if not truw then keep on traversing
            }

        }
        return head;
    }
}
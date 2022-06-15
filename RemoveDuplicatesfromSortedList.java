public class RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {
        // int val;
        // ListNode next;
        // ListNode() {}
        // ListNode(int val) { this.val = val; }
        // ListNode(int val, ListNode next) { this.val = val; this.next = next;
    }

    public ListNode deleteDuplicates(ListNode head){
        if(head==nu;; || head.next==null){
            return head;
        }
        ListNodee currentNode = new ListNode();
        while(currentNode!=null){
            if(currentNode.val==currentNode.next.val){
                currentNode = currentNode.next.next;
            }
            else{
                currentNode = currentNode.next;

            }
        }
        return head;
    }
}

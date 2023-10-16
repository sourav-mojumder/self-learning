package linkedlist;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode previous = null, current = head;

        while (current != null) {

            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }
}

class ListNode {
    public int data;
    public ListNode next;

    // Constructor will be used to make a LinkedListNode type object
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
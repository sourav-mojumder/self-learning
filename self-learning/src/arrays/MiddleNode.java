package arrays;

public class MiddleNode {

    public static LinkedListNode middleNode(LinkedListNode head) {

        LinkedListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

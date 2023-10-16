package linkedlist;

import java.util.List;

public class ReorderList {

    public static LinkedListNode reorderList(LinkedListNode head) {

        LinkedListNode middlePoint = getMiddlePointInLinkedList(head);
        LinkedListNode reversedHead = getLinkedListReversed(middlePoint);
        mergeTwoLinkedList(head, reversedHead);
        return head;
    }


    private static LinkedListNode mergeTwoLinkedList(LinkedListNode first, LinkedListNode second) {
        LinkedListNode temp = first;
        while (second.next != null) {
            temp = temp.next;
            first.next = second;
            second = second.next;
            first.next.next = temp;
            first = first.next.next;
        }
        return first;
    }

    private static LinkedListNode getLinkedListReversed(LinkedListNode head) {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = current.next;
        while (current != null) {
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    private static LinkedListNode getMiddlePointInLinkedList(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        int counter = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            counter++;
        }
        return counter % 2 == 0 ? slow : slow.next;
    }
}

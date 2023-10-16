package linkedlist;

import java.util.List;


public class ReorderList {
    private ListNode left;
    private int size = 0;

    private void reOrderListHelper(ListNode right, int floor) {

        if (right == null) return;
        reOrderListHelper(right.next, floor + 1);

        if (floor > size / 2) {

            right.next = left.next;
            left.next = right;
            left = right.next;
        } else if (floor == size / 2) {
            right.next = null;
        }
    }

    private int getSize(ListNode head) {
        if (head == null) return 0;
        return getSize(head.next) + 1;
    }

    public void reorderList(ListNode head) {
        left = head;
        this.size = getSize(head);
        reOrderListHelper(head, 0);
    }
}
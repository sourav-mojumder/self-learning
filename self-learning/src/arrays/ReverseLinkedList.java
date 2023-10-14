package arrays;

public class ReverseLinkedList {

    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {

        LinkedListNode fastNode = head;
        LinkedListNode slowNode = head;

       for(int i =1; i <= n; i++)
            fastNode = fastNode.next;

       if(fastNode == null)
           return head.next;

        while(fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }

            slowNode.next = slowNode.next.next;

        return head;
    }
}
class LinkedListNode {
    public int data;
    public LinkedListNode next;
    // Constructor will be used to make a LinkedListNode type object
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
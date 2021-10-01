

public class LinkedListNode {

    LinkedListNode next = null;
    int data;

    LinkedListNode(int d){
        data = d;
    }

    void appendToTail(int d){
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
}

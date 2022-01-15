package LinkedList;

public class CloneLinkList {
    static Node head;
    static class Node
    {
        int val;
        Node next;
        Node random;
        public Node(int val)
        {
            this.val = val;
        }
    }
    public static  void copyRandomList(Node head) {


        Node ptr = head;

        while(ptr != null){
            Node newNode = new Node(ptr.val);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }
        //A->A'->B->B'
        ptr = head;

        //A--C A'--C'
        while(ptr != null) {
            ptr.next.random = (ptr.random != null) ? ptr.random.next  : null;
            ptr = ptr.next.next;
        }

        Node old_ptr = head;
        Node cpy_ptr = head.next;
        //A->B->C A'->B'->C'
        Node old_main = head.next;

        while(old_ptr != null) {
            old_ptr.next = old_ptr.next.next;
            cpy_ptr.next = (cpy_ptr.next != null) ? cpy_ptr.next.next : null;
            old_ptr = old_ptr.next;
            cpy_ptr = cpy_ptr.next;
        }
        while (old_main != null){
            System.out.print(old_main.val+"->");
            old_main = old_main.next;
        }
    }

    static void push(int item){
        if(head == null){
            head = new CloneLinkList.Node(item);
            return;
        }
        CloneLinkList.Node node = new CloneLinkList.Node(item);
        node.next = head;
        head = node;

    }
    static void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4};
        int size1 = 4;
        for(int i = size1 - 1; i >= 0; --i)
            push(arr1[i]);

        copyRandomList(head);
       // printList();
    }
}

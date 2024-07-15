package OldData.OldMaterial.LinkedList;

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
        System.out.println();
    }

    static void push(int item){
        Node new_node = new Node(item);
        new_node.next = head;
        head = new_node;
    }
    static void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
      /*  int arr1[] = { 1, 2, 3, 4};
        int size1 = 4;
        for(int i = size1 - 1; i >= 0; --i)
            push(arr1[i]);*/


        CloneLinkList list = new CloneLinkList();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        // Setting up random references.
        list.head.random = list.head.next.next;
        list.head.next.random =
                list.head.next.next.next;
        list.head.next.next.random =
                list.head.next.next.next.next;
        list.head.next.next.next.random =
                list.head.next.next.next.next.next;
        list.head.next.next.next.next.random =
                list.head.next;



        copyRandomList(head);
        printList();
    }
}

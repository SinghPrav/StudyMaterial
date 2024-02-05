package OldMaterial.LinkedList;

public class ReverseLinkList {
   static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static void push(int item){
        if(head == null){
            head = new Node(item);
            return;
        }
            Node node = new Node(item);
            node.next = head;
            head = node;

    }

    static void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

    static void reverseList(){
        Node prev = null;
        Node nextNode;
        Node currNode = head;
        //  prev= curr Z cur= next;
        while(currNode != null){
            nextNode = currNode.next ;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }
        head = prev;
        printList();
        System.out.println();
    }

    static void reverseLinkList(Node node){
        if(node == null){
            return;
        }
        reverseLinkList(node.next);
        System.out.print(node.data+"->");
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4};

        int size1 = 4;


        // Create first list as 5->6->7
        int i;
        for(i = size1 - 1; i >= 0; --i)
            push(arr1[i]);

        printList();
        System.out.println();
        reverseList();
       // reverseLinkList(head);

    }
}

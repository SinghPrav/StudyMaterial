package OldMaterial.LinkedList;

public class ReverseGroupOfLink {
     LinkNode head;


    LinkNode reverse(LinkNode head, int k)
    {
        if(head == null)
            return null;
        LinkNode current = head;
        LinkNode next = null;
        LinkNode prev = null;

        int count = 0;

        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            head.next = reverse(next, k);

        // prev is now head of input list
        return prev;
    }

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        LinkNode new_node = new LinkNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to OldMaterial.test above functions */
    public static void main(String args[])
    {
        ReverseGroupOfLink llist = new ReverseGroupOfLink();

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
       int a[]={1,2,3,4,5,6,7,8,9};
       for(int i=a.length-1;i>=0;i--){
           llist.push(a[i]);
       }

        System.out.println("Given Linked List");
        llist.printList();

        llist.head = llist.reverse(llist.head, 3);

        System.out.println("Reversed list");
        llist.printList();
    }
}



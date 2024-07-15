package OldData.OldMaterial.LinkedList;

import java.util.HashSet;

public class DetectAndRemoveLoop {
    LinkNode head;
    public static void main(String[] args) {
        int a[] ={10,15,4,20};
        DetectAndRemoveLoop detectAndRemoveLoop = new DetectAndRemoveLoop();

        for(int i=a.length-1;i>=0;i--){
            detectAndRemoveLoop.push(a[i]);
        }
        detectAndRemoveLoop.head.next.next.next.next = detectAndRemoveLoop.head;

        if (detectAndRemoveLoop.removeLoop()) {
            System.out.println("Linked List after removing loop");
            detectAndRemoveLoop.printList();
        }
        else
            System.out.println("No Loop found");
    }

    public boolean removeLoop()
    {
        HashSet<LinkNode> s = new HashSet<LinkNode>();
        LinkNode prev = null;
        while (head != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle and we
            // need to remove this cycle so set the next of
            // the previous pointer with null.

            if (s.contains(head)) {
                prev.next = null;
                return true;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            else {
                s.add(head);
                prev = head;
                head = head.next;
            }
        }

        return false;
    }


    public void printList(){
        LinkNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void push(int x){
        LinkNode linkNode = new LinkNode(x);
        linkNode.next = head;
        head = linkNode;
    }
}

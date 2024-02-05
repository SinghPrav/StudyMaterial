package OldMaterial.LinkedList;

import java.util.HashSet;

public class IntersactionPoint {
    public static void main(String[] args) {
        // list 1
        LinkNode n1 = new LinkNode(1);
        n1.next = new LinkNode(2);
        n1.next.next = new LinkNode(3);
        n1.next.next.next = new LinkNode(4);
        n1.next.next.next.next = new LinkNode(5);
        n1.next.next.next.next.next = new LinkNode(6);
        n1.next.next.next.next.next.next = new LinkNode(7);
        // list 2
        LinkNode n2 = new LinkNode(10);
        n2.next = new LinkNode(9);
        n2.next.next = new LinkNode(8);
        n2.next.next.next = n1.next.next.next;
        Print(n1);
        Print(n2);
        System.out.println(MegeLinkNode(n1, n2).data);
    }
    // function to print the list
    public static void Print(LinkNode n)
    {
        LinkNode cur = n;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }

    // function to find the intersection of two node
    public static LinkNode MegeLinkNode(LinkNode n1, LinkNode n2)
    {
        // define hashset
        HashSet<LinkNode> hs = new HashSet<LinkNode>();
        while (n1 != null) {
            hs.add(n1);
            n1 = n1.next;
        }
        while (n2 != null) {
            if (hs.contains(n2)) {
                return n2;
            }
            n2 = n2.next;
        }
        return null;
    }
}

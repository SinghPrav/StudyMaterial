package OldMaterial.LinkedList;

public class MergeTwoLinkList {
    LinkNode head, head2, add;
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {6,7,8,9,10};
        MergeTwoLinkList mergeTwoLinkList = new MergeTwoLinkList();
        for(int i= a.length-1;i >= 0;i--){
            mergeTwoLinkList.head = mergeTwoLinkList.push(a[i], mergeTwoLinkList.head);
        }
        mergeTwoLinkList.printList(mergeTwoLinkList.head);
        for(int i= b.length-1;i >= 0;i--){
            mergeTwoLinkList.head2 = mergeTwoLinkList.push(b[i], mergeTwoLinkList.head2);
        }
        System.out.println();
        mergeTwoLinkList.printList(mergeTwoLinkList.head2);
        System.out.println();
      mergeTwoLinkList.add = mergeTwoLinkList.mergeList(mergeTwoLinkList.head, mergeTwoLinkList.head2);
        mergeTwoLinkList.printList(mergeTwoLinkList.add);
    }

    public LinkNode mergeList(LinkNode l1, LinkNode l2){
        LinkNode test = new LinkNode(-1);
        LinkNode p = test;
        while (l1!= null && l2!= null){
            if(l1.data <= l2.data){
                p.next = l1;
                l1= l1.next;
            }else{
                p.next = l2;
                l2= l2.next;
            }
            p = p.next;
        }
        if (l1 == null) {
            p.next = l2;
        }
        if (l2 == null) {
            p.next = l1;
        }
        return test.next;
    }

    public void printList(LinkNode head){
        LinkNode node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public LinkNode push(int x, LinkNode head){
        LinkNode node = new LinkNode(x);
        node.next = head;
        head = node;
        return head;
    }

}

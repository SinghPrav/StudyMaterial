package LinkedList;

public class NthNode {
    LinkNode head;
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        NthNode nthNode = new NthNode();
        for(int i= a.length-1;i >= 0;i--){
            nthNode.push(a[i]);
        }
        int k= 2;
        nthNode.printList();
        System.out.println();
        System.out.println("***************");
        nthNode.nthNode(k);
    }

    public void nthNode(int k){
        LinkNode curr = head;
        LinkNode fwd = head;
        while (k>0){
            fwd = fwd.next;
            k--;
        }
        while (fwd !=null && fwd.next!=null){
            curr = curr.next;
            fwd= fwd.next;
        }
        System.out.println(curr.data);
    }

    public void push(int x){
        LinkNode node = new LinkNode(x);
        node.next = head;
        head = node;
    }

    public void removeNode(int x){
        LinkNode temp = head;
        LinkNode prev = null;
        while (temp !=null) {
            while (temp != null && temp.data != x) {
                prev = temp;
                temp = temp.next;
            }
            if(temp == null) return;

            prev.next = temp.next;
            temp = temp.next;
        }
    }

    public void printList(){
        LinkNode node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

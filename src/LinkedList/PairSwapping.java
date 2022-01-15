package LinkedList;

public class PairSwapping {
    LinkNode head;
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        PairSwapping pairSwapping = new PairSwapping();
        for(int i= a.length-1;i >= 0;i--){
            pairSwapping.push(a[i]);
        }
        pairSwapping.printList();
        System.out.println();
        System.out.println("***************");
        pairSwapping.swapping();
        System.out.println();
        pairSwapping.printList();
    }

    public void swapping () {
        LinkNode temp = head;
        while(temp != null && temp.next != null){
            int  a = temp.data;
            temp.data = temp.next.data;
            temp.next.data = a;
            temp = temp.next.next;
        }
    }


    public void push(int x){
        LinkNode node = new LinkNode(x);
        node.next = head;
        head = node;
    }

    public void printList(){
        LinkNode node = head;
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

package OldData.OldMaterial.LinkedList;

public class FindMiddleElement {
    LinkNode head;
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        FindMiddleElement findMiddleElement = new FindMiddleElement();
        for(int i= a.length-1;i >= 0;i--){
            findMiddleElement.push(a[i]);
        }
        findMiddleElement.printList();
        System.out.println();
        System.out.println("***************");
       // findMiddleElement.removeNode(2);
       // findMiddleElement.printList();
        findMiddleElement.findMiddle();
    }

    public void findMiddle(){
        LinkNode curr = head;
        LinkNode fwd = head;
        while (fwd !=null && fwd.next!=null){
            curr = curr.next;
            fwd= fwd.next.next;
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

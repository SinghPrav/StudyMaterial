package OldMaterial.LinkedList;

public class RotateLinkList {
    LinkNode head;
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        int k = 3;
        RotateLinkList rotateLinkList = new RotateLinkList();
        for(int i=a.length-1; i>=0;i--){
            rotateLinkList.push(a[i]);
        }
        System.out.println();
        rotateLinkList.printList();
        System.out.println();
        rotateLinkList.rotateList(k);
        System.out.println();
        rotateLinkList.printList();
    }

    public void rotateList(int k){
        LinkNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        //10->20->30->40->50->60->10----
        curr.next = head;
        curr = head;
        //10->20
        for(int i=0;i<k;i++){
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;
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

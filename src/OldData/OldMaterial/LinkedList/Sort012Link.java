package OldData.OldMaterial.LinkedList;

public class Sort012Link {
    LinkNode head;
    public static void main(String[] args) {
        int a[] = {1,0,0,2,1,0,2,1};
        Sort012Link sort012Link = new Sort012Link();
        for(int i= a.length-1;i >= 0;i--){
            sort012Link.push(a[i]);
        }
        sort012Link.printList();
        System.out.println();
        System.out.println("***************");
        sort012Link.sort();
        System.out.println();
        sort012Link.printList();
    }

    public void sort(){
        int[] count = {0,0,0};
        LinkNode curr = head;

        while (curr!=null){
            count[curr.data]++;
            curr = curr.next;
        }

        int i=0;
        curr = head;

        while (curr!= null){
            if(count[i]==0){
                i++;
            }else {
                curr.data = i;
                --count[i];
                curr = curr.next;
            }
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

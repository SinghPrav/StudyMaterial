package OldData.OldMaterial.LinkedList;

public class Pallindrome {
    LinkNode head;
    LinkNode left;
    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};
        Pallindrome pallindrome = new Pallindrome();
        for(int i= a.length-1;i >= 0;i--){
            pallindrome.push(a[i]);
        }
        pallindrome.printList();
        System.out.println();
        System.out.println("***************");
        System.out.println(pallindrome.isPalindrome(pallindrome.head));
        pallindrome.printList();
    }

    boolean isPalindromeUtil(LinkNode right)
    {
        left = head;

        // Stop recursion when right becomes null
        if (right == null)
            return true;

        // If sub-list is not palindrome then no need to
        // check for the current left and right, return
        // false
        boolean isp = isPalindromeUtil(right.next);
        if (isp == false)
            return false;

        // Check values at current left and right
        boolean isp1 = (right.data == left.data);

        left = left.next;

        // Move left to next node;
        return isp1;
    }

    // A wrapper over isPalindrome(Node head)
    boolean isPalindrome(LinkNode head)
    {
        boolean result = isPalindromeUtil(head);
        return result;
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

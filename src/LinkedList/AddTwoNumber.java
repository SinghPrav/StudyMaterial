package LinkedList;

import java.util.Stack;

public class AddTwoNumber {


    static class ListNode
    {
        int data;
        ListNode next;

        public ListNode(int data)
        {
            this.data = data;
        }
    }

    static ListNode l1, l2, result;

    // To push a new node to linked list
    public static void push(int new_data)
    {

        // Allocate node
        ListNode new_node = new ListNode(new_data);

        // Put in the data


        // Link the old list off the new node
        new_node.next = l1;

        // Move the head to point to the new node
        l1 = new_node;
    }

    public static void push1(int new_data)
    {

        // Allocate node
        ListNode new_node = new ListNode(new_data);

        // Put in the data


        // Link the old list off the new node
        new_node.next = l2;

        // Move the head to point to
        // the new node
        l2 = new_node;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out = new ListNode(0);

        ListNode prev = out;
        int carry = 0;
        while(l1 != null || l2 != null){

            int x = (l1 != null) ? l1.data : 0;
            int y = (l2 != null) ? l2.data : 0;
            int sum = carry + x + y;

            int rem = sum %10;

            carry = sum / 10;


            prev.next = new ListNode(rem);

            prev = prev.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        if (carry > 0) {
            prev.next = new ListNode(carry);
        }
        return out.next;

    }

    public static ListNode addTwoNumbers()
    {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null)
        {
            stack1.add(l1.data);
            l1 = l1.next;
        }

        while (l2 != null)
        {
            stack2.add(l2.data);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        while (!stack1.isEmpty() ||
                !stack2.isEmpty())
        {
            int a = 0, b = 0;

            if (!stack1.isEmpty())
            {
                a = stack1.pop();
            }

            if (!stack2.isEmpty())
            {
                b = stack2.pop();
            }

            int total = a + b + carry;

            ListNode temp = new ListNode(total % 10);
            carry = total / 10;

            if (result == null)
            {
                result = temp;
            }
            else
            {
                temp.next = result;
                result = temp;
            }
        }

        if (carry != 0)
        {
            ListNode temp = new ListNode(carry);
            temp.next = result;
            result = temp;
        }
        return result;
    }

    // To print a linked list
    public static void printList()
    {
        while (result != null)
        {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr1[] = { 5, 6, 7 };
        int arr2[] = { 1, 8 };
        int size1 = 3;
        int size2 = 2;

        // Create first list as 5->6->7
        int i;
        for(i = size1 - 1; i >= 0; --i)
            push(arr1[i]);

        // Create second list as 1->8
        for(i = size2 - 1; i >= 0; --i)
            push1(arr2[i]);

        result = addTwoNumbers(l1, l2);

        printList();

        result =addTwoNumbers();

        printList();
    }
}

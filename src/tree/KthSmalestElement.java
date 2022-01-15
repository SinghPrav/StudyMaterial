package tree;

public class KthSmalestElement {

    static class Node {
        int data;
        Node left, right;
        Node(int x)
        {
            data = x;
            left = right = null;
        }
    }

    static int count = 0;
    // Recursive function to insert an key into BST
    public static Node insert(Node root, int x)
    {
        if (root == null)
            return new KthSmalestElement.Node(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }

    // Function to find k'th largest element in BST
    // Here count denotes the number
    // of nodes processed so far
    public static Node kthSmallest(Node root, int k)
    {
        System.out.println("---Base case---");
        // base case
        if (root == null)
            return null;
        System.out.println("---root Top---"+root.left+ "---"+root.data+"----"+root.right);
        // search in left subtree
        Node left = kthSmallest(root.left, k);
        System.out.println("---After left---");
        // if k'th smallest is found in left subtree, return it
        if (left != null) {
            System.out.println("---Left---"+left.left + "---"+left.data+"----"+left.right);
            return left;
        }

        // if current element is k'th smallest, return it
        count++;
        if (count == k) {
            System.out.println("---root---"+root.left + "---"+root.data+"----"+root.right);
            return root;
        }
        System.out.println("---Before right---");
        // else search in right subtree
        return kthSmallest(root.right, k);
    }

    // Function to find k'th largest element in BST
    public static void printKthSmallest(Node root, int k)
    {
        // maintain an index to count number of
        // nodes processed so far
        count = 0;

        Node res = kthSmallest(root, k);
        if (res == null)
            System.out.println("There are less "
                    + "than k nodes in the BST");
        else
            System.out.println("K-th Smallest"
                    + " Element is " + res.data);
    }

    public static void main (String[] args) {

        Node root = null;
        int keys[] = { 12, 8, 4, 20, 22, 10, 14, 18 };

        for (int x : keys)
            root = insert(root, x);

        int k = 5;
        printKthSmallest(root, k);




    }
}

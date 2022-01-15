package tree;

public class BinaryTreeToDoublyLinkList {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(25);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(36);
        return root;
    }


    /**                       10
     *                      /     \
     *                     12      15
                        /    \     /
                     25       30  36

            25 <->12 <-> 30 <->10 <-> 36<->15

     */
    TreeNode head;
       static TreeNode prev = null;
    public static void main(String[] args) {
        BinaryTreeToDoublyLinkList binaryTreeToDoublyLinkList = new BinaryTreeToDoublyLinkList();
        TreeNode root = null;
        root = binaryTreeToDoublyLinkList.insertTree(root);
        binaryTreeToDoublyLinkList.binaryTree2DoubleLinkedList(root);
        binaryTreeToDoublyLinkList.printList(binaryTreeToDoublyLinkList.head);

    }
    void binaryTree2DoubleLinkedList(TreeNode root)
    {
        // Base case
        if (root == null)
            return;

        // Recursively convert left subtree
        binaryTree2DoubleLinkedList(root.left);

        // Now convert this node
        if (prev == null)
            head = root;
        else
        {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        // Finally convert right subtree
        binaryTree2DoubleLinkedList(root.right);
    }

    void printList(TreeNode node)
    {
        while (node != null)
        {
            System.out.print(node.val + " ");
            node = node.right;
        }
    }
}

package tree;

public class BstOrNot {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        return root;
    }

    public static void main(String[] args) {
        BstOrNot bstOrNot = new BstOrNot();
        TreeNode root = null;
        root = bstOrNot.insertTree(root);
       if(bstOrNot.isBST(root)){
           System.out.println("----- bst---");
       }else{
           System.out.println("----- Not Bst---");
       }

    }

    boolean isBST(TreeNode root)  {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean isBSTUtil(TreeNode node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.val < min || node.val > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.val-1) && isBSTUtil(node.right, node.val+1, max));
    }
}

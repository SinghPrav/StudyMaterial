package OldData.OldMaterial.tree;

public class IsBalanced {
    TreeNode root;
    static boolean  isBal = true;
    public static void main(String[] args) {
        IsBalanced tree = new IsBalanced();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.left.left.left = new TreeNode(8);
        isBalanceHeight(tree.root);
        System.out.println("Is balance OldData.OldMaterial.tree: "+isBal);
    }

    /*
    *                   1
    *                 /   \
    *               2          3
    *            /    \
    *          4         5
    *        /
    *      8
    *
    *
    *
    * */
    public static int isBalanceHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = isBalanceHeight(root.left);
        int rh = isBalanceHeight(root.right);
        int gap = Math.abs(lh-rh);
        if(gap>1){
            isBal = false;
        }
        int th = Math.max(lh,rh)+1;
        return th;
    }




}

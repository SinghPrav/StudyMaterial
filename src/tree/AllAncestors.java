package tree;

public class AllAncestors {

    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
       root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(7);
        return root;
    }
    public static void main(String[] args) {
        AllAncestors allAncestors = new AllAncestors();
        TreeNode root = null;
        root = allAncestors.insertTree(root);
        allAncestors.printAllAncestor(root, 7);
    }

    boolean printAllAncestor(TreeNode root, int target){
        if(root == null){
            return true;
        }
        if(root.val == target){
            return true;
        }
       if(printAllAncestor(root.left, target) || printAllAncestor(root.right, target)){
           System.out.println(root.val);
           return  true;
       }
        return  false;
    }
}

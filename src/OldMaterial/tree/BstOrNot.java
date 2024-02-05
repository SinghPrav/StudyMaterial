package OldMaterial.tree;

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
       if(bstOrNot.isBst(root)){
           System.out.println("----- bst---");
       }else{
           System.out.println("----- Not Bst---");
       }

    }

     TreeNode prev = null;
   boolean isBst(TreeNode root){
        if(root == null)
        {
            return  true;
        }

        if(!isBst(root.left)){
            return false;
        }

        if(prev != null && root.val < prev.val ){
            return  false;
        }

        prev = root;

        return isBst(root.right);
   }

}

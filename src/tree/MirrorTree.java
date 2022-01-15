package tree;

public class MirrorTree {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        return root;
    }
    public TreeNode insertMirrorTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    public static void main(String[] args) {
        MirrorTree mirrorTree = new MirrorTree();
        TreeNode root = null;
        TreeNode root1 = null;
        root = mirrorTree.insertTree(root);
        root1 = mirrorTree.insertMirrorTree(root1);
        System.out.println("Is Mirror-> "+mirrorTree.isMirrorTree(root, root1));
    }

    public boolean isMirrorTree(TreeNode root, TreeNode mirror){
        if(root == null && mirror == null){
            return true;
        }
        if( root == null || mirror == null){
            return false;
        }
        boolean isMatch = root.val == mirror.val;
         if(!isMatch){
             return false;
         }
        boolean left = isMirrorTree(root.left, mirror.right);
        boolean right = isMirrorTree(root.right, mirror.left);
        return  left && right;
    }

}

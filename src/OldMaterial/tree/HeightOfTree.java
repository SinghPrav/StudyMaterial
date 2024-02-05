package OldMaterial.tree;

public class HeightOfTree {
    public static void main(String[] args) {
        HeightOfTree heightOfTree = new HeightOfTree();
        TreeNode root = null;
        root = heightOfTree.insertTree(root);
        System.out.println(heightOfTree.getHeight(root));
    }


    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    public int getHeight(TreeNode root){
        if(root == null){
            return -1;
        }
        int leftCount = getHeight(root.left);
        int rightCount = getHeight(root.right);
        if(leftCount < rightCount){
            return rightCount+1;
        }else {
            return leftCount+1;
        }
    }
}

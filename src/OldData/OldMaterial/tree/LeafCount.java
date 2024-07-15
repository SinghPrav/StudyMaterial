package OldData.OldMaterial.tree;

import java.util.ArrayList;
import java.util.List;

public class LeafCount {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    public static void main(String[] args) {
        LeafCount leafCount = new LeafCount();
        TreeNode root = null;
        root = leafCount.insertTree(root);
        List<TreeNode> leafList = new ArrayList<>();
        leafCount.countLeaf(root, leafList);
        for(TreeNode treeNode: leafList){
            System.out.print(treeNode.val+" ");
        }
    }

    public void countLeaf(TreeNode root, List<TreeNode> list){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            list.add(root);
        }
        countLeaf(root.left, list);
        countLeaf(root.right, list);
    }
}

package OldData.OldMaterial.tree;

import java.util.*;

public class PrintBottomView {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(7);
        root.left = new TreeNode(8);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        root.right.left.right = new TreeNode(4);
        root.right.left.right.right = new TreeNode(6);
        root.right.left.right.right.left = new TreeNode(1);
        root.right.left.right.right.right = new TreeNode(5);
        return root;
    }
    /*                      7
                          /   \
                         8     3
                              /
                             2
                              \
           *                    4
                                 \
           *                       6
                                 /    \
           *                    1       5
           T-> 8,7,3,6,5
           B-> 8,2,1,6,5
           * */
    public static void main(String[] args) {
        PrintBottomView printBottomView = new PrintBottomView();
        TreeNode root = null;
        root = printBottomView.insertTree(root);
        printBottomView.showTopView(root);
        printBottomView.showBottomView(root);
    }
    void showTopView(TreeNode root)
    {
        TreeMap<Integer, TreeNode> map = new TreeMap<>();
        topView(root, map, 0);
        for (Map.Entry<Integer, TreeNode> integerTreeNodeEntry : map.entrySet()) {
            System.out.print(integerTreeNodeEntry.getValue().val + " ");
        }
        System.out.println();
    }

    public void topView(TreeNode root, TreeMap<Integer, TreeNode> map, int step){
            if(root == null){
                return ;
            }
            map.putIfAbsent(step, root);
            topView(root.left, map, step-1);
            topView(root.right, map, step+1);
    }

    void showBottomView(TreeNode root)
    {
        TreeMap<Integer, TreeNode> map = new TreeMap<>();
        bottomView(root, map, 0);
        for (Map.Entry<Integer, TreeNode> integerTreeNodeEntry : map.entrySet()) {
            System.out.print(integerTreeNodeEntry.getValue().val + " ");
        }
    }

    public void bottomView(TreeNode root, TreeMap<Integer, TreeNode> map, int step){
        if(root == null){
            return ;
        }
        map.put(step, root);
        bottomView(root.left, map, step-1);
        bottomView(root.right, map, step+1);
    }
}

package tree;

import java.util.*;

public class PrintLeftView {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(10);
        root.left = new TreeNode(12);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.left.right = new TreeNode(6);
        root.right.left.right.left = new TreeNode(18);
        root.right.left.right.right = new TreeNode(7);
        return root;
    }
        /*              10
                     12     3
                       4   5
        *                    6
                           18  7
        *
        *
        * */
    public static void main(String[] args) {
        PrintLeftView printLeftView = new PrintLeftView();
        TreeNode root = null;
        root = printLeftView.insertTree(root);
        printLeftView.showLeftView(root);
    }
    void showLeftView(TreeNode root)
    {
        List<TreeNode> list = new ArrayList<>();
        leftView(root, list, 0);
        list.forEach(i-> System.out.print(i.val+" "));
        System.out.println("***************Right view *******");
        showRightView(root);

    }

    public void leftView(TreeNode root, List<TreeNode> list, int level){
        if(root == null){
            return ;
        }
        if(list.size() <= level){
            list.add(root);
        }
        leftView(root.left, list, level+1);
        leftView(root.right, list, level+1);
    }

    void showRightView(TreeNode root)
    {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        rightView(root, map, 0);
        for (Map.Entry<Integer, TreeNode> integerTreeNodeEntry : map.entrySet()) {
            System.out.print(integerTreeNodeEntry.getValue().val + " ");
        }
    }

    public void rightView(TreeNode root, HashMap<Integer, TreeNode> map, int level){
        if(root == null){
            return ;
        }

            map.put(level, root);

        rightView(root.left, map, level+1);
        rightView(root.right, map, level+1);
    }

}

package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PrintVerticalView {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        return root;
    }

    class Values {
        int max, min;
    }

    public static void main(String[] args) {
        PrintVerticalView printVerticalView = new PrintVerticalView();
        TreeNode root = null;
        root = printVerticalView.insertTree(root);
        printVerticalView.showVerticalView(root);
    }
    void showVerticalView(TreeNode root)
    {
        TreeMap<Integer, List<TreeNode>> map = new TreeMap<>();
        verticalView(root, map, 0);
        for(List<TreeNode> list: map.values()){
            for(TreeNode node : list) {
                System.out.print(node.val+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void verticalView(TreeNode root, TreeMap<Integer, List<TreeNode>> map, int step){
        if(root == null){
            return ;
        }
       /* List<TreeNode> check = map.get(step);
        if (check == null || check.size() <= 0) {
            check = new ArrayList<>();
        }
        check.add(root);
        map.putIfAbsent(step, check);*/
        map.computeIfAbsent(step, k-> new ArrayList<>()).add(root);
        verticalView(root.left, map, step-1);
        verticalView(root.right, map, step+1);


    }
}

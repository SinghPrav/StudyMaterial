package OldMaterial.tree;


import java.util.*;

public class ConnectSameLevelNode {
    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        return root;
    }
    public static void main(String[] args) {
        ConnectSameLevelNode connectSameLevelNode = new ConnectSameLevelNode();
        TreeNode root = null;
        root = connectSameLevelNode.insertTree(root);
        connectSameLevelNode.showSameLevelView(root);
    }
    void showSameLevelView(TreeNode root)
    {
        TreeMap<Integer, List<TreeNode>> map = new TreeMap<>();
        sameLevelView(root, map, 0);
        for(List<TreeNode> list: map.values()){
            for(TreeNode node : list) {
                System.out.print(node.val+" ");
            }
            System.out.print("-> Null");
            System.out.println();
        }
        System.out.println();
    }
    public void sameLevelView(TreeNode root, TreeMap<Integer, List<TreeNode>> map, int step){
        if(root == null){
            return ;
        }
        map.computeIfAbsent(step, k-> new ArrayList<>()).add(root);
        sameLevelView(root.left, map, step+1);
        sameLevelView(root.right, map, step+1);
    }

}

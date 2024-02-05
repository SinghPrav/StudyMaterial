package OldMaterial.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {

    public  class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left=null;
            this.right=null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
       // int keys[] = { 1,2,3,4,5 };
        TreeTraversal treeTraversal = new TreeTraversal();
       /* for(int i=0; i< keys.length; i++){
            root = treeTraversal.insertNode(root, keys[i]);
        }*/
        root = treeTraversal.insertTree(root);
        List<Integer> list = treeTraversal.preorderTraversal(root);
        treeTraversal.printTree(list);
        System.out.println();
        list = treeTraversal.inorderTraversal(root);
        treeTraversal.printTree(list);
        System.out.println();
        list = treeTraversal.postorderTraversal(root);
        treeTraversal.printTree(list);
    }

    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    public void printTree(List<Integer> list){
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
    public  TreeNode insertNode(TreeNode root, int val){
        if(root==null){
            return new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertNode(root.left, val);
        }else if(val > root.val){
            root.right = insertNode(root.right, val);
        }
        return root;
    }



    public List<Integer> inorderTraversal (TreeNode root){
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);
        return ans;
    }
    public  void preorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        nums.add(root.val);
        preorder(root.left, nums);
        preorder(root.right, nums);
    }

    public void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }


    public void postorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        postorder(root.left, nums);
        postorder(root.right, nums);
        nums.add(root.val);
    }
}

package tree;

import java.util.*;

public class TreeZigZag {

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
        TreeZigZag treeZigZag = new TreeZigZag();
       root = treeZigZag.insertTree(root);
        System.out.println("Zigzag traversal is:  ");
        List<List<Integer>> list = treeZigZag.zigZagTraversal(root);
        for(int i=0;i<list.size();i++){
            List<Integer> element = list.get(i);
            System.out.print("[");
            for(int j=0; j< element.size(); j++){
                System.out.print(element.get(j)+" ");
            }
            System.out.print("]");
        }
    }

    public TreeNode insertTree(TreeNode root){
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        return root;
    }

    public List<List<Integer>> zigZagTraversal(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> integerList = new ArrayList<>();
            for(int i=0; i< size;i++){
                TreeNode node = queue.poll();
                if(node !=null) {
                    integerList.add(node.val);
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                }

            }
            flag = !flag;
            if(flag == false){
                Collections.sort(integerList, Collections.reverseOrder());
            }
            list.add(integerList);
        }


        return list;
    }

}

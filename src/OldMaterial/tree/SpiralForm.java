package OldMaterial.tree;

import java.util.*;

public class SpiralForm {
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

    public static void main(String[] args) {
        TreeNode root = null;
        SpiralForm spiralForm = new SpiralForm();
        root = spiralForm.insertTree(root);
        System.out.println("Spiral traversal is:  ");
        List<List<Integer>> list = spiralForm.getSpiralForm(root);
        for(int i=0;i<list.size();i++){
            List<Integer> element = list.get(i);
            System.out.print("[");
            for(int j=0; j< element.size(); j++){
                System.out.print(element.get(j)+" ");
            }
            System.out.print("]");
        }
    }

    public List<List<Integer>> getSpiralForm(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> integerList = new ArrayList<>();
            for(int i=0; i<size;i++){
                TreeNode node = queue.poll();
                if(node!=null){
                    integerList.add(node.val);
                    if(node.left != null){
                        queue.add(node.left);
                    }
                    if(node.right != null){
                        queue.add(node.right);
                    }
                }

            }

            if(!flag){
                Collections.sort(integerList);
            }
            flag = !flag;
            list.add(integerList);
        }

        return list;
    }

    public List<List<Integer>> getSpiralFormFromDqueue(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();

        Deque<TreeNode> dQueue = new ArrayDeque<>();
        dQueue.add(root);
        boolean revrese = true;
        while (!dQueue.isEmpty()){
            int size = dQueue.size();
            List<Integer> integerList = new ArrayList<>();
            if(!revrese){
                for(int i=0; i<size;i++){
                    TreeNode node = dQueue.pollFirst();
                    if (node.left  != null)
                        dQueue.offerLast(node.left);

                    if (node.right != null)
                        dQueue.offerLast(node.right);
                    integerList.add(node.val);
                }

            }else {
                for(int i=0; i<size;i++){
                    TreeNode node = dQueue.pollLast();
                    if(node !=null) {
                        if (node.right != null)
                            dQueue.offerFirst(node.right);

                        if (node.left != null)
                            dQueue.offerFirst(node.left);
                        integerList.add(node.val);
                    }
                }

            }
            revrese = !revrese;
            list.add(integerList);
        }

        return list;
    }



}

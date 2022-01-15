package tree;

public class LowestCommonAncester {
    public static void main(String[] args) {
        int keys[] = { 20, 8, 22, 4, 12, 10, 14};
        TreeNode root = null;
        LowestCommonAncester lowestCommonAncester = new LowestCommonAncester();
        for(int i=0;i< keys.length;i++){
            root = lowestCommonAncester.insertNode(root, keys[i]);
        }
       // lowestCommonAncester.printBst(root);
        int lca =lowestCommonAncester.findLca(root, 10, 14);
        System.out.println("Lec is:-> "+lca);
    }

    public void printBst(TreeNode root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        printBst(root.left);
        printBst(root.right);
    }

    public TreeNode insertNode(TreeNode root, int val){
        if(root == null){
            return  new TreeNode(val);
        }
        if(val < root.val){
            root.left = insertNode(root.left, val);
        }else if(val > root.val){
            root.right = insertNode(root.right, val);
        }
        return  root;
    }

    public int findLca(TreeNode root, int l, int r){
        if(l < root.val && r < root.val){
            return findLca(root.left, l, r);
        }else if(l > root.val && r > root.val){
           return findLca(root.right, l, r);
        }else {
            return root.val;
        }
    }

}

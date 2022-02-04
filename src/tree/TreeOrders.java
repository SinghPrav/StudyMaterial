package tree;

public class TreeOrders {
    TreeNode node;
    public static void main(String[] args) {
        TreeOrders treeOrders = new TreeOrders();
        treeOrders.insertNode();
        System.out.println("********Pre****");
        treeOrders.preOrderNode(treeOrders.node);
        System.out.println();
        System.out.println("********Inorder****");
        treeOrders.inOrderNode(treeOrders.node);
        System.out.println();
        System.out.println("********Postorder****");
        treeOrders.postOrderNode(treeOrders.node);
    }

    public void insertNode(){
        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
    }

    public void preOrderNode(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrderNode(node.left);
        preOrderNode(node.right);
    }

    public void inOrderNode(TreeNode node){
        if(node == null){
            return;
        }
        inOrderNode(node.left);
        System.out.print(node.val+" ");
        inOrderNode(node.right);
    }

    public void postOrderNode(TreeNode node){
        if(node == null){
            return;
        }
        postOrderNode(node.left);
        postOrderNode(node.right);
        System.out.print(node.val+" ");
    }
}

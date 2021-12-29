import java.util.ArrayList;

/**
 * @PackageName:PACKAGE_NAME
 * @ClassName：TreeNodeTest
 * @Description:
 * @author: xin
 * @date: 2020/12/31
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    int level;
    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, int level) {
        this.val = val;
        this.level = level;
    }
}

public class TreeNodeTest {


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        TreeNodeTest treeNodeTest = new TreeNodeTest();
        treeNodeTest.addTreeNode(treeNode,1);
        treeNodeTest.addTreeNode(treeNode,2);
        treeNodeTest.addTreeNode(treeNode,3);
        treeNodeTest.addTreeNode(treeNode,4);
        treeNodeTest.addTreeNode(treeNode,5);

    }


    public TreeNode sequenceTraversal(TreeNode node,int level){

        return null;
    }

    public TreeNode addTreeNode(TreeNode root,int val){
       if (root == null){
           root = new TreeNode(val);
           return root;
       }else {
          root.left=addTreeNode(root.left,val);
          root.right=addTreeNode(root.right,val);
          return root;
       }
    }

    //前序
    public TreeNode preorderTraversal (TreeNode node){
        if (node == null){
            return null;
        }else{
            System.out.println(node.val);
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
        return node;
    }
    //中序
    public TreeNode inorderTraversal(TreeNode node){
        if (node == null) {
            return null;
        }else {
            inorderTraversal(node.left);
            System.out.println(node.val);
            inorderTraversal(node.right);
        }
        return node;
    }

    //后序
    public TreeNode postorderTraversal(TreeNode node){
        if (node == null){
            return null;
        }else {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.println(node.val);
        }
        return node;
    }



}

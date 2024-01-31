package Trees;

public class Tree {
    public static void main(String[] args) {
        // TreeNode drinks = new TreeNode("Drinks");
        // TreeNode hot = new TreeNode("Hot");
        // TreeNode cold = new TreeNode("Cold");

        // TreeNode a = new TreeNode("a");
        // TreeNode b = new TreeNode("b");
        // TreeNode c = new TreeNode("c");

        //  TreeNode d = new TreeNode("d");
        // TreeNode e = new TreeNode("e");
        // TreeNode f = new TreeNode("f");
        // drinks.addChild(cold);
        // drinks.addChild(hot);
        // cold.addChild(a);
        // cold.addChild(b);
        // cold.addChild(c);
        // hot.addChild(d);
        // hot.addChild(e);
        // hot.addChild(f);

        // System.out.println(drinks.print(1));

        BinaryTreeLL binaryTree = new BinaryTreeLL();
        BTNode n1 = new BTNode();
        n1.value = "n1";

        // Create and initialize n2 through n9
        BTNode n2 = new BTNode();
        n2.value = "n2";

        BTNode n3 = new BTNode();
        n3.value = "n3";

        BTNode n4 = new BTNode();
        n4.value = "n4";

        BTNode n5 = new BTNode();
        n5.value = "n5";

        BTNode n6 = new BTNode();
        n6.value = "n6";

        BTNode n7 = new BTNode();
        n7.value = "n7";

        BTNode n8 = new BTNode();
        n8.value = "n8";

        BTNode n9 = new BTNode();
        n9.value = "n9";

        n1.left =n2;
        n1.right=n3;
        n2.left=n4;
        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        n4.left=n8;
        n4.right=n9;
        binaryTree.root=n1;
        //binaryTree.preOrder(binaryTree.root);
       // binaryTree.inOrder(binaryTree.root);
      // binaryTree.postOrder(binaryTree.root);
      binaryTree.levelOrder();

       

    }
   

    
    

}

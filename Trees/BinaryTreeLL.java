package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BTNode root;
    public BinaryTreeLL(){
        this.root = null;
    }
    void preOrder(BTNode node){
        if(node ==null){
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);   // - > O(n/2)
        preOrder(node.right);
    }

    void inOrder(BTNode node){
        if(node ==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
      
        inOrder(node.right);
    }

    void postOrder(BTNode node){
        if(node ==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    void levelOrder(){
        Queue <BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BTNode node = queue.remove();
            System.out.print(node.value+ " ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }

        }
    }
}

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
        System.out.println();
    }

    void insert(String value){
        BTNode newNode = new BTNode();
        newNode.value= value;
        if(root==null){
            root = newNode;
            System.out.println("node inserted");
            return;
        }
        Queue <BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BTNode node = queue.remove();
           
            if(node.left!=null){
                queue.add(node.left);
            }else{
                node.left=newNode;
                return;
            }
            if(node.right!=null){
                queue.add(node.right);
            }else{
                node.right=newNode;
                return;
            }

        }

    }
    void deleteNode(String key){
        Queue <BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BTNode node = queue.remove();
          if(node.value==key){
            BTNode temp = findDeepestNode();
            deleteDeepestNode();
            node.value=temp.value;  
            System.out.println("Node deleted");
                return;
          }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }

        }
        System.out.println("Node not found");
    }

   private  BTNode findDeepestNode(){
        BTNode node = null;
        Queue <BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while(!queue.isEmpty()){
             node = queue.remove();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }

        }
        return node;
    }

   private  void deleteDeepestNode(){
        BTNode currnode =null,prevnode=null;
        Queue <BTNode> queue = new LinkedList<BTNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            prevnode = currnode;
             currnode = queue.remove();
            
            if(currnode.left==null){  // if next left node is null that means previus right node was the deepest 
               prevnode.right=null;
               break;
            }
            if(currnode.right==null){
               prevnode.left=null;
               break;
            }
            queue.add(currnode.left);
            queue.add(currnode.right);

        }
    }

    
}

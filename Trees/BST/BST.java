package Trees.BST;

import java.util.LinkedList;
import java.util.Queue;

import Trees.BTNode;

public class BST {
    BSTnode root ;
    BST (){
        root = null;
        System.out.println("BST created!!");
    }

    private BSTnode insert(BSTnode currNode,int value){
        if(currNode==null){
            BSTnode node = new BSTnode();
            node.value=value;
            System.out.println("Node inserted!!");
            return node;
        }
        else if(value<=currNode.value){
            currNode.left=insert(currNode.left, value);
            return currNode;
        }else{
            currNode.right=insert(currNode.right, value);
            return currNode;
        }
    }

    public void insert(int value){
       root =  insert(root, value);
    }
    void preOrder(BSTnode node){
        if(node == null )
        return;
        System.out.println(node.value+" - ");
        preOrder(node.left);
        preOrder(node.right);

    }
    void inOrder(BSTnode node){
        if(node == null )
        return;
        inOrder(node.left);
        System.out.println(node.value+" - ");  
        inOrder(node.right);

    }
    void postOrder(BSTnode node){
        if(node == null )
        return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+" - ");  

    }

       void levelOrder(){
        Queue <BSTnode> queue = new LinkedList<BSTnode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BSTnode node = queue.remove();
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

    /**
     * Gives the successor of the ToBeDeleted Node 
     * successor is the min node in the right sub tree
     * @param node
     * @return
     */

    public BSTnode getSuccessor(BSTnode root){ // this root is the root of the right sub tree of the caller function
            if(root.left==null)  // minimum element can be found in left sub tree 
            return root;
            else
            return getSuccessor(root.left);  // recursively find the min left node 
    }

    public BSTnode delete(BSTnode root,int key){
        if(root == null){
            System.out.println("Element to be deleted not found!");
            return null;
        }
         if(key > root.value){
            root.right = delete(root.right,key); // recursively travels through the tree to find the eleement 
        }else if (key<root.value)
          root.left = delete( root.left, key);
          else{  // element found 
                //case 1  if the node to be deleted has 2 children 
                if(root.left!=null && root.right!=null){
                    BSTnode temp = root;
                    BSTnode successor = getSuccessor(temp.right); // passing right subtree bcox we want min element in the right subtree
                    root.value = successor.value;         //  root deleted 
                    root.right = delete(root.right, successor.value);
                }
                //case 2 ,, 1 child present 
                else if(root.left!=null){
                    root=root.left;
                }else if (root.right!=null){
                    root=root.right;
                }else{
                    root = null;
                }
          }
          return root;
    }
}

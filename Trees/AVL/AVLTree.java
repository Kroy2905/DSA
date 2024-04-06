package Trees.AVL;

import java.util.LinkedList;
import java.util.Queue;

import Trees.BST.BSTnode;

public class AVLTree {
    BSTnode root;
    AVLTree(){
        root = null;
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


    public int getHeight(BSTnode node){
        if(node == null)
        return 0;
        return node.height;
    }
    private BSTnode rotateRight(BSTnode node){
        BSTnode newNode = node.left;
        node.left =  node.left.right;
        newNode.right = node;
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        newNode.height = 1 + Math.max(getHeight(newNode.left),getHeight(newNode.right));
        return newNode;

    }

    private BSTnode rotateLeft(BSTnode node){
        BSTnode newNode = node.right;
        node.right =  node.right.left;
        newNode.left = node;
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        newNode.height = 1 + Math.max(getHeight(newNode.left),getHeight(newNode.right));
        return newNode;

    }

    public int getBalance(BSTnode node){
        if(node ==null)
        return 0;
        return getHeight(node.left) - getHeight(node.right);
    }
    

    // insert method :: 
     private BSTnode insertNode(BSTnode node , int value){
        if(node == null ){
            BSTnode newNode = new BSTnode();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        }else if (value<node.value){
            node.left = insertNode(node.left, value);
        }else{
            node.right = insertNode(node.right, value);
        }
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        int balance = getBalance(node);
        if(balance>1 && value< node.left.value){ // LL condition
         return rotateRight(node);
        }
         if(balance >1 && value > node.left.value){ // LR 
            node.left = rotateLeft(node.left);
            return rotateRight(node);
           }
           if(balance < -1  && value > node.right.value){ //RR
            
            return rotateLeft(node);
           }
           if(balance < -1 && value < node.left.value){  //RL
            node.right = rotateRight(node.right);
            return rotateRight(node);
           }
           return node;
     }

  public void insert (int value ){
    root = insertNode(root, value);
  }
  //get minimum node 
   public BSTnode minimumNode(BSTnode node){
        if(node == null){
            return node;
        }
        return minimumNode(node.left);
   }
     private  BSTnode deleteNode(BSTnode node,int value){
        if(node == null){
            System.out.println("Value not found");
            return node;
        }
        if(value<node.value){
            node.left = deleteNode(node.left, value);
        }
        else if(value>node.value){
            node.right = deleteNode(node.right, value);
        }
        else{ // value found 
         if(node.left !=null && node.right!=null){  // 2 child condition 
            BSTnode temp = root;
            BSTnode successor = minimumNode(temp.right); // passing right subtree bcox we want min element in the right subtree
            node.value = successor.value;         //  root deleted 
            node.right = deleteNode(node.right, successor.value);
         }
         else if (node.left!=null){ // 1 child ocndition 
            node = node.left;
         }
         else if(node.right!=null){ //1 child condirion 
            node= node.right;
         }else{       // no child condition 
            node=null;
         }
        }
        int balance = getBalance(node);
        if(balance>1 && getBalance(node.left)>=0){  //LL
            return rotateRight(node);
        }
        if(balance>1 && getBalance(node.left)<0) { //LR
                node.left = rotateLeft(node.left);
              return  rotateRight(node); 
        } 
        if(balance <-1 && getBalance(node.right)<=0){ //RR
            return rotateLeft(node);
        }
        if(balance <-1 && getBalance(node.right)>0){  //RL
           node.right = rotateRight(node.right);
           return rotateLeft(node);
        } 
         return node;
     }

     public void delete(int value){
        root = deleteNode(root, value);
     }


    


}

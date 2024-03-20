package Trees;

/**
 * This is binary tree representation using arrays 
 */
public class BinaryTreeAA {
    String [] arr;
    int lastUsedIndex;

     public  BinaryTreeAA(int size){
        arr = new String[size+1];  // size+1 because we will not be using 0th index for better understanding and calculation 
        lastUsedIndex=0;
        System.out.println("Binary tree created with length"+size);
    }

    public boolean isTreeFull(){
        if(arr.length-1 == lastUsedIndex)
        return true;
        return false;
    }
    void insert(String s){
        if(!isTreeFull()){
            arr[lastUsedIndex+1]=s;
            lastUsedIndex++;
            System.out.println("Element inserted");
        }else{
            System.out.println("Overflow state !! ");
        }
    }
    void preOrder(int index){
        if(index>lastUsedIndex){
            return;
        }
        System.out.println(arr[index]);
        preOrder(2*index);
        preOrder(2*index+1);
    }
    void inOrder(int index){
        if(index>lastUsedIndex){
            return;
        }
        inOrder(2*index);    
        System.out.println(arr[index]);     
        inOrder(2*index+1);
    }

    void postOrder(int index){  // T(n) = O(n) , S(n)= O(n)
        if(index>lastUsedIndex){
            return;
        }
        postOrder(2*index);
        postOrder(2*index+1);
        System.out.println(arr[index]);   
    }
    void levelOrder(){  // T(n) = O(n) , S(n)= O(n)
       for(int i =1;i<=lastUsedIndex;i++){
        System.out.println(arr[i]);
       }
    }
    /**
     * logic for deleting : 
     * lastusedIndex is the deepest node , just replace the value of the deepest node with the to be deleted node 
     * delete the last node by reducing the value of lastUsedIndex
     * @param key
     */
    void deleteNode(String key){
        for(int i =1;i<=lastUsedIndex;i++){
            if(arr[i].equals(key)){   
                arr[i] = arr[lastUsedIndex];
                lastUsedIndex--;
                System.out.println("Element deleted !!");
                return;
            }
        }
        System.out.println("No such elelment found !!");
    }
}

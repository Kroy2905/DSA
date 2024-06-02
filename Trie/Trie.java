package Trie;

public class Trie {
    
    private TrieNode root;
    public Trie(){
        root = new  TrieNode();
        System.out.println("Trie created !! ");
    }
    public void insert(String word){  // Time complexity = O(n) , Space = O(n)
        TrieNode currNode = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = currNode.children.get(ch); //if char to be inserted does not exist , then add it 
            if(node==null){
                node = new TrieNode();
                currNode.children.put(ch, node);
            }
            currNode = node;
        }
        currNode.endOfString=true;
        System.out.println( word + " inserted ");
    }


    public boolean search(String word){  // Time complexity = O(n) , Space = O(1)
        TrieNode currNode = root;
        for(int i =0;i<word.length();i++){
            char ch = word.charAt(i);
            TrieNode node = currNode.children.get(ch); 
            if(node==null){
                System.out.println( word + " does not exist !! ");
                return false;
            }
            currNode = node;
        }
        if(currNode.endOfString){
            System.out.println( word + " exist !! ");
            return true;
        }
        System.out.println( word + " does not exist but is a prefix of another string !! ");
       return false;
    }

    /**
     * 
     * @param parentNode
     * @param word
     * @param index
     * @return boolean
     * 
     * This function recursively checks if a chracter should be deleted or not 
     * It  begins with 1st character and goes all the way to last character 
     * It handles 4 cases deletion cases ; ex -  word  to be deleted API
     * 1- A prefix is common for another word ,ex - APT or APPLE , A,P are skipped and not deleted 
     * 2 - API as a whole is a prefix of another word ,ex - APIS , the end of string is changed 
     * 3 - An entire word is a part of API and should not be deleted , ex AP 
     * 4 - no  matching  characters 
     */
    private boolean  delete(TrieNode parentNode,String word,int index){ // Time - O(n) , Space - o(1)
            char ch = word.charAt(index);
            TrieNode currNode = parentNode.children.get(ch);
            boolean canThisNodeBeDeleted;
            // Case 1 : Some other prefix of string is same as the one we want to delete (prefix are same) ; API, APPLE
            if(currNode.children.size()>1) {  // This means its a prefix and this is the junction point 
                delete(currNode,word,index+1);// The juncion node is not deleted , rather next index is passed recursively
                return false;  //not deleting the node 
            }

            // Case 2 : The string is a prefix of another string 
            if(index == word.length()-1){  // at the end of the word
                 if(currNode.children.size()>1)    {  // entire word is a prefix condition  - API,APIS
                        currNode.endOfString = false;  //the prefix word is  no more a complete word 
                        return false;  //not deleting the node 
                 } else{  // end of word & the character is not a prefix APIT , APIS
                        parentNode.children.remove(ch);
                        return true;
                 }
            }

         //Case 3 : Other string is the prefix of this string : APIS , AP (imagine the trie)
         if(currNode.endOfString==true){
            delete(currNode,word,index+1);
            return false;
         }


         //Not any node depends on this string 
         canThisNodeBeDeleted =    delete(currNode,word,index+1);
         if(canThisNodeBeDeleted){
            parentNode.children.remove(ch);
            return true;
         }else{
            return false;
         }
                
    }
    public void delete(String word){
        if(search(word)){
            delete(root,word,0);
            System.out.println(word + " deleted !!");
        }
    }
}
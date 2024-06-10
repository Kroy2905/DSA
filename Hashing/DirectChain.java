package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChain {
    LinkedList<String>[] hashtable;
    final int maxSize = 5;


    public DirectChain(int n ){

        hashtable = new LinkedList[n];

    }
    
    private int modASCII(String word, int M){   // hash function
       char ch[];
       ch = word.toCharArray();
       int sum,i;
       for(i=0,sum=0;i<word.length();i++){
            sum += ch[i];
       }
       return sum%M;
    }

    public void inserthashTable(String word){
        int index = modASCII(word,hashtable.length);
        if(hashtable[index]==null){
            hashtable[index] = new LinkedList<String>();
           
        }
        hashtable[index].add(word); 
       
    }
 
    public void displayHashtable(){
        for(int i=0;i<hashtable.length;i++){
          
                System.out.println("key = " + i + "  value = " + hashtable[i]);
            
        }

    }
    public boolean searchHashtable(String word){
        int index = modASCII(word,hashtable.length);
        if(hashtable[index]==null){
            System.out.println(word + " not found!!");
            return false;
        }else{
            System.out.println(word + " found!!");
            return true;
        }
    }
    public void deleteHashtable(String word){
        int index = modASCII(word,hashtable.length);
        if(searchHashtable(word)){
            hashtable[index].remove(word);
            System.out.println(word + " deleted!!");
        }
        else{
            System.out.println(word + " not found!!");
        }
    }
}

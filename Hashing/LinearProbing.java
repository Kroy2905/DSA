package Hashing;

import java.util.ArrayList;
import java.util.LinkedList;


public class LinearProbing {

    String [] hashtable;
    int usedCellNumber;
    

    public LinearProbing(int n ){
        hashtable = new String[n];
        usedCellNumber = 0;
    }

    public double getLoadFactor(){
        return (double)(usedCellNumber* 1.0) /hashtable.length;
    }
    public void rehashKeys(String word){
        usedCellNumber = 0;
        ArrayList<String> data  = new ArrayList<String>();
        for(String s : hashtable){
            if(s!=null){
                data.add(s);
            }
        }
        data.add(word);
        hashtable = new String[hashtable.length*2]; // increasing the length of the hash table by 2 
        for(String s : data){
            inserthashTable(s);
    }
}
    public void inserthashTable(String word){
        if(getLoadFactor()>0.75){  // this is as per Java documentation
            rehashKeys(word);
        }else{
            int index = modASCII(word,hashtable.length);
            while(hashtable[index]!=null){
                System.out.println(index + "already occupied, Trying next index");
                index = (index+1)%hashtable.length;
            }
            hashtable[index] = word;
            System.out.println(word + "inserted !!");
            usedCellNumber++;
        }

    }
    public boolean searchHashtable(String word){
        int index = modASCII(word,hashtable.length);
        for(int i = index; i <  index + hashtable.length; i++){
            int newIndex = i % hashtable.length;
            if( hashtable[newIndex]!= null && hashtable[newIndex].equals(word)){
                System.out.println(word + " found!!");
                return true;
            }
        }
        System.out.println(word + " not found!!");
        return false;
    }

    public void deleteHashtable(String word){
        int index = modASCII(word,hashtable.length);
        for(int i = index; i < index + hashtable.length; i++){
            int newIndex = i % hashtable.length;
            if( hashtable[newIndex]!= null && hashtable[newIndex].equals(word)){
                hashtable[index] = null;
                System.out.println(word + " deleted!!");
                return;
            }
        }
        System.out.println(word + " not found!!");
       
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
     public void displayHashtable(){
        for(int i=0;i<hashtable.length;i++){
          
                System.out.println("key = " + i + "  value = " + hashtable[i]);
            
        }
     }
 
   
    
}
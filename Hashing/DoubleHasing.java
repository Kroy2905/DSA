package Hashing;

import java.util.ArrayList;

public class DoubleHasing {


    String [] hashtable;
    int usedCellNumber;
    

    public DoubleHasing(int n ){
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
        hashtable = new String[hashtable.length*2];
        for(String s : data){
            inserthashTable(s);
    }
}
    public void inserthashTable(String word){
        if(getLoadFactor()>0.75){
            rehashKeys(word);
        }else{
            int index = modASCII(word,hashtable.length);
            int counter = 3;
            while(hashtable[index]!=null){
                System.out.println(index + "already occupied, Trying next index");
                index = (index+(counter*counter))%hashtable.length;
                counter++;
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

     private int addAllDigits(int temp){
        int sum = 0;
        while(temp>0){
            sum += temp%10;
            temp = temp/10;
        }
        return sum;
     }
 
 
    
}

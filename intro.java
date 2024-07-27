/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class intro
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println("Hello World");
		intro obj = new intro();
		System.out.println(intro.longestPalindrome("ac"));

	}
	public static  String longestPalindrome(String s) {
        int n = s.length();
        String str = s;
        int result = s.charAt(0);
        int i = 1 , x = 0  , y = 0 , max = Integer.MIN_VALUE;
        while(i<n){
            System.out.println( "i = "+i);           
            int s1 = i-1, l=i+1; 
            while(s1>=0 && l <n && i< n){

           System.out.println("s1 = "+s1+ " l = " + l + " x = "+ x + "y = "+y+ "i  = "+i);
                if(str.charAt(s1) == str.charAt(l)){
                    System.out.println("entered 1 ");
                    
                    if(l-s1 > max){
                        max = l-s1;
                        x = s1; 

                        y = l;
                        s1--;
                        l++;
                        i = l;
                    }else{
						i++;
					}
            }
                else if(str.charAt(s1) == str.charAt(i)){
                      System.out.println("entered 2");
                    if(1 > max){
                        x = s1;
                        y = i;
                        l = n;
                        max = 1;
                       
                    } 
					i++;
                    
                }
                  else if(str.charAt(l) == str.charAt(i)){
                     System.out.println("entered 3 ");
                    if(1 > max){
                        x = i;
                        y = l;
                        l = n;
                        max = 1;
                       
                    }
					i++;
                    
                }
                else{
                 
                 i++;
                
               
                }
            }
        }
         return str.substring(x,y+1);
    }
            

}

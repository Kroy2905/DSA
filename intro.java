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
        int arr[] = {-3,-2,-1,0,0,1,2,3};
		System.out.println(intro.fourSum(arr, 0));

	}

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
           Map <List<Integer>,Integer> map1 = new HashMap<>();
            Map <Integer,Integer> map2 = new HashMap<>();
        for(int i = 0;i<n-3;i++){
            System.out.println ("i = "+i);
            for(int j = i+1;j<n-2;j++){
                     System.out.println ("j= "+j);
                for(int k = j+1;k<n-1;k++){
                         System.out.println ("k = "+k);
                    for(int l = k+1;l<n;l++){
                             System.out.println ("l = "+l);
                        if(nums[i]+nums[j]+nums[k]+nums[l] == target ){
                                 System.out.println ("Entered ");
                        
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);  
                     list.add(nums[l]);   
                     if(!map1.containsKey(list)){
                            map1.put(list,0);
                          res.add(list);
                     }
                    
                     
                        }
                    }
                }
            }
        }

        return res;
        
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

package Recursion;
public class RecursionProblems {
    
	public static void main (String[] args) throws java.lang.Exception
	{   RecursionProblems s = new RecursionProblems();;
		//System.out.println(s.sumOfDigits(2139));
    		System.out.println(s.decimalToBinary(13));

	}
    /**
     * This is used to find the sum of digits of a positive no. using recursion 
     * @param n
     * @return
     */
    private long sumOfDigits(long n ){
       // long sum = 0;
        if(n<0)
        return -1;
        else if (n==0)
        return n;
        else{
          return (n%10)+ sumOfDigits(n/10);
        }

    }
   /**
    * 
    * @param a
    * @param n
    * @return pow(a,n) using recursion
    */
     private long power(int a ,int n  ){
       // long sum = 0;
        if(n<0)
        return -1;
        else if (n==0 || n==1)
        return 1;
        else{
          return a*power(a,n-1);
        }

    }
    /**
     * 
     * @param a   smaller element 
     * @param b   bigger parm
     * @return      gcd using recursion 
     */
    private long GCD(int a, int b){
       if(a == 0)
        return b;
        else 
        return GCD(b%a,a);  // Euclidean algo or Division method 
        
    }
    private long decimalToBinary(int n){
         if(n == 1 )
    return 1 ;
    else
    return (n%2)+ (10*decimalToBinary(n/2));
    }
   
}

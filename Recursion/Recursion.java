package Recursion;
public class Recursion {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//System.out.println("Hello World");
        Recursion r = new Recursion();
        System.out.println(r.fibonacci(1));
       // recursionMethod(5);
        
	}

      int fibonacci(int n ){

        if(n==1)
        return 1;
        if(n<=0)
        return 0;
        else{
            // System.out.println(n);
            return fibonacci(n-1)+fibonacci(n-2);
        }

    }
    int factorial(int n ){
        if(n<0){
            return -1;
        }
        if(n==1 || n==0)
        return 1;
        else{
             System.out.println(n);
            return n*factorial(n-1);
        }

    }

    static void recursionMethod(int n ){
        if(n<1){
            System.out.println("n is less than 1");
        }else{
            recursionMethod(n-1);
            System.out.println(n);
        }
        
    }
}

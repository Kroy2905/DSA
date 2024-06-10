package Recursion;
public class Recursion {
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//System.out.println("Hello World");
        Recursion r = new Recursion();
        System.out.println(r.fibonacci(1));
       // recursionMethod(5);
       r.dummy(0);
        
	}
    void dummy(int j ){


    for(int i=j;i<3;i++){
        System.out.println(i+" ");
        dummy(j+1);

    }
}

void dummy2(int n){


    for(int i=1;i<n;i++){
        for(int j = 1;j<i;j++){
}
    }
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

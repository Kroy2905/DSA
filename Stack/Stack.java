package Stack;

public class Stack {
    
    public static void main(String[] args) {
        StackA stack = new StackA(10);   
                 System.out.println(stack.isEmpty());
     
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.traversall();
        stack.pop();
        stack.pop();
        stack.traversall();
          stack.pop();
        stack.pop();
        stack.pop();

         stack.push(10);
        stack.push(11);
         stack.traversall();
        System.out.println(stack.peek());


        //  StackL stack = new StackL();   
        //          System.out.println(stack.isEmpty());
     
        // stack.push(10);
        // stack.push(11);
        // stack.push(12);
        // stack.push(13);
        // stack.traverse();
        // stack.pop();
        // stack.pop();
        // stack.traverse();
        // System.out.println(stack.peek().value);


        
    }
}

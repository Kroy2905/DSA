package Heap;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(8);
        heap.insert(5, "Min");
        heap.levelOrder();
        heap.insert(10, "Min");
        heap.levelOrder();
        heap.insert(40, "Min");
        heap.levelOrder();
        heap.insert(20, "Min");
        heap.levelOrder();
        heap.insert(50, "Min");
        heap.levelOrder();
        heap.insert(30, "Min");
        heap.levelOrder();
        heap.insert(2, "Min");
        heap.levelOrder();
       System.out.println( heap.extractHeadofHeap("Min"));
       heap.levelOrder();

    }
}

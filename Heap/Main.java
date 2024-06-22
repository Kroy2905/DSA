package Heap;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap(8);
        heap.insert(1, "Min");
        heap.levelOrder();
        heap.insert(5, "Min");
        heap.levelOrder();
        heap.insert(7, "Min");
        heap.levelOrder();
        heap.insert(3, "Min");
        heap.levelOrder();
        heap.insert(4, "Min");
        heap.levelOrder();
        heap.insert(6, "Min");
        heap.insert(8, "Min");
        heap.insert(10, "Min");
        heap.levelOrder();
        // heap.insert(2, "Min");
        // heap.levelOrder();
    //    System.out.println( heap.extractHeadofHeap("Min"));
    //    heap.levelOrder();

    }
}

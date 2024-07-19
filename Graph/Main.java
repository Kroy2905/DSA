package Graph;
/**
 * 
 *    n0 A  ----- n1 B
 *   | \            \         
 *   |    \          n4 E  ---> graph to be created 
 *   |       \    /
 *   n2 C-----  n3 D
 * 
 * 
 * 
 *    A
     /|\
    B C D
    |  |\
    E  F G
     \ |/
      G

 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();
        nodes.add(new GraphNode("A",0));
        nodes.add(new GraphNode("B",1));
        nodes.add(new GraphNode("C",2));
        nodes.add(new GraphNode("D",3));
        nodes.add(new GraphNode("E",4));
        // nodes.add(new GraphNode("F",5));
        // nodes.add(new GraphNode("G",6));
       // GraphM g = new GraphM(nodes);
         GraphL g = new GraphL(nodes);
        
        g.addUndirectedEdge(0,1);  // A - B
        g.addUndirectedEdge(0,2);  // A - C
        g.addUndirectedEdge(0,3);  // A - D
        g.addUndirectedEdge(1,4);  // B - E
        g.addUndirectedEdge(2,3);  // C - D
        g.addUndirectedEdge(3,4);  // D - E
        // g.addUndirectedEdge(3,5);  // D - F
        // g.addUndirectedEdge(4,6);  // E - G
        // g.addUndirectedEdge(5,6);  // F - G
       
        g.dfs();
      
        System.out.println(g.toString());
       
      //g.bfs();
      
    

    }

}

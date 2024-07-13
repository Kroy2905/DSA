package Graph;
/**
 * 
 *    n0 A  ----- n1 B
 *   | \            \         
 *   |    \          n4 E  ---> graph to be created 
 *   |       \    /
 *   n2 C-----  n3 D
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
       // GraphM g = new GraphM(nodes);
        GraphL g = new GraphL(nodes);

        g.addUndirectedEdge(0,1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(3, 4);
      
        System.out.println(g.toString());
    

    }

}

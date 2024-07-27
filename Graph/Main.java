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
      H

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
        nodes.add(new GraphNode("F",5));
        nodes.add(new GraphNode("G",6));
       // nodes.add(new GraphNode("H",7));
        // GraphM g = new GraphM(nodes);
         GraphL g = new GraphL(nodes);
        
        // g.addUndirectedEdge(0,1);  // A - B
        // g.addUndirectedEdge(0,2);  // A - C
        // g.addUndirectedEdge(0,3);  // A - D
        // g.addUndirectedEdge(1,4);  // B - E
        // g.addUndirectedEdge(2,3);  // C - D
        // g.addUndirectedEdge(3,4);  // D - E
        // g.addUndirectedEdge(3,5);  // D - F
        // g.addUndirectedEdge(4,6);  // E - G
        // g.addUndirectedEdge(5,6);  // F - G

        /**
         * // TOPOLOGICAL SORT STARTS
         * Below graph is used for topological sort
         * 
     A      B
     |    / | 
     v  <   v   
     C      D   
      \     |   
       v    |  
       E    | 
      / \  / 
    v   v v  
    H    F   
         |      
         v      
         G      

         */
      //   g.addDirectededge(0,2);
      //   g.addDirectededge(2,4);
      //   g.addDirectededge(4,7);
      //   g.addDirectededge(4,5);
      //   g.addDirectededge(5,6);
      //   g.addDirectededge(1,2);
      //   g.addDirectededge(1,3);
      //   g.addDirectededge(3,5);
       
      //  // g.dfs();
      
      //   System.out.println(g.toString());
      //   g.topologicalSort();
       
      // //g.bfs();
      // TOPOLOGICAL SORT ENDS 


      //SSSPP using list 

      /**
    (A)------(B)
     |          |\
     |          | \
     |          |  \
     |          |   \
    (C)------(D)  (G)
     |          |   /
     |          |  /
     |          | /
     |          |/
    (E)-------(F)  
       */
      g.addDirectededge(0,1);
      g.addDirectededge(0,2);
      g.addDirectededge(1,6);
      g.addDirectededge(1,3);
      g.addDirectededge(2,3);
      g.addDirectededge(2,4);
      g.addDirectededge(3,5);
      g.addDirectededge(4,5);
      g.addDirectededge(4,6);
   
      g.BFSForSSSPP(nodes.get(0));


      
    

    }

}

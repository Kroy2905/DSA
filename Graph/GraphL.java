package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Koustav Roy
 * This class is used to create a graph using adjacency list 
 */
public class GraphL {

    // For printing Graph to the console
    public ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public GraphL(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }
    public void  addUndirectedEdge(int i , int j ){
        nodeList.get(i).neighbors.add(nodeList.get(j));
        nodeList.get(j).neighbors.add(nodeList.get(i));
    }

  public String toString() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
      for (int j =0; j < nodeList.get(i).neighbors.size(); j++) {
        if (j == nodeList.get(i).neighbors.size()-1 ) {
          s.append((nodeList.get(i).neighbors.get(j).name) );
        } else {
          s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
        }
      }
      s.append("\n");
    }
    return s.toString();
  }

    
}

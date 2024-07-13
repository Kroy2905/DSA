package Graph;
/**
 * @author Koustav Roy
 * This class is used to create a graph using adjacent matrix
 */
import java.util.ArrayList;
public class GraphM {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjMatrix;
    public GraphM(ArrayList<GraphNode> nodes) {
        this.nodeList = nodes;
        this.adjMatrix = new int[nodes.size()][nodes.size()];
       
    }
    public void addUndirectedEdge(int i, int j) {
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }
 // For printing Graph to the console

 public String toString() {
    StringBuilder s = new StringBuilder();
    s.append("   ");
    for (int i = 0; i < nodeList.size(); i++) {
        s.append(nodeList.get(i).name + ": ");
    }
    s.append("\n");
    

    for (int i = 0; i < nodeList.size(); i++) {
      s.append(nodeList.get(i).name + ": ");
       for (int j = 0; j < nodeList.size(); j++) {
        s.append(adjMatrix[i][j] + " ");
      }
    
      
      s.append("\n");
    }
    return s.toString();
  }


}

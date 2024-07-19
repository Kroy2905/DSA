package Graph;
/**
 * @author Koustav Roy
 * This class is used to create a graph using adjacent matrix
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

  // find the neighbor vertices 
    // get Neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node) {
      ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
      int nodeIndex = node.index;
      for (int i=0; i<adjMatrix.length; i++) {
        if(adjMatrix[nodeIndex][i]==1) {
          neighbors.add(nodeList.get(i));
        }
      }
      return neighbors;
  
    }

    // BSF internall
  void bfsVisit(GraphNode node) {
    LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
    queue.add(node);
    while(!queue.isEmpty()) {
      GraphNode currentNode = queue.remove(0); // FIFO
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
      for (GraphNode neighbor: neighbors) {
        if (!neighbor.isVisited) {
          queue.add(neighbor);
          neighbor.isVisited = true;  // neighbors are visited
        }
      }
    }
  }

  public void bfs() {
    for (GraphNode node : nodeList) {
      if(!node.isVisited) {
        bfsVisit(node);
      }
    }
  }

  void dfsVisit(GraphNode node) {
    Stack<GraphNode> stack = new Stack<>();
    stack.push(node);
    while(!stack.isEmpty()) {
      GraphNode currentNode = stack.pop();
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
      for (GraphNode neighbor : neighbors) {
        if (!neighbor.isVisited) {
          stack.push(neighbor);
          neighbor.isVisited = true;
        }
      }

    }
  }

  void dfs() {
    for (GraphNode node : nodeList) {
      if(!node.isVisited) {
        dfsVisit(node);
      }
    }
  
  }

}

package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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
  void bfsVisit (GraphNode node) {
    LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
    queue.add(node);
    while(!queue.isEmpty()){
      GraphNode curNode = queue.remove(0);
      curNode.isVisited = true;
      System.out.print(curNode.name + " ");
      for(GraphNode neighbor : curNode.neighbors){
        if(!neighbor.isVisited){
          queue.add(neighbor);
          neighbor.isVisited = true;
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
    while (!stack.isEmpty()) {
      GraphNode currentNode = stack.pop();
      currentNode.isVisited = true;
      System.out.print(currentNode.name + " ");
      for (GraphNode neighbor : currentNode.neighbors) {
        if (!neighbor.isVisited) {
          stack.push(neighbor);
          neighbor.isVisited=true;
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

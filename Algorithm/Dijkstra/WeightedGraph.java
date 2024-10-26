package Algorithm.Dijkstra;

import java.util.*;

public class WeightedGraph {
  ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

  public WeightedGraph(ArrayList<WeightedNode> nodeList) {
    this.nodeList = nodeList;
  }

   void dijkstra(WeightedNode node) {
    // Create a priority queue to hold the nodes based on their distance.
    PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
    
    // Set the distance of the starting node to 0 (indicating it's the source).
    node.distance = 0; 
    
    // Add all nodes to the priority queue initially.
    queue.addAll(nodeList);
    
    // Loop until the priority queue is empty, indicating all nodes have been processed.
    while(!queue.isEmpty()) {
        // Remove the node with the smallest distance from the queue (the current shortest path).
        WeightedNode currentNode = queue.remove();
        
        // Iterate over all neighbors of the current node.
        for (WeightedNode neighbor : currentNode.neighbors) {
            // Check if the neighbor is still in the queue (not fully processed yet).
            if(queue.contains(neighbor)) {
                // Calculate the new possible distance to the neighbor through the current node.
                int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
                
                // If the new calculated distance is shorter than the currently known distance:
                if (neighbor.distance > newDistance) {
                    // Update the neighbor's distance with the new shorter distance.
                    neighbor.distance = newDistance;
                    
                    // Update the parent of the neighbor to the current node for path tracking.
                    neighbor.parent = currentNode;
                    
                    // Refresh the neighbor in the queue by removing and re-adding it 
                    // to ensure it is re-sorted based on the updated distance.
                    queue.remove(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    // Print the distance and path from the source for each node in the graph.
    for (WeightedNode nodeToCheck : nodeList) {
        System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
        
        // Print the path to reach this node from the source.
        pathPrint(nodeToCheck);
        
        System.out.println();
    }
}


  public static void pathPrint(WeightedNode node) {
   if (node.parent  != null) {
     pathPrint(node.parent);
   }
   System.out.print(node.name + " ");
 }

  public void addWeightedEdge(int i, int j, int d) {
    WeightedNode first = nodeList.get(i);
    WeightedNode second = nodeList.get(j);
    first.neighbors.add(second);
    first.weightMap.put(second,d);
  }

   // Bellman Ford Algorithm
   public void bellmanFord(WeightedNode sourceNode) {
    sourceNode.distance = 0;
    for (int i=0; i<nodeList.size(); i++) {
      for (WeightedNode currentNode : nodeList) {
        for (WeightedNode neighbor : currentNode.neighbors) {
          if(neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
            neighbor.distance = (currentNode.distance + currentNode.weightMap.get(neighbor));
            neighbor.parent = currentNode;
          }
        }
      }
    }
    System.out.println("Checking for Negative Cycle..");
    for (WeightedNode currentNode : nodeList) {
      for (WeightedNode neighbor : currentNode.neighbors ) {
        if(neighbor.distance > currentNode.distance + currentNode.weightMap.get(neighbor)) {
            System.out.println("Negative cycle found: \n");
            System.out.println("Vertex name: " + neighbor.name);
            System.out.println("Old cost: " + neighbor.distance);
            int newDistance = currentNode.distance + currentNode.weightMap.get(neighbor);
            System.out.println("new cost: " + newDistance);
            return;
          }
      }
    }
    System.out.println("Negative Cycle not found");

    for (WeightedNode nodeToCheck : nodeList) {
     System.out.print("Node " +nodeToCheck+", distance: "+nodeToCheck.distance+", Path: ");
     pathPrint(nodeToCheck);
     System.out.println();
   }


  }
}
package Algorithm.Dijkstra;

import java.util.*;

public class WeightedGraph {
  ArrayList<WeightedNode> nodeList = new ArrayList<WeightedNode>();

  public WeightedGraph(ArrayList<WeightedNode> nodeList) {
    this.nodeList = nodeList;
  }
  //Dijkstra algorithm

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
                if ( newDistance < neighbor.distance) {
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

  // Floyd Warshall algorithm
  public void floydWarshall() {
		int size = nodeList.size();
		int[][] V = new int[size][size];

		// Initializing Distance table from adjacency list
		for (int i = 0; i < size; i++) {
			WeightedNode first = nodeList.get(i);
			for (int j = 0; j < size; j++) {
				WeightedNode second = nodeList.get(j);
				if (i == j)
					V[i][j] = 0;
				else if (first.weightMap.containsKey(second)) { //we have direct edge between i & j
					V[i][j] = first.weightMap.get(second);
				} else { //no direct edge between i & j, so mark it as infinity [divided by 10 to avoid arithmetic overflow]
					V[i][j] = Integer.MAX_VALUE/10;
				}
			}
		}//end of loop


		// Floyd Warshall's Algorithm
		for (int k = 0; k < nodeList.size(); k++) {
			for (int i = 0; i < nodeList.size(); i++) {
				for (int j = 0; j < nodeList.size(); j++) {
					if (V[i][j] > V[i][k] + V[k][j]) {  // if update possible, then update path
						V[i][j] = V[i][k] + V[k][j];    // this will keep a track on path
					}
				}
			}
		}//end of loop


		// Print table of node with minimum distance and shortest path from each source
		for (int i = 0; i < size; i++) {
			System.out.print("Printing distance list for node "+nodeList.get(i)+": ");
			for (int j = 0; j < size; j++) {
				System.out.print(V[i][j]+" ");
			}
			System.out.println();
		}

	}// end of method


}
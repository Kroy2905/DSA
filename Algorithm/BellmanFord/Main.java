package Algorithm.BellmanFord;

import java.util.ArrayList;

import Algorithm.Dijkstra.WeightedGraph;
import Algorithm.Dijkstra.WeightedNode;

import java.util.*;

/**
 *                             B ------- 3 -------- >    E
 *                            ^ | \                    /   \
 *                         2 /  |   \ 1               /4     \ 9
 *                         /    |    \              /        \
 *                    A  /      |     \>     D    </         \> G
 *                        \     |6                           ^
 *                       5\     |                           /7
 *                        \     V                         /
 *                        \>   C  --------8------------>F
 * 
 * 
 * 
 * 
 */
public class Main {
    public static void main(String[] args) {
         ArrayList<WeightedNode> nodeList = new ArrayList<>();
        
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));
        nodeList.add(new WeightedNode("E", 4));
        nodeList.add(new WeightedNode("F", 5));
        nodeList.add(new WeightedNode("G", 6));
        
        WeightedGraph newGraph = new WeightedGraph(nodeList);
        
        newGraph.addWeightedEdge(0, 1, 2);  // A -> B (weight 2)
        newGraph.addWeightedEdge(0, 2, 5);  // A -> C (weight 5)
        newGraph.addWeightedEdge(1, 3, 1);  // B -> D (weight 1)
        newGraph.addWeightedEdge(1, 4, 3);  // B -> E (weight 3)
        newGraph.addWeightedEdge(2, 5, 8);  // C -> F (weight 8)
        newGraph.addWeightedEdge(3, 2, 6);  // D -> C (weight 6)
        newGraph.addWeightedEdge(3, 1, -6);  // D -> B (weight -6) // Comment this to check for shortest path 
        newGraph.addWeightedEdge(3, 4, 4);  // D -> E (weight 4)
        newGraph.addWeightedEdge(4, 6, 9);  // E -> G (weight 9)
        newGraph.addWeightedEdge(5, 6, 7);  // F -> G (weight 7)
        System.out.println("Dijkstra algorithm from source A");
        newGraph.bellmanFord(nodeList.get(0));
    }
    
}
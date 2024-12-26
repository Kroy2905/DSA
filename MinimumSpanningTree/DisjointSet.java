package MinimumSpanningTree;
import java.util.ArrayList;
import Algorithm.Dijkstra.WeightedNode;


 public class DisjointSet{

    private ArrayList<WeightedNode> nodelist = new ArrayList<>();
    public static void makeSet(ArrayList<WeightedNode> nodeList){
        for(WeightedNode node : nodeList){
            DisjointSet set = new DisjointSet();
            set.nodelist.add(node);
            node.set = set;
        }
      
    }
    public static DisjointSet findSet(WeightedNode node){
        return node.set;
    }
    public static DisjointSet  union(WeightedNode node1, WeightedNode node2){
        if(node1.set.equals(node2.set)){
            return null;
        }else{
            DisjointSet set1 = node1.set;
            DisjointSet set2 = node2.set;
           if(set1.nodelist.size()>set2.nodelist.size()){
            ArrayList<WeightedNode> nodeset2 = set2.nodelist;
            for(WeightedNode node:nodeset2){
                node.set = set1;  // setting each node's set to the new set1 and set1 is being updated simulatenouesly 
                set1.nodelist.add(node); // set1 is just being  updated ,its refernce never changes 
            }
            return set1;
           }else{
            ArrayList<WeightedNode> nodeset1 = set1.nodelist;
            for(WeightedNode node:nodeset1){
                node.set = set2;
                set2.nodelist.add(node);
            }
            return set2;
           }
        }

    }

    public void printAllNodesofThisSet(){
        System.out.println("Set of nodes: ");  // print the name of the set of nodes  // print all nodes of this set  // print all nodes of the set of nodes  // print the name of the set of nodes  // print all nodes of this set  // print all nodes of the set of nodes  // print the name of the set of nodes  // print all nodes of this set  // print all nodes of the set of nodes  // print the
        for(WeightedNode node : nodelist){
            System.out.println(node.name + " ");
        }
        System.out.println();
 
    }



 }
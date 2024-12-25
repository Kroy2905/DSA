### **Floyd-Warshall Algorithm**

The **Floyd-Warshall algorithm** is a **dynamic programming** algorithm used to find the **shortest paths between all pairs of vertices** in a **weighted graph** (both directed and undirected). It works even if the graph contains **negative edge weights**, as long as there are **no negative weight cycles**.

---

## **Key Concepts**
1. **Graph Representation:** Represented using an **adjacency matrix** \( dist[][] \).
2. **Initialization:**  
   - If there’s an edge between two vertices \( i \) and \( j \), set \( dist[i][j] \) to the weight of that edge.  
   - If there’s no edge, set \( dist[i][j] = ∞ \) (infinity).  
   - The distance from a vertex to itself is always 0 (\( dist[i][i] = 0 \)).
3. **Core Idea:**  
   For every vertex \( k \), update the distance matrix to check if a shorter path exists via vertex \( k \):  
   \[
   dist[i][j] = \min(dist[i][j], dist[i][k] + dist[k][j])
   \]

4. **Iterate over all vertices:** Repeat the above step for each vertex as an intermediate point.

---

## **Steps of Floyd-Warshall Algorithm**
1. **Initialize the distance matrix** with weights.
2. **For each vertex \( k \) (as an intermediate node):**
   - Update the distance between every pair of vertices \( i \) and \( j \) via vertex \( k \) using the formula.
3. **Return the final distance matrix.**

---

## **Diagram Example**

Consider the following graph:

```---- means -> and | means <- 
    (A)---4---(B)
     |       / |
     3     1   2
     |   /     |
    (C)-------(D)
         5
```

### **Step 1: Represent the Graph as a Distance Matrix**

|   | A   | B   | C   | D   |
|---|-----|-----|-----|-----|
| A | 0   | 4   | 3   | ∞   |
| B | ∞   | 0   | ∞   | 1   |
| C | ∞   | ∞   | 0   | 5   |
| D | ∞   | 2   | ∞   | 0   |

### **Step 2: Run Floyd-Warshall Algorithm**

- Use each vertex (A, B, C, D) as an intermediate vertex in turn.
- Update the distances using the formula.

**Intermediate Vertex: C**  
- \( dist[A][D] = \min(∞, dist[A][C] + dist[C][D]) = \min(∞, 3 + 5) = 8 \)

**Intermediate Vertex: B**  
- \( dist[A][D] = \min(8, dist[A][B] + dist[B][D]) = \min(8, 4 + 1) = 5 \)

Continue for all combinations.

### **Step 3: Final Distance Matrix**

|   | A   | B   | C   | D   |
|---|-----|-----|-----|-----|
| A | 0   | 4   | 3   | 5   |
| B | ∞   | 0   | ∞   | 1   |
| C | ∞   | ∞   | 0   | 5   |
| D | ∞   | 2   | ∞   | 0   |

This final matrix represents the shortest paths between all pairs of vertices.

---

## **Time Complexity**
- \( O(V^3) \), where \( V \) is the number of vertices.

## **Space Complexity**
- \( O(V^2) \), as it requires a distance matrix.

---

## **Advantages**
- Handles negative edge weights.
- Provides the shortest paths between **all pairs of nodes**.

## **Disadvantages**
- Not efficient for sparse graphs (where edges are significantly fewer than vertices).
- Cannot handle **negative weight cycles**.

Let me know if you'd like a Python implementation example! 🚀
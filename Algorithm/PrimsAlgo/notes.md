### Prim's Algorithm (Minimum Spanning Tree)

What is Prim's Algorithm?
Prim's Algorithm is a **greedy algorithm** used to find the Minimum Spanning Tree (MST) of a weighted, connected, and undirected graph. The MST is a subset of edges that:
- Connects all vertices without forming cycles.
- Has the minimum total edge weight among all possible spanning trees.
*Steps of Prim's Algorithm*
# Start with any vertex as the initial vertex of the MST.
# Select the minimum-weight edge that connects:
# A vertex already included in the MST.
# A vertex not yet included in the MST.
# Add the selected edge and vertex to the MST.
# Repeat steps 2 and 3 until all vertices are included in the MST.

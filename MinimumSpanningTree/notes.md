A minimum spanning tree is a subset of the **edges** of *weighted , connected and undirected* graph which
# - connects all vertices 
# - minimum total edge 
# - no cycle 

# Disjoint Set (Union-Find Data Structure)
A Disjoint Set (also known as Union-Find) is a data structure that efficiently *keeps track of a partition of a set into disjoint (non-overlapping) subsets.*

It supports two primary operations:

# Find: Determine which subset an element belongs to.
# Union: Combine two subsets into one.
This structure is widely used in applications such as graph algorithms (e.g., Kruskal’s MST, cycle detection) and network connectivity problems.

🛠️ Key Operations
### **Make-Set(x)**

Creates a new subset containing only x.
Each element starts as its own subset (its parent is itself).
### **Find(x)**

Finds and returns the root (representative) of the subset containing x.
Path Compression Optimization: Makes all nodes  point directly to the root to speed up future lookups.
# **Union(x, y)**

Merges the subsets containing x and y.
Union by Rank/Size Optimization: Attaches the smaller tree under the root of the larger tree to keep the structure shallow.

It is a greedy algorithm . 
It is used to find the MST for **weighted,undirected,graph* in 2 steps.
- Add incresing edge cost at each step 
- avoid any cycle at each step
PSeudoCode :
for each vetex (v)
makeSet(v)
sort each edge in non -descending order by weight 
for each edge (u, v)
if findSet(u) != findSet(v)
    union(u, v)
    cost = cost + edge(u, v)

Note: This algorithm assumes that the graph is connected and there are no negative weight cycles.
Time complexity = O(ElogE)
Space complexity = O(V+E)


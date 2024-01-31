A tree is non linear data structure with heirarchical relationships between the leements without having any 
cycle , it is basically a reversed form of a real life tree 
e.g.                                 Drink 
                                    /     \
                            hot                cold 
                          /\                    /\
                        tea   coffee        alcoholic  non-alcoholic  
                    /|\         /|\         /|\        /|\
             red black ginger  A B C       K F G      L P S

Properties :

-It is used to present data in heirarchical form that means as we go down it becomes more specific 
form of its parents .
-Each node has two components - data  and link to its sub category 
-There can be as many sub categor below the base category 

Why tea data structures :
 - Being a non linear Data structure , accessing elements takes less time so comptational time reduces overall 
- Store heirarchical structure suchs - folder system ,organisation heirarchy



                                            N1
                                    /                  \ 
                                N2                     N3
                            /        \                   \ 
                         N4          N5                   N6 
                         /\
                       N7  N8
                       
Termibologies :
Root - it is a node which doesnt have nay parent  - N1 
Edge - A link between a parent and a child 
Leaf - a node which does not have any children - e.g. - N6 
Sibling - 2 children of a parent = eg - N4 N5 
Ancestor - parent ,grandparent , great grandparent and so on until root - 
          e.g- ancestors of N7 is N4,N2 ,N1
Depth of a node -a length of the path from root to node . height of N4 is 2 
Height of node - length of the path from the node to the deepest node e.g. height of N3 is 1 but height of N2 i 2 
Depth of tree - Depth of root node , it is 0 because depth of root from root is 0 

BINARY TREE : 
Binary trees are data structures in which each node has at most 2 nodes , often referred to as the 
left and the right node 
- Binary tree is a family of data structure (BST , Heap tree, AVL etc ) This simply means BST and other advanced 
trees inherit the property of Binary tree 
       Below is a binary tree : 
 

                                              N1
                                    /                  \ 
                                N2                     N3
                            /        \                   \ 
                         N4          N5                   N6 
                         /\
                       N7  N8


Types of Binary Tree : 
Full Binary tree - Its binary tree where a node  can either have 2 or 0 children


                                              N1
                                    /                  \ 
                                N2                     N3
                            /        \                   
                         N4          N5                  
                         /\
                       N7  N8

Perfect Binary tree - Its a binary tree where each node  will have exactly 2 children. Children located
at the same depth should have 2 children or no children at all .

                                            N1
                                    /                  \ 
                                N2                     N3
                            /        \                  /\
                         N4          N5               N6  N7                                
                       
#Complete Binary tree#
 - Its a binary tree where all levels are completely filled except the last level 
the last level which can have nodes as left as possible . 


                                            N1                     <---- level 1 
                                    /                  \ 
                                N2                     N3          <---- level 2
                            /        \                  /\
                         N4          N5               N6  N7       <---- level 3
                         /\
                       N8  N9                                      <---- level 4
                       

                      

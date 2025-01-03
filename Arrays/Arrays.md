Arrays is a Non primitive linear data structure which stores values of a particular  data type and specific length 
Properties : 
- specific datatype 
- specific length
- each element has an unique index 
- elements of an array are  located in a contiguous 

Types of arrays : 
- one dimensional array 
- multi-dimensional array
**Important = multi dimensional arrays are located as 1D array only**
e.g. - [[0 , 1],
        [2 ,  3], --> Visual Representation . 
        [4 ,  5],
        ]

        memory Representation: 
        [0,1,2,3,4,5]   -> contiguous memory allocation 

Creating an array : 
on initialising all the array elements have default value 
-- datatype[] arr_name;
   arr_name = new datatype[size];

When to Use Arrays:

   - Sequential Access: If your data needs to be accessed sequentially and you know the size of the collection in advance, arrays can be a good choice. Elements in an array are stored in contiguous memory locations, allowing for efficient sequential access.

  -  Fixed Size: Arrays have a fixed size once they are created. If the size of your collection is known and won't change frequently, arrays are a suitable choice.

  -  Random Access: Accessing elements in an array by index is very efficient (O(1) time complexity). If your application requires frequent random access to elements, arrays are a good fit.

 -   Memory Efficiency: Arrays are memory-efficient because they store elements in a contiguous block of memory. This reduces overhead compared to some other data structures.

   - Simple Data Structures: For simple data storage needs where you don't need complex operations, arrays are easy to use and understand.

When to Avoid Arrays:

    -Dynamic Size: If the size of your collection is not known in advance or if it frequently changes, arrays may not be the best choice. You would need to use dynamic arrays or other resizable data structures.

   - Insertion/Deletion: If your application requires frequent insertions or deletions in the middle of the collection, arrays may not be the most efficient data structure. Insertions and deletions require shifting elements, resulting in O(n) time complexity.

    -Heterogeneous Data: If your collection needs to store elements of different data types, arrays in some languages (like Java or C#) may not be ideal. In such cases, you might want to use a collection that supports heterogeneity.

   - Built-in Data Structures: For more advanced data storage and retrieval needs, built-in data structures like ArrayLists, Linked Lists, HashTables, or Trees might provide better performance and flexibility than basic arrays.

    -High-Level Abstractions: If you need high-level abstractions like key-value pairs, sets, or queues, consider using data structures specifically designed for those purposes.
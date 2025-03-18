**Arrays**

Definition : An Array is a data structure that stores a collection of elements of the same data type in contiguous memory locations, allowing efficient access and manipulation of data.

*Note :* There are 2 types 
1. Primitive Array - Data is stored in contiguous memory location.
2. Non-Primitive Array - References are stored at contiguous memory location.

*Array Declaration :*
type[] array_name OR type arr_name[];
Eg : int[] arr OR int arr[];

*Initializing Array :*
type[] array_name = new type[size];

Initialize Array with Fixed Size - int[] arr = new int[20];
Initialize Array with Specific Values - int[] arr = {1,2,3,4,5};

The default values for primitive data types in array are :
0 - Numeric data Type
False - Boolean data Type
Null - Reference data Type

*Accessing Array :*
Loop traversal is required for accessing the entire set of elements present in Array Or if the position of the value is known it can be accessed via index.

Index - arr[0];
Traversal - for(int i=0; i<= arr.length; i++){
    System.out.println(arr[i]);
}

*Types of Arrays :*
1. Single Dimension or 1-D Array :
Elements are stored in linear order.
int arr[] = new int[5];

2. Multidimensional or 2-D Array :
Here we have a choice to store the data either in Row based format or Column based format. 
int arr[][] = new int[][];





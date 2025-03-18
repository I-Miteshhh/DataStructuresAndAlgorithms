# Arrays

## Definition
An **Array** is a data structure that stores a collection of elements of the same data type in contiguous memory locations, allowing efficient access and manipulation of data.

### Note:
There are 2 types of Arrays:
- **Primitive Array**: Data is stored in contiguous memory locations.
- **Non-Primitive Array**: References to objects are stored in contiguous memory locations.

## Array Declaration
`type[] array_name;` OR `type arr_name[];`

**Example:**
`int[] arr;` OR `int arr[];`

## Initializing Arrays

1. **Initialize Array with a Fixed Size**:
   `type[] array_name = new type[size];`

   **Example**:
   `int[] arr = new int[20];`

2. **Initialize Array with Specific Values**:
   `int[] arr = {1, 2, 3, 4, 5};`

### Default Values for Primitive Data Types in an Array:
- `0` for numeric data types (e.g., `int`, `float`)
- `false` for boolean data type
- `null` for reference data types (e.g., `String`, `Object`)

## Accessing Array Elements
Array elements can be accessed using their index or via loop traversal.

1. **Access by Index**:
   `arr[0];`

2. **Loop Traversal**:
   ```java
   for (int i = 0; i < arr.length; i++) {
       System.out.println(arr[i]);
   }

## Types of Arrays 

1. **Single-Dimensional Array (1-D Array)**
    In a single-dimensional array, elements are stored in a linear order.

    **Example**:
    `int[] arr = new int[5];`

2. **Multidimensional Array (2-D Array)**
    A two-dimensional array can be thought of as an array of arrays, where data can be stored either in a row-major or column-major format.

    **Example**: 
    `int[][] arr = new int[3][4];`

You can also initialize the array with specific values: int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
# Arrays in Java

## 1. What is an Array?

An **array in Java** is an object that stores a **fixed number of elements of the same data type** in **contiguous memory locations**.

---

## Creating an Array in Java

### Method 1: Array Initialization (Literal Form)

```java
int[] arr = {1, 2, 3, 4, 5};
```

### Method 2: Declare First, Then Assign Values

```java
int[] arr1 = new int[5];

arr1[0] = 1;
arr1[1] = 2;
arr1[2] = 3;
arr1[3] = 4;
arr1[4] = 5;
```

---

## Array Declaration and Creation

```java
// Declaration
int[] a;

// Creation
a = new int[5];

// Declaration + Creation
int[] a = new int[5];
```

---

## Accessing Elements of an Array

```java
import java.util.Arrays;

System.out.println(arr);                 // prints memory reference
System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

// Using for loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Using enhanced for-each loop
for (int x : arr) {
    System.out.println(x);
}
```

---

## 2. Types of Arrays in Java

There are mainly **three types of arrays** in Java.

---

### i. One-Dimensional Array

```java
int[] myArray = new int[3];
myArray[0] = 1;
myArray[1] = 2;
myArray[2] = 3;
```

| Index | 0 | 1 | 2 |
| ----- | - | - | - |
| Value | 1 | 2 | 3 |

---

### ii. Two-Dimensional Array

```java
int[][] matrix = new int[2][3];

matrix[0][0] = 1;
matrix[0][1] = 2;
matrix[0][2] = 3;
matrix[1][0] = 4;
matrix[1][1] = 5;
matrix[1][2] = 6;
```

#### Jagged Array (Rows of Different Lengths)

```java
int[][] jaggedMatrix = {
    {1, 2, 3},
    {4, 5},
    {6}
};
```

---

### iii. Multi-Dimensional Array

Arrays with **more than two dimensions**.

```java
int[][][] cube = new int[2][3][4];
```

---

## Default Values of Array Elements

| Data Type       | Default Value |
| --------------- | ------------- |
| int             | 0             |
| double          | 0.0           |
| boolean         | false         |
| char            | '\u0000'      |
| Object / String | null          |

```java
String[] names = new String[3];
System.out.println(names[0]); // null
```

---

# Searching in Arrays

## 1. Linear Search

**Time Complexity:** `O(n)`

* Checks elements **one by one**
* Works for **sorted and unsorted arrays**

```java
boolean linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return true;
        }
    }
    return false;
}
```

---

## 2. Binary Search

**Time Complexity:** `O(log n)`

* Divides search space into halves
* **Array must be sorted**

```java
import java.util.Arrays;

boolean binarySearch(int[] array, int target) {
    Arrays.sort(array);
    int low = 0, high = array.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (array[mid] == target) return true;
        else if (array[mid] < target) low = mid + 1;
        else high = mid - 1;
    }
    return false;
}
```

---

# Sorting Arrays

## 1. Bubble Sort

**Time Complexity:** `O(n²)`

* Compares adjacent elements
* Swaps if left element is greater

```java
for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
            int temp = a[j];
            a[j] = a[j + 1];
            a[j + 1] = temp;
        }
    }
}
```

---

## 2. Java Built-in Sort (Recommended)

```java
import java.util.Arrays;

int[] myArray = {12, 3, 4, 5, 7, 1, 2, 6};
Arrays.sort(myArray);

System.out.println(Arrays.toString(myArray));
// [1, 2, 3, 4, 5, 6, 7, 12]
```

---

# Array vs ArrayList

## What is an ArrayList?

An **ArrayList** is a **resizable array** that is part of the **Java Collections Framework**.

---

## Differences Between Array and ArrayList

| Feature         | Array                | ArrayList                   |
| --------------- | -------------------- | --------------------------- |
| Size            | Fixed                | Dynamic                     |
| Data Types      | Primitives + Objects | Objects only                |
| Framework       | Core Java            | Java Collections            |
| Import Required | No                   | Yes (`java.util.ArrayList`) |
| Performance     | Faster               | Slightly slower             |
| Length / Size   | `array.length`       | `arrayList.size()`          |
| Dimensions      | Multi-dimensional    | Single-dimensional          |

**Example code of ArrayList:**
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Access elements
        System.out.println(numbers.get(0)); // 10

        // Update an element
        numbers.set(1, 25); // replaces 20 with 25

        // Remove an element
        numbers.remove(2); // removes 30

        // Print the whole ArrayList
        System.out.println(numbers); // [10, 25]

        // Loop through ArrayList
        for (int x : numbers) {
            System.out.println(x);
        }

        // Size of ArrayList
        System.out.println(numbers.size()); // 2
    }
}

```
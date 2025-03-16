# 📚 Arrays in Java
- Arrays are one of the most fundamental and widely used data structures, used to store elements of the same type in a contiguous block of memory.

---

## 🧩 What is an Array?
An **array** is a linear data structure that holds a fixed-size collection of elements of the same data type.

### Syntax in Java:
```java
int[] arr = new int[5]; // Declares an array of size 5
```

---

## 🚀 Concepts Covered

### 1️⃣ Array Declaration & Initialization
```java
int[] arr = new int[5]; // Declaration
int[] arr2 = {1, 2, 3, 4, 5}; // Declaration + Initialization
```

---

### 2️⃣ Array Traversal
```java
for(int i = 0; i < arr2.length; i++) {
    System.out.println(arr2[i]);
}
```

---

### 3️⃣ Insertion at a given index
```java
int[] arr = new int[5];
arr[0] = 10;
arr[1] = 20;
arr[2] = 30;
// Insert 25 at index 2
for(int i = 3; i > 2; i--) {
    arr[i] = arr[i - 1];
}
arr[2] = 25;
```

---

### 4️⃣ Deletion from a given index
```java
int index = 2; // index to delete
for(int i = index; i < arr.length - 1; i++) {
    arr[i] = arr[i + 1];
}
arr[arr.length - 1] = 0; // Optional: Reset last element
```

---

### 5️⃣ Search an element (Linear Search)
```java
int target = 25;
boolean found = false;
for(int i = 0; i < arr.length; i++) {
    if(arr[i] == target) {
        found = true;
        System.out.println("Found at index: " + i);
        break;
    }
}
if(!found) {
    System.out.println("Element not found");
}
```

---

### 6️⃣ Reverse an array
```java
int start = 0, end = arr.length - 1;
while(start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
```

---

## ⚠️ Notes:
- Array indices start from **0** in Java.
- Arrays have a **fixed size**; to resize, you'll need to create a new array.
- You can also use enhanced for-loops:
  ```java
  for (int num : arr) {
      System.out.println(num);
  }
  ```

---

## ✅ Practice Tip:
Try creating helper methods like:
- `void insert(int[] arr, int value, int position)`
- `void delete(int[] arr, int position)`
- `void reverse(int[] arr)`

---

## 🎯 Files:
- `ArrayBasics.java`: Basic array declaration & traversal
- `ArrayOperations.java`: Insertion, deletion, search, reverse, etc.

---
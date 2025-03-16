# Singly Linked List (SLL) in Java
- Is a part of the "Collection Framework".
- It is a linear data structure. 
- Elements are not stored in a contiguous location. 
- Every element is a separate object with: 1. data part and 2. address part.
- Each element is identified as a node.

# Syntax
```java
public class SinglyLinkedList{
    private ListNode head;
        public static class ListNode{
            private int data;
            private ListNode next;
        
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
```


## 🧩 Basics and Components

### 1. `SinglyLinkedList` class
- Manages the head node of the linked list.

### 2. `ListNode` static nested class
- Represents individual nodes in the linked list.
- Each node contains:
  - An `int` data field.
  - A reference `next` to the next node.

### 3. `display()` method
- Traverses the linked list starting from the head.
- Prints each node's `data` followed by an arrow (`-->`).
- Ends with `null` to indicate the end of the list.

---

## 📄 Code for reference
``` java
public class SinglyLinkedList {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }
}
```

## 4. Next Keyword
- next is a reference variable used in the ListNode class.
- It points to the next node in the linked list, forming the chain of nodes.
- For the last node in the list, next will be null indicating the end of the list.
- Purpose of next:
    - It helps in traversing the list by moving from one node to the next.
    - It is used during insertion, deletion, and searching to navigate through the linked list.
Example:
```java
ListNode node1 = new ListNode(10);
ListNode node2 = new ListNode(20);

node1.next = node2; // node1 now points to node2
node2.next = null;  // node2 is the last node
```
Visualization:
[10 | next] --> [20 | next] --> null
In this example, node1.next points to node2.


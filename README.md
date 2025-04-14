# Java Data Structures
This repository includes handcrafted implementations of classic data structures in Java, developed without using Java's built-in collection classes (only Iterator is permitted).
# Components
### MyArrayList<T>
A custom-built, expandable array structure:

**• Features:** `add`, `get`, `remove`, `set`, `clear`, `sort`, `toArray`, `addFirst`, `addLast`, and more.

### MyLinkedList<T>
An implementation of a doubly-linked list from scratch:

**Supported operations:** `add`, `get`, `remove`, `addFirst`, `addLast`, `removeFirst`, `removeLast`, `sort`, etc.

### MyStack<T>
A Last-In-First-Out (LIFO) stack constructed using either MyArrayList or MyLinkedList:

**Core methods:** `push`, `pop`, `peek`, `isEmpty`, `size`

### MyQueue<T>
A First-In-First-Out (FIFO) queue structure built on top of MyArrayList or MyLinkedList:

**Main operations:** `enqueue`, `dequeue`, `peek`, `isEmpty`, `size`

### MyMinHeap<T>
A custom minimum heap (binary heap) developed using MyArrayList:

**Functionality includes:** `insert`, `getMin`, `extractMin`, `printHeap`, `size`

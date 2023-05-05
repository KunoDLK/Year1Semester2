# DoublyLinkedList Class

Represents a singly linked list.

- [DoublyLinkedList Class](#doublylinkedlist-class)
  - [Properties](#properties)
  - [Methods](#methods)
    - [`DoublyLinkedList(int[] data)`](#doublylinkedlistint-data)
    - [`getSize() : int`](#getsize--int)
    - [`getLast() : int`](#getlast--int)
    - [`deleteAllNodesWithValue(int obj) : int`](#deleteallnodeswithvalueint-obj--int)
    - [`deleteAtPos(int index) : boolean`](#deleteatposint-index--boolean)
    - [`reverseOrderLinkedList() : void`](#reverseorderlinkedlist--void)
    - [`appendSinglyLinkedList(SinglyLinkedList list) : void`](#appendsinglylinkedlistsinglylinkedlist-list--void)


## Properties

```java
public DoublyLinkedListNode head;
```

- `head` : Stores the first node in the list.

## Methods

### `DoublyLinkedList(int[] data)`

```java
public DoublyLinkedList(int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
                DoublyLinkedListNode n = new DoublyLinkedListNode(data[i], head,
null);
                if (head != null) {
                        head.prev = n;
                }
        head = n;
        }
}
```

Creates a new doubly linked list from an existing array.

- `data` : the array to create the new linked list from

### `getSize() : int`

```java
 public int getSize() {
        DoublyLinkedListNode currentNode = head;
        int i = 0;

        while (currentNode != null) {
                i++;
                currentNode = currentNode.next;
        }

        return i;
}
```
Gets the length of the doubly linked list.

- Returns the length

### `getLast() : int`

```java
public int getLast() {
        if (head == null)
                return -1;

        DoublyLinkedListNode currentNode = head;

        while (currentNode.next != null) {
                currentNode = currentNode.next;
        }

        return currentNode.data;
}
```

Gets the last item in the doubly linked list, or -999 if not found.

- Returns the last item, or -999 if empty

### `deleteAllNodesWithValue(int obj) : int`

```java
public int deleteAllNodesWithValue(int obj) {
        int count = 0;
        DoublyLinkedListNode current = head;

        while (current != null) {
                if (current.data == obj) {
                        if (current.prev == null && current.next == null) {
                        head = null;
                } else if (current.prev == null) { 
                        head = current.next;
                        head.prev = null;
                } else if (current.next == null) { 
                        current.prev.next = null;
                } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                }
                count++;
        }
        current = current.next; // move to the next node
        }
        return count;
}
```

Deletes all nodes with the given value, returning the number of nodes deleted.

- `obj` : the value to be deleted
- Returns the number of nodes deleted

### `deleteAtPos(int index) : boolean`

```java
public boolean deleteAtPos(int index) {
        if (head == null || index < 0)
                return false;

        if (index == 0) {
                DoublyLinkedListNode newHead = null;
                if (head.next != null) {
                        newHead = head.next;
                }
                head.next = null;
                head = null;
                if (newHead != null) {
                        head = newHead;
                        head.prev = null;
                }
                return true;
        }

        DoublyLinkedListNode toDeleteNode = head;

        for (int i = 0; i < index; i++) {
                if (toDeleteNode == null)
                        return false;
                toDeleteNode = toDeleteNode.next;
        }

        if (toDeleteNode != null) {
                DoublyLinkedListNode NextNode = null;
                DoublyLinkedListNode prevNode = toDeleteNode.prev;
                if (toDeleteNode.next != null) {
                        NextNode = toDeleteNode.next;
                }

                prevNode.next.prev = null;
                prevNode.next = null;
                toDeleteNode.next = null;

                if (NextNode != null) {
                        prevNode.next = NextNode;
                        prevNode.next.prev = prevNode;
                }

                return true;
        } else {
                return false;
        }
}
```

Deletes the node in the list at the specified index.

- `index` : the index
- Returns true if successful, otherwise false

### `reverseOrderLinkedList() : void`

```java
public void reverseOrderLinkedList() {
        DoublyLinkedListNode temp = null;
        DoublyLinkedListNode current = head;

        /* swap next and prev pointers for all nodes of
        * doubly linked list */
         while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
        }

        /* Before changing head, check for the cases like empty
        * list and list with only one node */
        if (temp != null) {
                head = temp.prev;
        }
}
```

Reverses the order of this doubly linked list.

### `appendSinglyLinkedList(SinglyLinkedList list) : void`

```java
        public void appendSinglyLinkedList(SinglyLinkedList list) {
                // ADD YOUR ANSWER HERE
        }
```

Appends a singly linked list to this doubly linked list.

- `list` : the singly linked list to append
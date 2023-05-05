# CircularLinkedList Class

This class represents a circular linked list.

- [CircularLinkedList Class](#circularlinkedlist-class)
  - [Properties](#properties)
    - [head](#head)
  - [Methods](#methods)
    - [`CircularLinkedList(int[] data)`](#circularlinkedlistint-data)
    - [`isEmpty()`](#isempty)
    - [`toString()`](#tostring)
    - [`deleteMultiplesOfThree()`](#deletemultiplesofthree)
    - [`addAfterPos(int obj, int index)`](#addafterposint-obj-int-index)
    - [`deleteMiddle()`](#deletemiddle)
    - [`addAtPos(int obj, int index)`](#addatposint-obj-int-index)
    - [`sum()`](#sum)
  - [How each method works](#how-each-method-works)
    - [`CircularLinkedList(int[] data)`](#circularlinkedlistint-data-1)
    - [`isEmpty()`](#isempty-1)
    - [`toString()`](#tostring-1)
    - [`deleteMultiplesOfThree()`](#deletemultiplesofthree-1)
    - [`addAfterPos(int obj, int index)`](#addafterposint-obj-int-index-1)
    - [`deleteMiddle()`](#deletemiddle-1)
    - [`addAtPos(int obj, int index)`](#addatposint-obj-int-index-1)
    - [`sum()`](#sum-1)


## Properties

### head

```java
public ListNode head;
```
- Stores the first node in the list. Should always be a sentinel node.

## Methods

### `CircularLinkedList(int[] data)`

```java
public CircularLinkedList(int[] data) {
        
        head = new ListNode(-999, null);
        head.next = head; 
        
        ListNode n = head;
        for (int i = 0; i < data.length; i++) {
                n.next = new ListNode(data[i], head);
        n = n.next;
        }
}
```

- Creates a new circular linked list from an existing array.
- **Parameters:**
  - `data` - the array to create the new linked list from

### `isEmpty()`

```java
public boolean isEmpty() {
        return head.next.data == -999;
}
```

- Gets whether or not the list is empty.
- **Returns:** true if list is empty, otherwise false

### `toString()`

```java
@Override
public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        ListNode current = head.next;

        while (current != head) {
                sb.append(current.data);
                
                if (current.next != head) {
                        sb.append(", ");
                }
                current = current.next;
        }
        sb.append("}");
        return sb.toString();
}
```

- Returns the list as a string of the form "{item1, item2, ...}"
- **Returns:** the resulting string

### `deleteMultiplesOfThree()`

```java
public int deleteMultiplesOfThree() {
        int count = 0;
        ListNode current = head.next;
        ListNode prev = head;
        while (current != head) {
                if (current.data % 3 == 0) {
                        prev.next = current.next;
                        count++;
                } else {
                        prev = current;
                }
                current = current.next;
        }
        return count;
}
```
- Deletes any node containing a value that is a multiple of three.
- **Returns:** the number of nodes deleted

### `addAfterPos(int obj, int index)`

```java
public boolean addAfterPos(int obj, int index) {
        ListNode current = head.next;
        int pos = 0;
        while (current != head && pos < index) {
                current = current.next;
                pos++;
        }
        if (pos == index) {
                ListNode newNode = new ListNode(obj, current.next);
                current.next = newNode;
                return true;
        }
        return false;
}
```

- Adds an item after a specified index in the list.
- **Parameters:**
  - `obj` - the item to add
  - `index` - the index
- **Returns:** true if successful, otherwise false

### `deleteMiddle()`

```java
public boolean deleteMiddle() {
        ListNode slow = head.next;
        ListNode fast = head.next;
        ListNode prev = head;

        while (fast != head && fast.next != head) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
        }
        if (slow != head) {
                prev.next = slow.next;
                return true;
        }
        return false;
}
```

- Deletes the middle element from the list, rounding the index down in case the list has an even number of items.
- **Returns:** true on successful delete, otherwise false

### `addAtPos(int obj, int index)`

```java
public boolean addAtPos(int obj, int index) {
        ListNode current = head.next;
        int pos = 0;
        while (current != head && pos < index - 1) {
                current = current.next;
                pos++;
        }
        if (pos == index - 1) {
                ListNode newNode = new ListNode(obj, current.next);
                current.next = newNode;
                return true;
        }
        return false;
}
```

- Adds a piece of data at the specified index.
- **Parameters:**
  - `obj` - the data
  - `index` - the index
- **Returns:** true on successful insert, otherwise false

### `sum()`

```java
public int sum() {
        int sum = 0;
        ListNode current = head.next;
        while (current != head) {
                sum += current.data;
                current = current.next;
        }
        return sum;
}
```

- Returns the sum of all integers in the list.
- **Returns:** the sum

---
## How each method works

### `CircularLinkedList(int[] data)`

- This constructor creates a new circular linked list from an existing array.
- It creates a sentinel node with a value of -999, and sets its next pointer to itself.
- Then it iterates through the given array, and for each item it creates a new node with that value, and sets its next pointer to the sentinel node.
- Finally, it sets the last node's next pointer to the sentinel node.

### `isEmpty()`

- This method checks if the list is empty.
- It does this by checking if the sentinel node's next pointer is pointing to itself (i.e. the list is empty).

### `toString()`

- This method returns the list as a string of the form "{item1, item2, ...}".
- It does this by iterating through the list and appending each item to a StringBuilder, with a comma and space between each item.
- Finally, it wraps the StringBuilder's contents with curly braces and returns the resulting string.

### `deleteMultiplesOfThree()`

- This method deletes any node containing a value that is a multiple of three.
- It does this by iterating through the list, and for each node it checks if its value is a multiple of three.
- If it is, it sets the previous node's next pointer to the current node's next pointer, effectively removing the current node from the list.
- It returns the number of nodes deleted.

### `addAfterPos(int obj, int index)`

- This method adds an item after a specified index in the list.
- It does this by iterating through the list until it reaches the specified index, and then creating a new node with the given value and setting its next pointer to the next node.
- Then it sets the current node's next pointer to the new node.
- If the specified index is out of bounds, it returns false.

### `deleteMiddle()`

- This method deletes the middle element from the list, rounding the index down in case the list has an even number of items.
- It does this by iterating through the list with two pointers, one moving one step at a time and the other moving two steps at a time.
- When the faster pointer reaches the end of the list, the slower pointer will be pointing to the middle node.
- Then it sets the previous node's next pointer to the middle node's next pointer, effectively removing the middle node from the list.
- If the list has an even number of items, it will delete the first middle node it encounters.
- If the list has less than three items, it will not delete anything.
- It returns true on successful delete, otherwise false.

### `addAtPos(int obj, int index)`

- This method adds a piece of data at the specified index.
- It does this by iterating through the list until it reaches the node before the specified index, and then creating a new node with the given value and setting its next pointer to the next node.
- Then it sets the current node's next pointer to the new node.
- If the specified index is out of bounds, it returns false.

### `sum()`

- This method returns the sum of all integers in the list.
- It does this by iterating through the list and adding each node's value to a running total.
- Finally, it returns the total.
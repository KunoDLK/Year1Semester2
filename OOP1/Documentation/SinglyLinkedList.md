# SinglyLinkedList Class

This class represents a singly linked list. It consists of various methods that perform different operations on the linked list.

- [SinglyLinkedList Class](#singlylinkedlist-class)
  - [Constructor Methods](#constructor-methods)
    - [`public SinglyLinkedList(int[] data)`](#public-singlylinkedlistint-data)
    - [`public SinglyLinkedList()`](#public-singlylinkedlist)
  - [Public Methods](#public-methods)
    - [`public void addFirst(int val)`](#public-void-addfirstint-val)
    - [`public int getFirst()`](#public-int-getfirst)
    - [`public int getAtPos(int index)`](#public-int-getatposint-index)
    - [`public void addLast(int obj)`](#public-void-addlastint-obj)
    - [`public boolean addAfterPos(int obj, int index)`](#public-boolean-addafterposint-obj-int-index)
    - [`public boolean deleteWithValue(int obj)`](#public-boolean-deletewithvalueint-obj)
    - [`public SinglyLinkedList cloneLinkedList()`](#public-singlylinkedlist-clonelinkedlist)


## Constructor Methods

### `public SinglyLinkedList(int[] data)`

This constructor method creates a new singly linked list from an existing array. It takes an integer array as a parameter and populates the linked list with the elements of the array in reverse order.

### `public SinglyLinkedList()`

This constructor method creates a new, empty singly linked list. It calls the previous constructor with an empty integer array.

## Public Methods

### `public void addFirst(int val)`

This method adds an item at the front of the list. It takes an integer value as a parameter and creates a new `ListNode` object with the given value. The `next` field of the new node is set to the current `head` of the list, and the `head` field is updated to point to the new node.

### `public int getFirst()`

This method returns the first item in the list. If the list is empty, it returns -999. Otherwise, it returns the `data` field of the first `ListNode` object in the list.

### `public int getAtPos(int index)`

This method gets the item at the specified index in the list. It takes an integer index as a parameter and returns the `data` field of the `ListNode` object at that index. If the index is not found in the list, it returns -999.

### `public void addLast(int obj)`

This method adds an item to the end of the list. It takes an integer value as a parameter and creates a new `ListNode` object with the given value. If the list is empty, it sets the `head` field to the new node. Otherwise, it iterates through the list until it reaches the last `ListNode` object and sets its `next` field to the new node.

### `public boolean addAfterPos(int obj, int index)`

This method adds an item after a specified index in the list. It takes an integer value and an index as parameters. It iterates through the list until it reaches the `ListNode` object at the given index. It then creates a new `ListNode` object with the given value and sets its `next` field to the `next` field of the current `ListNode` object. Finally, it sets the `next` field of the current `ListNode` object to the new node. If the index is not found in the list, it returns false. Otherwise, it returns true.

### `public boolean deleteWithValue(int obj)`

This method deletes the first item in the list with the given value. It takes an integer value as a parameter and iterates through the list until it finds the first `ListNode` object with a `data` field equal to the given value. It then updates the `next` field of the previous `ListNode` object to skip over the current node. If the value is not found in the list, it returns false. Otherwise, it returns true.

### `public SinglyLinkedList cloneLinkedList()`

This method returns a copy of the linked list. It creates a new, empty `SinglyLinkedList` object and iterates through the original list, adding each `ListNode` object to the new list using the `addLast()` method. It then returns the new list.
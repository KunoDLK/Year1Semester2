package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 */
public class SinglyLinkedList {
    
    /**
     * Stores the first node in the list.
     */
    public ListNode head;
    
    /**
     * Creates a new singly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public SinglyLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        // Populate list.
        for (int i = data.length - 1; i >= 0; i--) {
            head = new ListNode(data[i], head);
        }
    }
    
    /**
     * Creates a new, empty singly linked list.
     */
    public SinglyLinkedList() {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        this(new int[] {});
    }
    
    /**
     * Adds an item at the front of the list.
     * @param val   the item to add
     */
    public void addFirst(int val) {
      ListNode newNode = new ListNode(val);
      newNode.next = head;
      head = newNode;
    }
    
    /**
     * Returns the first item in the list.
     * @return val  the first item in the list, or -999 if empty
     */
    public int getFirst() {
        if (head == null) {
            return -999;
        }
        return head.data;      
    }
    
    /**
    * Gets the item at the specified index in the list.
    * @param index the index
    * @return    the item, or -999 if not found
    */
    public int getAtPos(int index) {
        // assign the head node of the linked list to variable current
        ListNode current = head;
        // initialize count variable to 0
        int count = 0;
        // iterate through each node in the linked list
        while (current != null) {
            // check if current node is at the specified index 
            if (count == index) {
                // return the data of the current node
                return current.data;
            }
            // increment the count and move on to the next node in the linked list
            count++;
            current = current.next;
        }
        // return a default value of -999 if the index is not found in the linked list
        return -999;
    }
    
    
    /**
     * Adds an item to the end of the list.
     * @param obj   the item
     */
    public void addLast(int obj) {
        ListNode newNode = new ListNode(obj);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    /**
     * Adds an item after a specified index in the list.
     * @param obj   the item to add
     * @param index the index
     * @return      true if successful, otherwise false
     */
    public boolean addAfterPos(int obj, int index) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                ListNode newNode = new ListNode(obj);
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            count++;
            current = current.next;
        }
        return false;
    }
    
    /**
     * Deletes the first item in the list with the given value.
     * @param obj   the value to seek
     * @return      true if an item was deleted, otherwise false
     */
    public boolean deleteWithValue(int obj) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (current.data == obj) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
    
    /**
     * Returns a copy of this linked list.
     * @return  the copy
     */
    public SinglyLinkedList cloneLinkedList() {
        SinglyLinkedList clonedList = new SinglyLinkedList();
        ListNode current = head;
        while (current != null) {
            clonedList.addLast(current.data);
            current = current.next;
        }
        return clonedList;
    }
}
package uk.ac.tees.linkedlistica;

/**
 * Represents a circular linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 */
public class CircularLinkedList {
    
    /**
     * Stores the first node in the list. Should always be a sentinel node.
     */
    public ListNode head;
    
    /**
     * Creates a new circular linked list from an existing array.
     *
     * @param data  the array to create the new linked list from
     */
    public CircularLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
        
        // The head is a sentinel node.
        head = new ListNode(-999, null);
        head.next = head; // Complete the circle.
        
        // Populate list.
        ListNode n = head; // The last item in the circle.
        for (int i = 0; i < data.length; i++) {
            n.next = new ListNode(data[i], head);
            n = n.next;
        }
    }

    /**
     * Gets whether or not the list is empty.
     * @return  true if list is empty, otherwise false
     */
    public boolean isEmpty() {
        return head.next.data == -999;
    }
    

    /**
     * Returns the list as a string of the form "{item1, item2, ...}"
     * @return  the resulting string
     */
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
    
    /**
     * Deletes any node containing a value that is a multiple of three.
     * @return 
     */
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
    
    /**
     * Adds an item after a specified index in the list.
     * @param obj   the item to add
     * @param index the index
     * @return      true if successful, otherwise false
     */
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
    
    /**
     * Deletes the middle element from the list, rounding the index down in case
     * the list has an even number of items.
     * @return  true on successful delete, otherwise false
     */
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
    
    /**
     * Adds a piece of data at the specified index.
     * @param obj   the data
     * @param index the index
     * @return      true on successful insert, otherwise false
     */
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
    
    /**
     * Returns the sum of all integers in the list.
     * @return  the sum
     */
    public int sum() {
        int sum = 0;
        // Start at the head
        ListNode current = head.next;
        while (current != head) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }
}
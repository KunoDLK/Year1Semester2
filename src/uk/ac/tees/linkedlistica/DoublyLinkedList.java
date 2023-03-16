package uk.ac.tees.linkedlistica;

/**
 * Represents a singly linked list.
 * @author Your Name (X0000000@tees.ac.uk)
 */
public class DoublyLinkedList {
    
    /**
     * Stores the first node in the list.
     */
    public DoublyLinkedListNode head;
      
    /**
     * Creates a new doubly linked list from an existing array.
     * @param data  the array to create the new linked list from
     */
    public DoublyLinkedList(int[] data) {
        
        // DO NOT MODIFY THIS CONSTRUCTOR.
           
        for (int i = data.length - 1; i >= 0; i--) {
            DoublyLinkedListNode n = new DoublyLinkedListNode(data[i], head, 
                    null);
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
    }
    
    /**
     * Gets the length of the doubly linked list.
     * @return  the length
     */
    public int getSize() {
         DoublyLinkedListNode currentNode = head;
        int i = 0;

        while (currentNode != null) {
            i++;
            currentNode = currentNode.next;
        }

        return i;
    }
    
    /**
     * Gets the last item in the doubly linked list, or -999 if not found.
     * @return  the last item, or -999 if empty
     */
    public int getLast() {
        if (head == null)
            return 999;

        DoublyLinkedListNode currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }
    
    /**
     * Deletes all nodes with the given value, returning the number of nodes
     * deleted.
     * @param obj   the value
     * @return      the number of nodes deleted
     */
    public int deleteAllNodesWithValue(int obj) {
        //ADD YOUR ANSWER HERE
        return -1;
    }
    
    /**
     * Deletes the node in the list at the specified index.
     * @param index the index
     * @return      true if successful, otherwise false
     */
    public boolean deleteAtPos(int index) {
        //ADD YOUR ANSWER HERE
        return false;
    }
    
    /**
     * Reverses the order of this doubly linked list.
     */
    public void reverseOrderLinkedList() {
        //ADD YOUR ANSWER HERE
    }
    
    /**
     * Appends a singly linked list to this doubly linked list.
     * @param list  the singly linked list to append
     */
    public void appendSinglyLinkedList(SinglyLinkedList list) {
       //ADD YOUR ANSWER HERE
    }
}

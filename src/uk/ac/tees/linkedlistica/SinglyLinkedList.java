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
      //ADD YOUR ANSWER HERE
      
    }
    
    /**
     * Returns the first item in the list.
     * @return val  the first item in the list, or -999 if empty
     */
  //  public int getFirst() {
        //ADD YOUR ANSWER HERE      
  //  }
    
    /**
     * Gets the item at the specified index in the list.
     * @param index the index
     * @return      the item, or -999 if not found
     */
  //  public int getAtPos(int index) {
        //ADD YOUR ANSWER HERE
  //  }
    
    /**
     * Adds an item to the end of the list.
     * @param obj   the item
     */
    public void addLast(int obj) {
        //ADD YOUR ANSWER HERE
    }
    
    /**
     * Adds an item after a specified index in the list.
     * @param obj   the item to add
     * @param index the index
     * @return      true if successful, otherwise false
     */
 //   public boolean addAfterPos(int obj, int index) {
        //ADD YOUR ANSWER HERE
 //   }
    
    /**
     * Deletes the first item in the list with the given value.
     * @param obj   the value to seek
     * @return      true if an item was deleted, otherwise false
     */
  //  public boolean deleteWithValue(int obj) {
        //ADD YOUR ANSWER HERE
 //   }
    
    /**
     * Returns a copy of this linked list.
     * @return  the copy
     */
 //   public SinglyLinkedList cloneLinkedList() {
        //ADD YOUR ANSWER HERE
 //   }
}

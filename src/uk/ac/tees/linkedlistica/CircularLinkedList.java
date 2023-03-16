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
  //  public boolean isEmpty() {
        //ADD YOUR ANSWER HERE
  //  }

    /**
     * Returns the list as a string of the form "{item1, item2, ...}"
     * @return  the resulting string
     */
  /**  @Override  //you need the @Override instruction. Make sure you uncomment it when testing your methods.
    public String toString() {
        //ADD YOUR ANSWER HERE
   }*/
    
    /**
     * Deletes any node containing a value that is a multiple of three.
     * @return 
     */
   // public int deleteMultiplesOfThree() {
        //ADD YOUR ANSWER HERE
  //  }
    
    /**
     * Adds an item after a specified index in the list.
     * @param obj   the item to add
     * @param index the index
     * @return      true if successful, otherwise false
     */
  //  public boolean addAfterPos(int obj, int index) {
       //ADD YOUR ANSWER HERE
  //  }
    
    /**
     * Deletes the middle element from the list, rounding the index down in case
     * the list has an even number of items.
     * @return  true on successful delete, otherwise false
     */
 //   public boolean deleteMiddle() {
        //ADD YOUR ANSWER HERE
  //  }
    
    /**
     * Adds a piece of data at the specified index.
     * @param obj   the data
     * @param index the index
     * @return      true on successful insert, otherwise false
     */
  //  public boolean addAtPos(int obj, int index) {
       //ADD YOUR ANSWER HERE
  //  }
    
    /**
     * Returns the sum of all integers in the list.
     * @return  the sum
     */
  //  public int sum() {
       //ADD YOUR ANSWER HERE
   // }
}

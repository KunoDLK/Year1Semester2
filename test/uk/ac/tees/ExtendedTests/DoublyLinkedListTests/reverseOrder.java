/** deleteAtPoTest.java
 * program to unit-test the reverseOrder method of class DoublyLinkedList
 */
package DoublyLinkedListTests;

import org.junit.Test;

import static org.junit.Assert.*;
import uk.ac.tees.linkedlistica.*;;

public class reverseOrder {
        // Test to check if an empty list is reversed correctly
        @Test
        public void testReverseOrderLinkedListEmptyList() {
                DoublyLinkedList list = new DoublyLinkedList(new int[]{});

                list.reverseOrderLinkedList();               
        }

        // Test to check if a single element list is reversed correctly
@Test
public void testReverseOrderLinkedListSingleElement() {
        DoublyLinkedList list = new DoublyLinkedList(new int[]{1});

        list.reverseOrderLinkedList();
        assertEquals(1, list.head.data);
}
// Test to check if the 'head' variable is pointing to the correct node 
@Test
public void testReverseOrderLinkedListHead() {
        DoublyLinkedList list = new DoublyLinkedList(new int[]{1, 2, 3});

        list.reverseOrderLinkedList();
        assertEquals(3, list.head.data);
}

// Test to check if the 'next' and 'previous' variables are pointing to the correct nodes 
@Test
public void testReverseOrderLinkedListNextAndPrevious() {
        DoublyLinkedList list = new DoublyLinkedList(new int[]{1, 2, 3});

        list.reverseOrderLinkedList();
        assertEquals(2, list.head.next.data);
        assertEquals(null, list.head.prev);
}
}
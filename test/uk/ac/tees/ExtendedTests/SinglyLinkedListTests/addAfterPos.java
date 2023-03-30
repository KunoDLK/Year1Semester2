package SinglyLinkedListTests;

import static org.junit.Assert.*;
import org.junit.Test;

import uk.ac.tees.linkedlistica.ListNode;
import uk.ac.tees.linkedlistica.SinglyLinkedList;;

public class addAfterPos {
 
/**
     * Converts a singly linked list to an array.
     * 
     * @param list  the list to convert
     * @return      the converted list
     */
    private static int[] singlyLinkedListToArray(SinglyLinkedList list) {
        // Gauge size.
        int n = 0;
        ListNode c = list.head;
        while (c != null) {
            n++;
            c = c.next;
        }
        // Copy to int array.
        int[] arr = new int[n];
        c = list.head;
        int i = 0;
        while (c != null) {
            arr[i++] = c.data;
            c = c.next;
        }
        return arr; // Return result.
    }

    /**
     * Test of addAfterPos method, of class SinglyLinkedList.
     */
    @Test
    public void testAddAfterPos() {
        // Create instance, insert 3 and 6 at third and fourth position.
        SinglyLinkedList instance = new SinglyLinkedList(new int[] {2, 4, 6});
        boolean success = instance.addAfterPos(3, 1) 
                && instance.addAfterPos(6, 2);
        assertTrue("True should return on success.", success);
        boolean failure = instance.addAfterPos(6, 99);
        assertFalse("False should return on failure.", failure);
        // Compare to expected.
        assertArrayEquals("Items should be correctly added.", 
                new int[] {2, 4, 3, 6, 6}, singlyLinkedListToArray(instance));
    }
    
    /**
     * Test of addAfterPos method with empty list, of class SinglyLinkedList.
     */
    @Test
    public void testAddAfterPosEmptyList() {
        // Create instance, insert 3 at first position.
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean success = instance.addAfterPos(3, 0);
        assertFalse("false should return on fail.", success);
    }
    
    /**
     * Test of addAfterPos method with negative position, of class SinglyLinkedList.
     */
    @Test
    public void testAddAfterPosNegativePosition() {
        // Create instance, insert 3 at first position.
        SinglyLinkedList instance = new SinglyLinkedList();
        boolean failure = instance.addAfterPos(3, -1);
        assertFalse("False should return on failure.", failure);
        // Compare to expected.
        assertArrayEquals("Items should not be added.", 
                new int[] {}, singlyLinkedListToArray(instance));
    }
}